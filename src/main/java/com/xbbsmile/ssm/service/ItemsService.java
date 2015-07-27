package com.xbbsmile.ssm.service;

import java.util.List;

import com.xbbsmile.ssm.po.Items;
import com.xbbsmile.ssm.po.ItemsCustom;


public interface ItemsService {
	
	//商品查询列表
	public List<Items> findItemsList(Items items) throws Exception;
	
	//根据id查询商品信息
	/**
	 * 
	 * <p>Title: findItemsById</p>
	 * <p>Description: </p>
	 * @param id 查询商品的id
	 * @return
	 * @throws Exception
	 */
	public ItemsCustom findItemsById(Integer id) throws Exception;
	
	//修改商品信息
	/**
	 * 
	 * <p>Title: updateItems</p>
	 * <p>Description: </p>
	 * @param id 修改商品的id
	 * @param itemsCustom 修改的商品信息
	 * @throws Exception
	 */
	public void updateItems(Integer id,ItemsCustom itemsCustom) throws Exception;
	

}
