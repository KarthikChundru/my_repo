package com.zensar;
import java.util.ArrayList;
import java.util.ListIterator;
public class ReverseArrayList {
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("Tom");
		arrayList.add("Jerry");
		arrayList.add("Dolly");
		arrayList.add("kim");
		arrayList.add("sun");
		ListIterator<String> itr = arrayList.listIterator();
		while (itr.hasNext()) {
			itr.next();
		}
		System.out.println("The ArrayList elements in the reverse direction are: ");
		while (itr.hasPrevious()) {
			String name=itr.previous();
			System.out.println(name);
		}
	}
}
