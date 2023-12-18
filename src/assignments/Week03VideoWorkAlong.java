package assignments;

public class Week03VideoWorkAlong {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		String studentName1 = "Tom Sawyer";
		String studentName2 = "Jack Smith";
		String studentName3 = "Bill Turner";
		
		//System.out.println(studentName1);
		//System.out.println(studentName2);
		//System.out.println(studentName3);
		
		String[] students = new String[3];
		
		students[0] = "Tom Sawyer";
		students[1] = "Jack Smith";
		students[2] = "Bill Turner";
		
		//System.out.println(students[0]);
		//System.out.println(students[1]);
		//System.out.println(students[2]);
		
		for (int i = 0; i < students.length; i++) {
			//System.out.println(students[i]);
		}
		//System.out.println("Enhanced for loop:");
		for (String student : students) {
			//System.out.println(student);
	}
		String [] products = new String[5];
		products[0] = "Carrots";
		products[1] = "Pineapples";
		products[2] = "Tomatoes";
		products[3] = "Tomatoes";
		products[4] = "Cereal";
		
		for (String product : products) {
			//System.out.println("Product: " + product);
		}
		
		int[] multiplesOf3 = new int[10];
		
		for (int i = 1; i <= multiplesOf3.length; i++) {
			multiplesOf3[i - 1] = i * 3; 
			//System.out.println("number: " + multiplesOf3[i-1]);
		}
		
		int[] multiplesOf5 = new int[10];
		
		for (int i = 0; i < multiplesOf5.length; i++) {
			multiplesOf5[i] = (i + 1) * 5; 
			//System.out.println(multiplesOf5[i]);
		}
	
		String firstName = "Bob";
		String lastName = "Ross";
		String fullName = createFullName(firstName, lastName);
		String fullName2 = createFullName("Sam", lastName);
		
		//System.out.println(fullName);
		//System.out.println(fullName2);
		
	}	
	
	public static String createFullName(String x, String y) {
		//String fullName = x + " " + y; 
		//return fullName; OR YOU CAN JUST DO THIS
		return x + " " + y;
	}
	int [] myArray = new int[3];
	myArray[0] = 7;
	myArray[1] = 10;
	myArray[2] = 8;
	int sum =  sumArray(myArray);
//Takes an array of ints and returns the sum of all the ints
	
	
		public static int sumArray(int[] numbers) {
			int sum = 0;
			for (int number : numbers) {
				sum += number;
			}
			return sum;
		}
		System.out.println(sumArray(myArray));
		
	
}
