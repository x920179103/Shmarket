package com.yc.shmarket.biz;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.yc.shmarket.mapper.AddressesMapper;
import com.yc.shmarket.mapper.UsersMapper;
import com.yc.shmarket.pojo.Addresses;
import com.yc.shmarket.pojo.AddressesExample;
import com.yc.shmarket.pojo.Users;
import com.yc.shmarket.pojo.UsersExample;
import com.yc.shmarket.pojo.UsersExample.Criteria;
import com.yc.shmarket.util.MD5;

@Service
public class UserBiz {

	@Resource
	private UsersMapper um;

	private UsersExample ue = new UsersExample();

	@Resource
	private AddressesMapper am;
	
	private AddressesExample ae;
	
	private String md5Key; // 秘钥
	
	MD5 m = new MD5();
	
	public List<Addresses> addressFindAll(int uid,HttpSession session) {
		ae.createCriteria().andUidEqualTo(uid);
		List<Addresses> addresses= am.selectByExample(ae);
		session.setAttribute("addresses", addresses);
		return addresses;
	}

	public boolean confirmNewPwd(HttpSession session,String upwd) {
		try {
			String uname = (String)session.getAttribute("userNameRpwd");
			Users user = new Users();
			String mpwd = m.md5(upwd, uname);
			user.setUpwd(mpwd);
			ue.createCriteria().andUnameEqualTo(uname);
			um.updateByExampleSelective(user, ue);
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	
	public Users register(Users u) throws Exception {
		md5Key = u.getUname();
		String upwd = u.getUpwd();
		String ciphertext = m.md5(upwd, md5Key);
		u.setUpwd(ciphertext);
		um.insertSelective(u);
		return u;
	}

	public Users login(String uname, String upwd, String code, HttpSession session) throws Exception {
		md5Key = uname;
		String ciphertext = m.md5(upwd, md5Key);

		UsersExample ue = new UsersExample();
		ue.createCriteria().andUnameEqualTo(uname).andUpwdEqualTo(ciphertext);
		List<Users> list = um.selectByExample(ue);
		if (list.size() == 0) {
			throw new BizException("用户名或密码错误！");
		}

		String randomcode_key = (String) session.getAttribute("randomcode_key");
		if (!code.equals(randomcode_key)) {
			throw new BizException("验证码错误！");
		}
		return list.get(0);
	}
	
	public boolean checkUname(String uname) {
		ue.createCriteria().andUnameEqualTo(uname);
		List<Users> list = um.selectByExample(ue);
		if (list.size() > 0) {
			return false;
		}
		return true;
	}
	
	public boolean checkUnameByUemail(String uname,String uemail) {
		List<Users> list = new LinkedList<Users>();
		ue.createCriteria().andUnameEqualTo(uname).andUemailEqualTo(uemail);
		list = um.selectByExample(ue);
		ue.clear();
		if (list.isEmpty()) {
			return false;
		}
		return true;
	}
	
	public int randomCode() {
		Random r=new Random();
		int sendCode = r.nextInt(9001) + 1000;
		return sendCode;
	}
	
	@Autowired
	private JavaMailSender mailSender;
	@Value("${mail.fromMail.addr}")
	private String from;
	
	public void sendMail(String to, String subject,String content) {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom(from);
		message.setTo(to);
		message.setSubject(subject);
		message.setText(content);
		mailSender.send(message);
	}
	
}