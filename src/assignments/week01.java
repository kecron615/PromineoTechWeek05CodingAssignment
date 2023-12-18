package assignments;

public class week01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = 2;
		
		System.out.println(num1 + num2);
		
		int length = 6;
		int width = 4;
		int areaOfRectangle = length * width; 
		
		System.out.println("The area of the rectangle is " + areaOfRectangle);
		
		//Java program to swap two variables
		
		int e= 100, f = 200;
		System.out.println("Before Swap");
		System.out.println("e = " + e);
		System.out.println("f = " + f);
		
		//Swapping using three variables
		
		int temp = e;
		e = f;
		f = temp;
		
		System.out.println("After swap");
		System.out.println("e = " + e);
		System.out.println("f = " + f);
		
		int a = 5; 
		int b = 10;
		//print statement
		System.out.println("Before swapping, a = " + a + " and b = " + b);
		
		a = a + b; 
		b = a - b;
		a = a - b; 
		System.out.println("after swapping, a = " + a + " and b = " + b);
		
		int c = 10;
		int d = 20;
		
		System.out.println("Before swapping c = " + c + " and d = " + d);
		//Swapping a and b using below statement
		d = c + d - (c = d);
		System.out.println("After swapping c = " + c + " and d = " + d);
			
		int x = 3, y = 5; 
		x = x +y;
		y = x - y;
		x = x - b; 
		System.out.println("After swapping, x is equal to " + x + " and y is equal to " + y + ".");
		
		final double PI = 3.14159;
		double radius = 12.75;
		double area = PI * radius * radius;
		
		System.out.println(area);
		
		double areaEx2 = PI * (radius * radius);
		 System.out.println(areaEx2);
	}
	public static void main(String[] args) {


		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = 2;
		
		System.out.println(num1 + num2);
		
		int length = 6;
		int width = 4;
		int areaOfRectangle = length * width; 
		
		System.out.println("The area of the rectangle is " + areaOfRectangle);
		
		//Java program to swap two variables
		
		int e= 100, f = 200;
		System.out.println("Before Swap");
		System.out.println("e = " + e);
		System.out.println("f = " + f);
		
		//Swapping using three variables
		
		int temp = e;
		e = f;
		f = temp;
		
		System.out.println("After swap");
		System.out.println("e = " + e);
		System.out.println("f = " + f);
		
		int a = 5; 
		int b = 10;
		//print statement
		System.out.println("Before swapping, a = " + a + " and b = " + b);
		
		a = a + b; 
		b = a - b;
		a = a - b; 
		System.out.println("after swapping, a = " + a + " and b = " + b);
		
		int c = 10;
		int d = 20;
		
		System.out.println("Before swapping c = " + c + " and d = " + d);
		//Swapping a and b using below statement
		d = c + d - (c = d);
		System.out.println("After swapping c = " + c + " and d = " + d);
			
		int x = 3, y = 5; 
		x = x +y;
		y = x - y;
		x = x - b; 
		System.out.println("After swapping, x is equal to " + x + " and y is equal to " + y + ".");
		
		final double PI = 3.14159;
		double radius = 12.75;
		double area = PI * radius * radius;
		
		System.out.println(area);
		
		double areaEx2 = PI * (radius * radius);
		 System.out.println(areaEx2);
		 
		 
		 
		
	}

}
