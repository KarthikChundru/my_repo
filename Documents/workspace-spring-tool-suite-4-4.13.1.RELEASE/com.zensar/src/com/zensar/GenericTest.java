package com.zensar;

class NumericGenericWrapper<N extends Number>{
	N data;
	
	
	
	public N getData() {
		return data;
	}
	
	public void setData(N data) {
		this.data = data;
	}
		
	}

		
public class GenericTest {

	public static void main(String[] args) {
		
		NumericGenericWrapper<Integer> generic=new NumericGenericWrapper<Integer>();
		generic.setData( 23);
		Integer name1= generic.getData();
		System.out.println(name1);
		
		NumericGenericWrapper<Float> generic1=new NumericGenericWrapper<Float>();
		generic1.setData( 23.5f);
		Float name2= generic1.getData();
		System.out.println(name2);
		NumericGenericWrapper<Double> generic2=new NumericGenericWrapper<Double>();
		generic2.setData( 24.500);
		Double name3= generic2.getData();
		System.out.println(name3);
	}
}
