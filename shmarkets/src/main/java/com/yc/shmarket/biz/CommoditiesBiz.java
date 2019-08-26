package com.yc.shmarket.biz;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.yc.shmarket.mapper.CommoditiesMapper;
import com.yc.shmarket.pojo.Commodities;
import com.yc.shmarket.pojo.CommoditiesExample;
@Service
public class CommoditiesBiz {
	@Resource
	private CommoditiesMapper cm;
	
	/*
	 * 根据上架时间先后展示上架的商品
	 */
	@Transactional(readOnly=true)
	public List<Commodities> queryAll(){
		CommoditiesExample ce=new CommoditiesExample();
		ce.setOrderByClause("cup_date desc");
		ce.createCriteria().andCstateComEqualTo(1);
		return cm.selectByExample(ce);
	}
	public List<Commodities> search(Commodities cmod){
		PageHelper.startPage(1, 5);
		List<Commodities> list= cm.findCmodList(cmod);
		return list;
	}
}
