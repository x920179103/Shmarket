package com.yc.shmarket.biz;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yc.shmarket.mapper.TypeMapper;
import com.yc.shmarket.pojo.Type;

@Service
public class TypeBiz {
	@Resource
	private TypeMapper tm;

	/*
	 * 显示所有分类
	 */
	public List<Type> queryAllType() {
		return tm.selectByExample(null);
	}
}
