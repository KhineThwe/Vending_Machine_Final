package com.jp.vending.dto;

public class APIdata {
	private Integer price;
	private String name;
	private Integer amount;
	private Integer change;

	public Integer getPrice() {
		return price;
	}

	public String getName() {
		return name;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public Integer getChange() {
		return change;
	}

	public void setChange(Integer change) {
		this.change = change;
	}
}
