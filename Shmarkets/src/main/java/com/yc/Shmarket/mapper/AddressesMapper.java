package com.yc.Shmarket.mapper;

import com.yc.Shmarket.pojo.Addresses;
import com.yc.Shmarket.pojo.AddressesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AddressesMapper {
    long countByExample(AddressesExample example);

    int deleteByExample(AddressesExample example);

    int deleteByPrimaryKey(Integer addid);

    int insert(Addresses record);

    int insertSelective(Addresses record);

    List<Addresses> selectByExample(AddressesExample example);

    Addresses selectByPrimaryKey(Integer addid);

    int updateByExampleSelective(@Param("record") Addresses record, @Param("example") AddressesExample example);

    int updateByExample(@Param("record") Addresses record, @Param("example") AddressesExample example);

    int updateByPrimaryKeySelective(Addresses record);

    int updateByPrimaryKey(Addresses record);
}