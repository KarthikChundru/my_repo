package com.zensar.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class DataBaseRunner implements CommandLineRunner {
	
	@Override
	public void run(String...args) throws Exception {
		System.out.println("Inside Database runner");
		for(String arg: args)
			System.out.println(args);
	}
	
	public int getOrder() {
		//TODO Auto-generated method stub
		return 0;
	}

}
