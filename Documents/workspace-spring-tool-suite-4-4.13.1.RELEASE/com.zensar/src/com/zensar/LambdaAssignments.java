package com.zensar;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;



@FunctionalInterface
interface Arithmeticop{
int operations(int a, int b);
}
@FunctionalInterface
interface StringLengths{
int length(String str);




}
interface Order1{
String operation1(int ord);
}



public class LambdaAssignments {



public static void main(String[] args) {

//Addition
Arithmetic addition =(a,b) -> (a+b);
System.out.println("Addition => " + addition.operations(20, 30));

//Subtraction
Arithmetic subtraction =(a,b) -> (a-b);
System.out.println("subtraction => " + subtraction.operations(40, 30));

//Multiplication
Arithmetic mul =(a,b) -> (a*b);
System.out.println("Multiplication => " + mul.operations(50, 30));

//Division
Arithmetic div =(a,b) -> (a/b);
System.out.println("Division => " + div.operations(100, 20));



/* 2. Write an application using lambda expressions to print Orders having 2 criteria implemented:
1) order price more than 10000 2) order status is ACCEPTED or COMPLETED */
Order1 status = (int ord)-> (ord > 10000)? "ACCEPTED" :"COMPLETED";
System. out. println(status.operation1(190000));
System. out. println(status.operation1(1000));
/*
* 3.Use the functional interfaces Supplier, Consumer,
* Predicate & Function to invoke built-in methods from Java API
*/



System.out.println("Supplier Interface");
Supplier<String> supplier= ()-> "XYZ";
System.out.println(supplier.get());



System.out.println("Consumer Interface");
Consumer<String> consumerString=s->System.out.println(s);
consumerString.accept("PQR");

System.out.println("Predicate Interface");
Predicate<Integer> predicate = i -> i > 200;
boolean greaterCheck = predicate.test(500);
System.out.println("is 500 greater than 200: "+greaterCheck);

System.out.println("Funtion Interface");
Function<Integer,Double> functionSqrt = n -> Math.sqrt(n);
System.out.println("Square root of 64: "+functionSqrt.apply(64));
System.out.println("Square root of 100: "+functionSqrt.apply(100));

/* 4)Remove the words that have odd lengths from the list.
* HINT: Use one of the new methods from JDK 8. Use removeIf() method from Collection interface
*/
//List<String> list = new ArrayList<>(Arrays.asList("Nag", "Zensar", "Freq", "jhon"));



//list.removeIf(word -> (word.length() % 2) != 0);



//System.out.println(list);

ArrayList<String> arrayList = new ArrayList<String>
(Arrays.asList("Nag", "zensar", "tom"));
Predicate<String> filter = str -> (str.length()%2)!=0;
System.out.println("Original ArrayList : " + arrayList);
boolean value = arrayList.removeIf(filter);
System.out.println("Returned value : " + value);
System.out.println("ArrayList after removeIf() : " + arrayList);


/*5) Create a string that consists of the first letter of each word in the list of Strings provided.
* HINT: Use Consumer interface & a StringBuilder to construct the result.
*/

List<String> Str = new ArrayList<String>();
StringBuilder ListFirstCharacterStr = new StringBuilder();
Str.add("Nag");
Str.add("Zensar");
Str.add("Tom");
Str.add("Donny");
Consumer<List<String>> CreateNewString = list1 ->
{
list1.forEach(e -> {ListFirstCharacterStr.append(e.charAt(0));});
};
CreateNewString.accept(Str);
System.out.println("First Character of List are : " + ListFirstCharacterStr);


/*6) Replace every word in the list with its upper case equivalent.
* Use replaceAll() method & UnaryOperator interface
*/
List<String> List = new ArrayList<String>();
List.add("zensar");
List.add("jimmy");
List.add("tommy");
List.add("doofus");



System.out.println("\nBefore Converting :: " + List);
UnaryOperator <List<String>> MakingCaptialLettersOfWords = list2 ->
{ list2.replaceAll(e-> e.toUpperCase());
return list2;};
MakingCaptialLettersOfWords.apply(List);
System.out.println("After Converting into Capital Letters :: " + List);



/* 7)Convert every key-value pair of the map into a string and append them all into a single string, in iteration order.
* HINT: Use Map.entrySet() method & a StringBuilder to construct the result String.*/

Map<Integer, String> map = new HashMap<>();
map.put(1, "A");
map.put(2, "P");
map.put(3, "X");
String result = map.entrySet()
.stream()
.map(entry -> entry.getKey() + " - " + entry.getValue())
.collect(Collectors.joining(", "));
System.out.println(result);

//Create a new thread that prints the numbers from the list. Use class Thread & interface Consumer
new Thread(
() -> Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
.forEach(System.out::print))
.start();
}


}

//StringLengths opr=(str)->str.length();
//System.out.println("Length of string " +opr.length("Nag"));
//System.out.println("Length of string " +opr.length("Zensar"));