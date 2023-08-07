package com.jp.vending.implement;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.jp.vending.entity.Item;
import com.jp.vending.service.VendingService;

@Service
public class VendingImplementation implements VendingService {

	@Override
	public List<Item> getAllItems() {
		List<Item> list = new ArrayList<>();
		list.add(new Item("Coca Cola（¥150）", "Coca Cola,150", "item1"));
		list.add(new Item("Water（¥100）", "Water,100", "item2"));
		list.add(new Item("Fanta（¥200）", "Fanta,200", "item3"));
		list.add(new Item("Hot Coffee(¥160)", "Hot Coffee,160", "item4"));
		list.add(new Item("Black Coffee(¥130)", "Black Coffee,130", "item5"));
		list.add(new Item("Pocari (¥170)", "Pocari,170", "item6"));
		return list;
	}
}
