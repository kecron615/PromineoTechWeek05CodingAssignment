package assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Week04ListsPart1 {

	/*
	 * static void createList(int endNum) { List<Integer> listNums = new
	 * ArrayList<>();
	 * 
	 * for (int i = 1; i <= endNum; i++) { listNums.add(i); }
	 * 
	 * System.out.println(listNums); }
	 * 
	 * public static void main(String[] args) { int endNum = 10; createList(endNum);
	 * }
	 */

	/*
	 * public static void main(String[] args) { Scanner in = new Scanner(System.in);
	 * int indexVal = in.nextInt(); List<String> productList = new ArrayList<>();
	 * 
	 * productList.add("Macbook"); productList.add("HP Notebook");
	 * productList.add("iPhone 14"); productList.add("Acer Aspire");
	 * productList.add("Windows Surface"); productList.add("Galaxy S23");
	 *//***** DO NOT CHANGE THE CODE ABOVE THIS LINE *****//*
															 * 
															 * // WRITE YOUR CODE HERE if(indexVal >= 0 && indexVal <
															 * productList.size()) {
															 * System.out.println(productList.get(indexVal)); } else {
															 * System.out.
															 * println("No product can be found with that product number."
															 * ); }
															 * 
															 * 
															 * 
															 * }
															 */

	/*
	 * static void wordReplace(List<String> tenWords, int num1, int num2, int num3)
	 * {
	 * 
	 * // WRITE YOUR CODE HERE
	 * 
	 * List<String> threeWords = new ArrayList<>();
	 * 
	 * if(num1 >= 0 && num1 <= 9) { threeWords.add(tenWords.get(num1)); } if (num2
	 * >= 0 && num2 <= 9) { threeWords.add(tenWords.get(num2)); } if (num3 >=0 &&
	 * num3 <= 9) { threeWords.add(tenWords.get(num3)); } if (threeWords.size() ==
	 * 3) { System.out.println(threeWords); }else { System.out.
	 * println("Sorry, there was an error getting a number you requested."); }
	 * 
	 * 
	 * 
	 * 
	 *//***** DO NOT CHANGE THE CODE BELOW THIS LINE *****//*
															 * }
															 * 
															 * public static void main(String[] args) { Scanner in = new
															 * Scanner(System.in); int num1 = in.nextInt(); int num2 =
															 * in.nextInt(); int num3 = in.nextInt();
															 * 
															 * List<String> tenWords = new ArrayList<String>();
															 * tenWords.add("Bumfuzzle"); tenWords.add("Cattywampus");
															 * tenWords.add("Widdershins"); tenWords.add("Gubbins");
															 * tenWords.add("Lollygag"); tenWords.add("Malarkey");
															 * tenWords.add("Wabbit"); tenWords.add("Impignorate");
															 * tenWords.add("Yarborough"); tenWords.add("Bloviate");
															 * 
															 * wordReplace(tenWords, num1, num2, num3);
															 * 
															 * } }
															 */

	/*
	 * import java.io.*; import java.util.*;
	 * 
	 * 
	 * static void sumList(int num1, int num2, int num3, int num4) {
	 * 
	 * // WRITE YOUR CODE HERE List<Integer> newList = new ArrayList<>();
	 * newList.add(num1); newList.add(num2); newList.add(num3); newList.add(num4);
	 * newList.add(num1 + num2 + num3 + num4);
	 * 
	 * System.out.println(newList);
	 * 
	 * 
	 *//***** DO NOT CHANGE THE CODE BELOW THIS LINE *****//*
															 * }
															 * 
															 * public static void main(String[] args) { Scanner in = new
															 * Scanner(System.in); int num1, num2, num3, num4; num1 =
															 * in.nextInt(); num2 = in.nextInt(); num3 = in.nextInt();
															 * num4 = in.nextInt(); sumList(num1, num2, num3, num4);
															 * 
															 * }
															 */

	/*
	 * import java.io.*; import java.util.*;
	 * 
	 * static void beginEnd(int endNum) {
	 * 
	 * // WRITE YOUR CODE HERE List<Integer> newList = new ArrayList<>(); if(endNum
	 * > 0) { for(int i = 1; i <= endNum; i++) { newList.add(i); }
	 * System.out.println("The first number in the List is " + newList.get(0));
	 * System.out.println("The last number in the List is " +
	 * newList.get(newList.size() - 1)); } else {
	 * System.out.println("Your List cannot be created with a number less than one."
	 * ); }
	 * 
	 * 
	 *//***** DO NOT CHANGE THE CODE BELOW THIS LINE *****//*
															 * } public static void main(String[] args) { Scanner in =
															 * new Scanner(System.in); int endNum = in.nextInt();
															 * 
															 * beginEnd(endNum); } }
															 */
	
	/*Given a List of String called words and containing 5 values entered by the user stored in the variables word1,word2, word3, word4, and word5, create a new List.
Create a new List of String called newList
This new List will contain every other List item from the original List called words starting with the first item
When done populating newList, execute your code to see what prints to the console
*/
	import java.io.*;
	import java.util.*;


		static void halfList(List<String> words) {
		    
		  // WRITE YOUR CODE HERE
			List<String> newList = new ArrayList<>();
			for (int i = 0; i < newList.size(); i++) {
				if (i %2 != 0) {
					newList.add(newList.get(i));
				}
			}



			



		/***** DO NOT CHANGE THE CODE BELOW THIS LINE *****/
			System.out.println("The old List is: " + words);
			System.out.println("The new List is: " + newList);
		}
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			String word1, word2, word3, word4, word5;
			word1 = in.nextLine();
			word2 = in.nextLine();
			word3 = in.nextLine();
			word4 = in.nextLine();
			word5 = in.nextLine();
			List<String> words = new ArrayList<>();
			words.add(word1);
			words.add(word2);
			words.add(word3);
			words.add(word4);
			words.add(word5);
			
			halfList(words);
		
	}

}
