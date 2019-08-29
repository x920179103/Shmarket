package com.yc.shmarket.biz;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

import com.yc.shmarket.mapper.UsersMapper;
import com.yc.shmarket.pojo.Users;
import com.yc.shmarket.pojo.UsersExample;
import com.yc.shmarket.util.MD5;

@Service
public class UserBiz {

	@Resource
	private UsersMapper um;
	
//	private static final String MD5_KEY = "Second-hand trading market";
	private String md5Key;  //秘钥
	
	public Users register(Users u) throws Exception {
		md5Key = u.getUname();
		String upwd = u.getUpwd();
		MD5 m = new MD5();
		String ciphertext = m.md5(upwd,md5Key);
		u.setUpwd(ciphertext);
		um.insertSelective(u);
		return u;
	}
	
	public boolean checkUname(String uname) {
		UsersExample ue = new UsersExample();
		ue.createCriteria().andUnameEqualTo(uname);
		List<Users> list = um.selectByExample(ue);
		if(list.size() > 0) {
			return false;
		}
		return true;
	}
	
	public Users login(String uname,String upwd, String code, HttpSession session) throws Exception{
		md5Key = uname;
		MD5 m = new MD5();
		String ciphertext = m.md5(upwd,md5Key);
		
		UsersExample ue = new UsersExample();
		ue.createCriteria().andUnameEqualTo(uname).andUpwdEqualTo(ciphertext);
		List<Users> list=um.selectByExample(ue);
		if(list.size()==0){
			throw new BizException("用户名或密码错误！");
		}
		
		String randomcode_key = (String) session.getAttribute("randomcode_key");
		if(!code.equals(randomcode_key)) {
			throw new BizException("验证码错误！");
		}
		return list.get(0);
	}
}