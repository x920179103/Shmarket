package com.yc.shmarket.adminservice.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yc.shmarket.adminservice.AdminService;
import com.yc.shmarket.mapper.AdminMapper;
import com.yc.shmarket.pojo.Admin;
@Service
public class AdminServiceImpl implements AdminService{

	@Resource
	private AdminMapper adminMapper;

	@Override
	public Admin findByAdminName(String ausename) {
		// TODO Auto-generated method stub
		return adminMapper.findByAdminName(ausename);
	}


}
