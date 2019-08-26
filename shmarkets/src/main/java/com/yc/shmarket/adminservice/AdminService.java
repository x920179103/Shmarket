package com.yc.shmarket.adminservice;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.yc.shmarket.pojo.Admin;

@Service
public interface AdminService {
	public Admin findByAdminName(String ausename);

}
