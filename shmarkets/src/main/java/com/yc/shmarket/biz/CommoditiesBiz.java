package com.yc.shmarket.biz;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.yc.shmarket.mapper.CommoditiesMapper;
import com.yc.shmarket.pojo.Commodities;
import com.yc.shmarket.pojo.CommoditiesExample;
import com.yc.shmarket.pojo.CommoditiesExample.Criteria;
import com.yc.shmarket.util.Result;
@Service
public class CommoditiesBiz {
	@Resource
	private CommoditiesMapper cm;
	private int pagesize=8;
	
	/*
	 * 根据上架时间先后展示上架的商品
	 */
	@Transactional(readOnly=true)
	public Result queryAll(int page){
		CommoditiesExample ce=new CommoditiesExample();
		ce.setOrderByClause("cup_date desc");
		ce.createCriteria().andCstateComEqualTo(1);
		PageHelper.startPage(page, pagesize);
		List<Commodities> list=cm.selectByExample(ce);
		int count=(int) cm.countByExample(ce);
		int pagecount= count/pagesize==0? count/pagesize:(count/pagesize)+1;
		return new Result(1,pagecount+"",list);
	}
	/*
	 * 搜索框显示下拉相关热点搜索词
	 */
	public List<Commodities> hotWords(Commodities cmod){
		PageHelper.startPage(1, 5);
		List<Commodities> list= cm.findCmodList(cmod);
		return list;
	}
	/*
	 * 搜索
	 */
	@Transactional(readOnly=true)
	public Result search(int page,Commodities cmod) {
		CommoditiesExample ce=new CommoditiesExample();
		ce.setOrderByClause("cup_date desc");
		Criteria c=ce.createCriteria().andCstateComEqualTo(1).andCnameLike("%"+cmod.getCname()+"%");
		if(null!=cmod.getTid()){
			c.andTidEqualTo(cmod.getTid());
		}
		PageHelper.startPage(page, pagesize);
		List<Commodities> list= cm.selectByExample(ce);
		int count=(int) cm.countByExample(ce);
		int pagecount= count/pagesize==0? count/pagesize:(count/pagesize)+1;
		return new Result(1,pagecount+"",list);
	}
}
