package com.yc.shmarket.biz;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.yc.shmarket.pojo.Commodities;
@RunWith(SpringRunner.class)
@SpringBootTest
public class commoditiesBizTest {
	@Autowired
	private CommoditiesBiz cBiz;
	@Test
	public void testQueryAll() {
		List<Commodities> list=cBiz.queryAll();
		System.out.println(list);
	}
	@Test
	public void testSearch() {
		Commodities cmod=new Commodities();
		cmod.setCname("地图");
		//cmod.setTid(3);
		List<Commodities> list=cBiz.search(cmod);
		System.out.println(list);
	}
}
