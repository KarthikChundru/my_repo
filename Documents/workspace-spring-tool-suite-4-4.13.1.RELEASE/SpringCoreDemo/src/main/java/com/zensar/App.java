package com.zensar;

import java.util.Iterator;
import java.util.Map;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	
    	//IoC container proviced by Spring framework
    	AbstractApplicationContext iocContainer=new ClassPathXmlApplicationContext("beans.xml");
    	/*Item item=(Item)iocContainer.getBean("itemBeans");
    	Order order=(Order)iocContainer.getBean("orderBeans");
    	/* Map<String , Item> beans= iocContainer.getBeansOfType(Item.class);
    	for(Item price : beans.values()) {
    	totalPrice+=price.getPrice();
    	}
    	System.out.println("Order=" +totalPrice);
    	} */
    	// System.out.println("order"+order);
    	//iocContainer.registerShutdownHook();

    	//LifeCycleBean lifeCycleBean=(LifeCycleBean)iocContainer.getBean("lifeCycleBean");
    	//ocContainer.registerShutdownHook();
    	EmployeBean emp=(EmployeBean)iocContainer.getBean("employeeBeans");
    	System.out.println("Project Details" +emp);
    	}


    }
