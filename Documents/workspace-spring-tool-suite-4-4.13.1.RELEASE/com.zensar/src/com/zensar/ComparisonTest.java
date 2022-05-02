package com.zensar;

import java.util.Arrays;
import java.util.Comparator;

class PersonweightComparator implements Comparator<Person>{
	public int compare(Person per1,Person p2) {
		if(per1.weight>p2.weight) {
			return 1;
		}
		else if(per1.weight < p2.weight) {
			return 1;
		}
		return 0;
	}
}
class PersonNameComparator implements Comparator<Person> {
	@Override
	public int compare(Person per1,Person p2) {
		return per1.name.compareTo(p2.name);
	}
}
class Person implements Comparable<Person>{
	String name;
	float height;
	int weight;
	public Person(String name, float height, int weight) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", height=" + height + ", weight=" + weight + "]";			
	}
	@Override
	public int compareTo(Person per) {
		if(this.height>per.height) {
			return 1;
		}
		else if(this.height < per.height) {
			return -1;
		}
		return 0;
	}
	
}



public class ComparisonTest {
	
	public static void main(String[] args) {
		Person p[]=new Person[4];
		p[0]=new Person("tom",5.5f,45);
		p[1]=new Person("jom",5.2f,35);
		p[2]=new Person("com",5.3f,55);
		p[3]=new Person("zom",4.5f,15);
		
		Arrays.sort(p,new PersonNameComparator());
		//Arrys.sort(p,new PersonWeightComparator());
		
		for(int i=0;i<p.length;i++) {
			System.out.println(p[i]);
		}
		
		
	}
}