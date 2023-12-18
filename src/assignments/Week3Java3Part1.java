package assignments;

public class Week3Java3Part1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String userWord = "stop";
			int numTimes = 3;
			//Calling the method and printing the results
			
			String repeatedString = repeatString(userWord, numTimes);
			System.out.println(repeatedString);
	}
			//Method to repeat a string based on the given number of times
	
		public static String repeatString(String userWord, int numTimes) {
			StringBuilder result = new StringBuilder();
			
			//Repeat userWord numTimes and append to the StringBuilder
			for (int i = 0; i < numTimes; i++) {
				result.append(userWord);
		}
			//convert the stringbuilder to a string and return
			
			return result.toString();
	}

}
