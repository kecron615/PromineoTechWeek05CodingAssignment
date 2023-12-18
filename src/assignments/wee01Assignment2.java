package assignments;

public class wee01Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = 3;
		int num3 = 5;
		int num4 = 6; 
		
		int answer = ((num1 * num2) / num3) % num4;
		System.out.println(answer);
		
		 String employeeName = "Tony Stark";

		  System.out.println("Hi, my name is " + employeeName);
				
		  String firstName = "Tom";

		  String lastName = "Sawyer";

		  System.out.println(firstName + "lastName");
		  
		  int a = 105;
		  int b = 101; 
		  
		  boolean answer2 = (a < b & b > 100);
		  System.out.println(answer2);
		  System.out.println( "hello world".charAt(0) != 'H');
		  
		  boolean d = true;
		  boolean e = true;
		  boolean f = true;
		  
		  System.out.println(d & e || d & f || e & f);
				 
		  int x = 25;
		  int y = 20;
		  int z = 10; 
		  
		  boolean result = x > y && x > z;
		  System.out.println(result);
		  
		  int num5 = 14;
		  int num6 = 8;
		  int num7 = 25; 
		  int num8 = 11; 
		  boolean answer3 = num5 > num6 || num7 < num8;
		  System.out.println(answer3);
	}

}
