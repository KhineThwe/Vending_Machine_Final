package com.jp.vending.entity;

public class Item {
	private String name;
	private String value;
	private String items;

	public Item(String name, String value, String items) {
		super();
		this.name = name;
		this.value = value;
		this.items = items;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getItems() {
		return items;
	}

	public void setItems(String items) {
		this.items = items;
	}
}
