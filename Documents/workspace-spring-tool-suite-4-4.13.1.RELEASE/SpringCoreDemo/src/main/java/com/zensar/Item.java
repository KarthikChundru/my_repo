package com.zensar;

public class Item {
	private String name;
	private double prize;
	public Item() {
		super();
	}
	public Item(String name, double prize) {
		super();
		this.name = name;
		this.prize = prize;
	}
	public String getName( ) {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrize() {
		return prize;
	}
	public void setPrize(double prize) {
		this.prize = prize;
	}
	@Override
	public String toString() {
		return "Item [name=" + name + ", prize=" + prize + "]";
	}

}
