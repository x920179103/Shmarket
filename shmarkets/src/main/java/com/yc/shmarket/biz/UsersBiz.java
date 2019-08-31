package com.yc.shmarket.biz;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yc.shmarket.mapper.UsersMapper;
import com.yc.shmarket.pojo.Users;
import com.yc.shmarket.pojo.UsersExample;
@Service
public class UsersBiz {
	
	@Resource
	private UsersMapper um;
	
	//根据session中的用户名查询用户id
	public int queryUid(String uname){
		UsersExample ue=new UsersExample();
		ue.createCriteria().andUnameEqualTo(uname);
		List<Users> list=um.selectByExample(ue);
		return list.get(0).getUid();
	}
}
