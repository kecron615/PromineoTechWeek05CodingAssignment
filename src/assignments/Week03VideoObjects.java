package assignments;

import java.util.Scanner;

public class Week03VideoObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//primitive data types vs objects
		//obj: like String or Array
		//The main diff is primitive data types is just a piece of data and nothing more
		int age = 34;
		
		String name = "Sally Mae";
		System.out.println(name.length());
		System.out.println(name.charAt(6));
		
		Scanner s = new Scanner(System.in);
		
		int[] numbers = new int[3];
		System.out.println(numbers.length);
		//java docs is the documentation for the libraries used in java
		//primitive data just holds once piece of data; objects have lots of properties
		
		String a = new String("Hello");
		String b = new String("Hello");
		System.out.println(a);
		System.out.println(b);
		System.out.println(a == b);
		//double equals checks to see if two values are the same value in memory. So with primitive data types, when we assign a 5 that points to the literal 5. However, with the objects, when you create a new object it creates its own instance in memory. That means that the new string, even though the values are the same, its a different place in the memory. Its like having two 2018 Cameros, same color and everything. You could look at them and say they are the same... but they are still two different cars.	
		
		System.out.println("equals() method: " + a.equals(b));
		//equals takes an object and then it compares it to the object you called it on. I'm calling the equals methodon a and passing in b, and that will tell me if they have the same values. Same object, use ==; same value equals. 
		
	
		int x = 5;
		int y = 5;
		System.out.println(x);
		System.out.println(y);
		System.out.println(x == y);
		
		String c = new String("Hello");
		String d = c; 
		System.out.println(c);
		System.out.println(d);
		System.out.println(c == d);
	}

}
