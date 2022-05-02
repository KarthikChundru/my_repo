package com.zensar.runner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Component
public class EmailSenderRunner implements ApplicationRunner, Ordered {
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		String myArgs[] = args.getSourceArgs(); //returns command line arguments
		System.out.println("Inside EmailSender runner");
		for(String arg: myArgs)
			System.out.println(arg);
	}

	@Override
	public int getOrder() {
		//TODO Auto-generated method stub
		return 1;
	}
}
