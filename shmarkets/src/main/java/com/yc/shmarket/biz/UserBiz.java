package com.yc.shmarket.biz;

import java.awt.image.BufferedImage;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yc.shmarket.mapper.UsersMapper;
import com.yc.shmarket.pojo.Users;
import com.yc.shmarket.pojo.UsersExample;

@Service
public class UserBiz {

	@Resource
	private UsersMapper um;
	
	
	public Users register(Users u) {
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
	
	public Users login(Users u) throws BizException {
		UsersExample ue = new UsersExample();
		ue.createCriteria().andUnameEqualTo(u.getUname()).andUpwdEqualTo(u.getUpwd());
		List<Users> list=um.selectByExample(ue);
		if(list.size()==0){
			throw new BizException("用户名或密码错误！");
		}
		return list.get(0);
	}

	public void testVerifyCode() throws IOException{
		String path = "D:\\1.jpg";
		FileOutputStream out = new FileOutputStream(path);
		VerifyCode vc = new VerifyCode();
		BufferedImage bi = vc.getImage();
		vc.output(bi, out);
		System.out.println(vc.getText());
	}
	
}
