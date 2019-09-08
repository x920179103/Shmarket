package com.yc.shmarket.mapper;

import com.yc.shmarket.pojo.Admin;
import com.yc.shmarket.pojo.Users;
import com.yc.shmarket.pojo.UsersExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface UsersMapper {
    long countByExample(UsersExample example);

    int deleteByExample(UsersExample example);

    int deleteByPrimaryKey(Integer uid);

    int insert(Users record);

    int insertSelective(Users record);

    List<Users> selectByExample(UsersExample example);

    Users selectByPrimaryKey(Integer uid);

    int updateByExampleSelective(@Param("record") Users record, @Param("example") UsersExample example);

    int updateByExample(@Param("record") Users record, @Param("example") UsersExample example);

    int updateByPrimaryKeySelective(Users record);
    List<Users> selectUsersTitleList(Users record);
    
    int updateByPrimaryKey(Users record);

	public List<Users> selectadminBySelectCriteria(String selectCriteria, String[] selectString);

	public Users findByAdminName(String uname);
}