package com.zensar;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor{
	
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("\tpostProcessAfterInitilization: " + beanName);
		return bean;
	}
	
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if(bean instanceof LifeCycleBean) {
			LifeCycleBean lifeCycleBean = (LifeCycleBean)bean;
			lifeCycleBean.setPrice(90000);
		}
		System.out.println("\tpostProcessBeforeInitilization: " + beanName + " " + bean);
		return bean;
	}

}
