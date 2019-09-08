package com.yc.shmarket.mapper;

import com.yc.shmarket.pojo.Admin;
import com.yc.shmarket.pojo.AdminExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
public interface AdminMapper {


	 long countByExample(AdminExample example);

	 int deleteByExample(AdminExample example);

	 int deleteByPrimaryKey(Integer id);
	
	 int delete(String ids);
	 int insert(Admin record);

	 int insertSelective(Admin record);


	 Admin selectByPrimaryKey(Integer aid);

	 int updateByExampleSelective(@Param("record") Admin record, @Param("example") AdminExample example);

	 int updateByExample(@Param("record") Admin record, @Param("example") AdminExample example);

	 int updateByPrimaryKeySelective(Admin record);

	 int updateByPrimaryKey(Admin record);

	public List<Admin> selectByExample(AdminExample example);

	public List<Admin> selectadminBySelectCriteria(String selectCriteria, String[] selectString);

	public Admin findByAdminName(String ausename);
}