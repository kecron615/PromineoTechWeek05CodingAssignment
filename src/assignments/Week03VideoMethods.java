package assignments;

public class Week03VideoMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] myArray = new int[3];
		myArray[0] = 7;
		myArray[1] = 10;
		myArray[2] = 8;
		
		System.out.println(sumArray(myArray));
		
		double[] grades = new double[5];
		grades [0] = 88.7;
		grades [1] = 92.5;
		grades [2] = 100;
		grades [3] = 67.3;
		grades [4] = 78.9;
		
		System.out.println(calculateAverage(grades));
		
		System.out.println(multiplyString("Hello", 3));
		
		
		String[] strings = new String[1];
		strings [0] = "test";
		
	}
		//Takes an array of ints and returns the sum of all the ints
		
		
			public static int sumArray(int[] numbers) {
				int sum = 0;
				for (int number : numbers) {
					sum += number;
				}
				return sum;
			}
			
			//Take an array of double and returns the average of all elements in the array
			public static double calculateAverage(double[] numbers) {
				double sum = 0;
				for (double number : numbers) {
					sum += number;
					
				}
				return sum / numbers.length;
			}
	//Takes a string and and int and returns the string concatenated with itself int number of times	
			public static String multiplyString(String str, int num) {
				String result = "";
			for (int i = 0; i < num; i++) {
				result += str;
			}
			return result; 
			}
			
			
	}


