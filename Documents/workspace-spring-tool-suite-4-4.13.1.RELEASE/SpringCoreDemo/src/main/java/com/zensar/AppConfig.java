package com.zensar;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


@Configuration
public class AppConfig {
	
	@Bean(name = "itemBean")
	public Item getItemBean() {
		Item item = new Item("Laptop", 70000.0);
		return item;
	}
	@Bean(name = "itemBean2")
	@Primary
	public Item getItemBean2() {
		Item item = new Item("Desktop", 20000.0);
		return item;
	}
	
	@Bean(name="orderBean")
	public order getOrderBean() {
		com.zensar.order order = new order();
		order.setTitle("IT Order");
		return order;
	}

}
