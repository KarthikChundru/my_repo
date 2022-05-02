package com.zensar;

public class LifeCycleBean implements ApplicationContextAware, InitilizingBean {
	private double prize;

	public LifeCycleBean() {
		System.out.println("Inside default constructor");
	}
	public LifeCycleBean(double price) {
		super();
		this.price = price;
		System.out.println("Inside parameterized constructor");
	}
	public double getPrize() {
		return prize;
	}
	public void setPrize(double price) {
		this.price = price;
		System.out.println("Inside setPrice: " + this.price);
	}
	@Override
	public String toString() {
		return "LifeCycleBean [price " + price + "]";
	}
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("Aware - IoC container: " + applicationContext);
	}
}
