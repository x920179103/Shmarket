package com.yc.shmarket.mapper;

import com.yc.shmarket.pojo.OrderDetails;
import com.yc.shmarket.pojo.OrderDetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderDetailsMapper {
    long countByExample(OrderDetailsExample example);

    int deleteByExample(OrderDetailsExample example);

    int deleteByPrimaryKey(Integer odid);

    int insert(OrderDetails record);

    int insertSelective(OrderDetails record);

    List<OrderDetails> selectByExample(OrderDetailsExample example);

    OrderDetails selectByPrimaryKey(Integer odid);

    int updateByExampleSelective(@Param("record") OrderDetails record, @Param("example") OrderDetailsExample example);

    int updateByExample(@Param("record") OrderDetails record, @Param("example") OrderDetailsExample example);

    int updateByPrimaryKeySelective(OrderDetails record);

    int updateByPrimaryKey(OrderDetails record);
}