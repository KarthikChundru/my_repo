package com.zensar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class order {
	
	@Autowired
	@Qualifier("itemBean1")
	private Item item;
	private String title;
	public order() {
		System.out.println("Inside Order default constructor");
		
	}
	public order(Item item, String title) {
		super();
		this.item = item;
		this.title = title;
		System.out.println("Inside Order parameterized constructor..");
	}
	public order(Item item) {
		this.item = item;
		System.out.println("Inside Order single parameterized constructor..");
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String toString() {
		return "Order [item=" + item + ", title=" + title + "]";
	}

}
