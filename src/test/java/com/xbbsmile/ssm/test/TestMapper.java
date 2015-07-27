package com.xbbsmile.ssm.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xbbsmile.ssm.dao.ItemsMapper;
import com.xbbsmile.ssm.dao.ItemsMapperCustom;
import com.xbbsmile.ssm.po.Items;
import com.xbbsmile.ssm.service.ItemsService;

public class TestMapper {

	private ApplicationContext applicationContext;
	
	@Before
	public void createContext(){
		applicationContext = new ClassPathXmlApplicationContext("classpath:application.xml");
	}
	
	@Test
	public void testItemsMapperCustom() throws Exception{
		ItemsMapperCustom itemsMapperCustom = (ItemsMapperCustom) applicationContext.getBean("itemsMapperCustom");
		List<Items> itemsList  = itemsMapperCustom.findItemsList(null);
		System.out.println(itemsList);
	}
	
	@Test
	public void testItemsMapper() throws Exception{
		ItemsMapper itemsMapper = (ItemsMapper) applicationContext.getBean("itemsMapper");
		Items items = itemsMapper.selectByPrimaryKey(1);
		System.out.println(items);
	}
	
	
	@Test
	public void testItemsService() throws Exception{
		ItemsService itemsService = (ItemsService) applicationContext.getBean("itemsService");
		List<Items> itemsList = itemsService.findItemsList(null);
		System.out.println(itemsList);
	}
}
