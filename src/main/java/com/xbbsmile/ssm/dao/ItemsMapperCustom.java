package com.xbbsmile.ssm.dao;

import com.xbbsmile.ssm.po.Items;

import java.util.List;

public interface ItemsMapperCustom {
    //商品查询列表
	public List<Items> findItemsList(Items items)throws Exception;
}