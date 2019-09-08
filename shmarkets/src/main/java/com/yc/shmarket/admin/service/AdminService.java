package com.yc.shmarket.admin.service;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageInfo;
import com.yc.shmarket.pojo.Admin;
import com.yc.shmarket.pojo.AdminExample;

@Service
public interface AdminService {
	
	PageInfo<Admin> AdminList(Integer pageNum, Integer pageSize);
	public Admin findByAdminName(String ausename);
	
	public long countByExample(AdminExample example);

	public int deleteByExample(AdminExample example);

	public void deleteByPrimaryKey(Integer[] id);
	

	public int insert(Admin record);

	public int insertSelective(Admin record);

	public List<Admin> selectByExample(AdminExample example);

	public Admin selectByPrimaryKey(Integer aid);

	public int updateByExampleSelective(@Param("record") Admin record, @Param("example") AdminExample example);

	public int updateByExample(@Param("record") Admin record, @Param("example") AdminExample example);

	public int updateByPrimaryKeySelective(Admin record);

	public int updateByPrimaryKey(Admin record);
	
	public int delete(String ids);
	void deleteadmin(Integer[] aid);
	PageInfo<Admin> selectadminBySelectCriteria(Integer pageNum, Integer pageSize, String selectCriteria,
			String[] selectString);

}
