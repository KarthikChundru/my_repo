package com.zensar;

interface Printable {
	void print();
}
class Circle implements Printable {
	public Circle(int i) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void print() {
		System.out.println("Circle printed");
	}
}
class Emp implements Printable {
	@Override
	public void print() {
		System.out.println("Employee printed");
	}
}
public class PrintableTest {

	private static final Circle[] SortCircle = null;
	public static void main(String[] args) {
		//collect circle & employee together and print all objects
		Printable p[] = new printable[2];
		p[0] = new Circle();
		p[1] = new Emp();
		printAll(p);
		
		Sortable sortCircle[] - new Sortable[4];
		SortCircle[0] = new Circle(23);
		SortCircle[1] = new Circle(54);
		SortCircle[2] = new Circle(10);
		SortCircle[3] = new Circle(17);
		SortAll(sortCircle);
	}
	public static void printAll(Printable p[]) {
		for(int i=0;i<p.length;i++)
			p[i].print();
	}
}
