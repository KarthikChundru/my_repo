package com.zensar;

@FunctionalInterface
interface MathOperation {
	public int operation(int x,int y);
}

public class LamdaTest {
	
	public static void main(String[] args) {
		MathOperation addition = (int x, int y)->x + y;
		MathOperation subtraction = (int x, int y)->x - y;
		MathOperation multiplication = (int x, int y)->x * y;
		MathOperation division = (int x, int y)->x / y;
		
		System.out.println("Addition: " + addition.operation(7, 4));
		System.out.println("Subtraction: " + subtraction.operation(7, 4));
		System.out.println("Multiplication: " + multiplication.operation(7, 4));
		System.out.println("Division: " + division.operation(7, 4));

	}

}
