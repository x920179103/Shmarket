package com.yc.shmarket.mapper;

import com.yc.shmarket.pojo.Commodities;
import com.yc.shmarket.pojo.CommoditiesExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommoditiesMapper {
	//商品模糊查询
	List<Commodities> findCmodList(Commodities cmod);
	
    long countByExample(CommoditiesExample example);

    int deleteByExample(CommoditiesExample example);

    int deleteByPrimaryKey(Integer cid);

    int insert(Commodities record);

    int insertSelective(Commodities record);

    List<Commodities> selectByExample(CommoditiesExample example);

    Commodities selectByPrimaryKey(Integer cid);

    int updateByExampleSelective(@Param("record") Commodities record, @Param("example") CommoditiesExample example);

    int updateByExample(@Param("record") Commodities record, @Param("example") CommoditiesExample example);

    int updateByPrimaryKeySelective(Commodities record);

    int updateByPrimaryKey(Commodities record);
}