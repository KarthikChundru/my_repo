package com.java8.test;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collector;
import java.util.stream.Collectors;



public class FruitsUtils {
/*
public static List<Fruit> getAllFruits() {
List<Fruit> fruits = new ArrayList<Fruit>();
Random random = new Random();
for(int i=0; i<100; i++) {
String fruitNames[] = {"Peach", "Banana", "Pomegranate", "Apple", "Watermelon"};
String fruitColors[] = {"Red", "White", "Yellow"};
fruits.add(new Fruit(fruitNames[random.nextInt(4)], random.nextInt(500), random.nextInt(100), fruitColors[random.nextInt(2)]));
}
return fruits;
}

public static void printFruits(List<Fruit> fruits) {
for(Fruit fruit: fruits) {
System.out.println(fruit);
}
} */



public static <Fruit> void main(String args[]) {

List<Fruit> fruitList=Arrays.asList(new Fruit("Peach",340,500,"Red"),new Fruit("Banana",100,300,"yellow"));
//Collection<Fruit> fruits;
//Map<String,List<Fruit>>mapFruitColor=fruitList.stream().collect(groupingBy(Fruit::getColor));
//System.out.println("color fruits:"+mapFruitColor);

fruitList.stream().collect(Collectors.partitioningBy((Fruit fruit)->fruit.calories>200)).get(true).stream().forEach(System.out::println);
}



}