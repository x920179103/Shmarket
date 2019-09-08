package com.yc.shmarket.admin.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yc.shmarket.admin.service.AdminService;
import com.yc.shmarket.mapper.AdminMapper;
import com.yc.shmarket.pojo.Admin;
import com.yc.shmarket.pojo.AdminExample;
@Service
public class AdminServiceImpl implements AdminService{
	 private final AdminMapper adminMapper;

	    @Autowired
	    public AdminServiceImpl(AdminMapper adminMapper) {
	        this.adminMapper = adminMapper;
	    }




	@Override
	public long countByExample(AdminExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByExample(AdminExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	

	@Override
	public int insert(Admin record) {
		// TODO Auto-generated method stub
		return adminMapper.insert(record);
	}

	@Override
	public int insertSelective(Admin record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Admin> selectByExample(AdminExample example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Admin selectByPrimaryKey(Integer aid) {
		// TODO Auto-generated method stub
		return adminMapper.selectByPrimaryKey(aid);
	}

	@Override
	public int updateByExampleSelective(Admin record, AdminExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByExample(Admin record, AdminExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKeySelective(Admin record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(Admin admin) {
		// TODO Auto-generated method stub
		System.out.println(admin.getAid());
		return adminMapper.updateByPrimaryKey(admin);
	}


	@Override
	public int delete(String ids) {
		// TODO Auto-generated method stub
		return adminMapper.delete(ids);
	}

	@Override
	public PageInfo<Admin> AdminList(Integer pageNum, Integer pageSize) {
		AdminExample example = new AdminExample();
	        PageHelper.startPage(pageNum,pageSize);
	        List<Admin> admin = adminMapper.selectByExample(example);
	        return new PageInfo<>(admin);
	}




	@Override
	public Admin findByAdminName(String ausename) {
		// TODO Auto-generated method stub
		return adminMapper.findByAdminName(ausename);
	}




	@Override
	public void deleteByPrimaryKey(Integer[] id) {
		 System.out.println(id+"0000000000000000000000");
		 for (Integer aid:id) {
			 System.out.println(id);
	            adminMapper.deleteByPrimaryKey(aid);
	        }
	}




	@Override
	public void deleteadmin(Integer[] aid) {
		// TODO Auto-generated method stub
		for(Integer aids:aid) {
			
			adminMapper.deleteByPrimaryKey(aids);
		}
	}




	@Override
	public PageInfo<Admin> selectadminBySelectCriteria(Integer pageNum, Integer pageSize, String selectCriteria,
			String[] selectString) {
		  if(selectString == null) {
	            //默认按以下关键字进行搜索
	            selectString = new String[]{"ausename","aname","aemail","alevel","aphone"};
	        }
	        if(!"".equals(selectCriteria.trim())) {
	            PageHelper.startPage(pageNum,pageSize);
	            List<Admin> admin = adminMapper.selectadminBySelectCriteria(selectCriteria,selectString);
	            return new PageInfo<>(admin);
	        }else {
	            return null;
	        }
	}




	


}
