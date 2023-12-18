package assignments;

public class week02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean a = true;
		boolean b = false; 
		boolean c = true;
		
		System.out.println(a == b || (c || !b));
	
	//////////////////////////////////////////////////
		int age = 22;
		boolean isStudent = true;
		
		if (age < 18 || isStudent) {
			System.out.println("You get a discount!");
		} else {
			System.out.println("Sorry, no discount for you.");
		}
	
	//////////////////////////////////////////////////////////////////
	int moneyInBank = 2350;
	int rentDue = 1250;
	int carPayment = 580;
	int food = 350;
	int billSum = rentDue + carPayment + food;
	
	if (moneyInBank >= billSum) {
		System.out.println("You have enough money this week.");
	} else { 
		System.out.println("You may need to borrow some money.");
		
	}
	
	
	
	///////////////////////////////////////////////////////////
	double assignment1 = 80;
	double assignment2 = 88;
	double assignment3 = 77;
	double assignment4 = 82;
	
	if ((assignment1 + assignment2) > 150 && (assignment3 > 70 || assignment4 > 70)) {
	    System.out.println("You passed the class.");
	} else { 
	    System.out.println("You failed the class");
	}
	

///////////////////////////////////////////////////////////////////////////////////
	//Given a variable named letter of type char. Create an if/else statement to check to see if the character stored in the variable letter is a vowel or a consonant.
	//The if statement should have the variable letter equal to each vowel separated by the || operator
	//If the character is a vowel, then print "It's a vowel!"
	//Else, print "It's a consonant!"
	
	char letter = 'a';
	
	if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
		System.out.println("It's a vowel!");
	} else { 
		System.out.println("It's a consonant!");
	}
	
	
	///////////////////////////////////////////////////////////////////////////////////////////////
	
	int age2 = 13; 
	
	if (age2 >= 18) {
		System.out.println("You are old enough to vote.");
	} else {
		System.out.println("You are not old enough to vote.");
	}
	
	////////////////////////////////////////////////////////////////////////////
	
	String randomWord = "exceptionally";
	if (randomWord.length() >= 10) {
		System.out.println("That is a really long word!");
	} else { 
		System.out.println("Your word is not that long");
	}
	
	
/////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//Given the variables num1 and myNumber, create an if/else if statement that compares myNumber to num1. Based on which condition evaluates to true, print one of the following messages:
	//num1 + " is smaller than my number, " + myNumber
	//num1 + " is larger than my number, " + myNumber
	//num1 + " is equal to my number, " + myNumber

	int num12 = 156; 
	int myNumber = 125;
	
	if (num12 < myNumber) {
		System.out.println(num12 + " is smaller than my number, " + myNumber);
	} else if(num12 > myNumber) {
		System.out.println(num12 + " is larger than my number, " + myNumber);
	} else if(num12 == myNumber) {
		System.out.println(num12 + " is equal to my number, " + myNumber);
		
	}
	
	/////////////////////////////////////////////////////////////////////////////////
	//Given three variables, sundayTemp, mondayTemp, and tuesdayTemp, write a program that will determine which day is the hottest.
	//If sundayTemp is the highest, print "Sunday"
	//If mondayTemp is the highest, print "Monday"
	//If tuesdayTemp is the highest, print "Tuesday"
	//Assume that none of the temperatures are the same

	int sundayTemp = 97;
	int mondayTemp = 95;
	int tuesdayTemp = 93;
	
	if (sundayTemp > mondayTemp && sundayTemp > tuesdayTemp) {
		System.out.println("Sunday");
	} else if(mondayTemp > sundayTemp && mondayTemp > tuesdayTemp) {
		System.out.println("Monday");
	} else if(tuesdayTemp > sundayTemp && tuesdayTemp > mondayTemp) {
		System.out.println("Tuesday");
	}
	
	//////////////////////////////////////////////////////////////////////////////////////////////
	
	//Given three variables, personOneAge, personTwoAge, and personThreeAge, write a program that will determine who is the oldest.
	//If Person one is the oldest, print "Person one is the oldest."
	//If Person two is the oldest, print "Person two is the oldest."
	//If Person three is the oldest, print "Person three is the oldest."
	//Assume that no one is the same age

	int personOneAge = 56;
	int personTwoAge = 34;
	int personThreeAge = 12;
	
	if(personOneAge > personTwoAge && personOneAge > personThreeAge) {
		System.out.println("Person one is the oldest.");
	} else if(personTwoAge > personOneAge && personTwoAge > personThreeAge) {
		System.out.println("Person two is the oldest.");
	} else if(personThreeAge > personOneAge && personThreeAge > personTwoAge) {
		System.out.println("Person three is the oldest.");
	}
	
	/////////////////////////////////////////////////////////////
//Evaluate if your favorite baseball team is any good and might make the playoffs. You are given two integer variables, wins and losses, and one Boolean variable called isFall.
	//If wins is greater than losses and isFall equals true, then print a message that says “It's looking good for your team to make the playoffs.”
	//If wins is greater than losses, but isFall is false, then print “Your favorite team has promise, but it's too early to tell.”
	//Finally, if both conditions evaluate to false, then print “It's not looking too good.”
	
	int wins = 4;
	int losses = 6;
	boolean isFall = true;
	
	if(wins > losses && isFall) {
		System.out.println("It's looking good for your team to make the playoffs.");
	} else if(wins > losses && !isFall) {
		System.out.println("Your favorite team has promise, but it's too early to tell.");
	} else {
		System.out.println("It's not looking too good.");
	}
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////
//Create a nested if statement:
	//Check to see if num1 is greater than or equal to num2
	//Note: The second if statement should only run if the first if evaluates to true
	//If the first statement is true then check to see if num3 is greater than or equal to num4
	//If both conditions are true print "both statements are true"
	//At the end of the main() method, print "program ended"
	
	int num1 = 1;
	int num2 = 2;
	int num3 = 3;
	int num4 = 4;
	
	if(num1 >= num2 && num3 >= num4) {
		System.out.println("both statements are true");
	}
	System.out.println("program ended");
		
	
			
	//////////////////////////////////////////////////////////////////////////////////////////////
//Given a variable monthNumber, write a switch statement to check the value stored in the variable that will produce the name of the month.
	//When a match is made, print out that month in word format (i.e. 7 should print July)
	//If a match is not made, print out "Invalid Month"
	//Use System.out.println() to print statements to the console.
	
	int monthNumber = 6;
	
	switch (monthNumber ) {
	case (1):
		System.out.println("January");
		break;
	case (2):
		System.out.println("February");
		break;
	case (3):
		System.out.println("March");
		break;
	case (4): 
		System.out.println("April");
		break;
	case (5):
		System.out.println("May");
		break;
	case (6):
		System.out.println("June");
		break;
	case (7):
		System.out.println("July");
		break;
	case (8):
		System.out.println("August");
		break;
	case (9):
		System.out.println("September");
		break;
	case (10):
		System.out.println("October");
		break;
	case (11):
		System.out.println("November");
		break;
	case (12):
		System.out.println("December");
		break;
	default:
		System.out.println("Invalid Month");
	}
	
	
//////////////////////////////////////////////////////////////////////////////////////////////////////
	//Given the String variable month, determine how many days is in the given month or if it's an Invalid month.
	//Currently, the program works but only if the name of the month stored in the variable month is lowercase.
	//Change something in the switch statement that will make the program work as desired no matter the letter case of the name of the month.
	
	 String month = "may";
	 int days = -1; 
     switch(month.toLowerCase() ) {
         case "january":
         case "march":
         case "may":
         case "july":
         case "august":
         case "october":
         case "december":
             days = 31;
             break;
         case "april":
         case "june":
         case "september":
         case "november":
             days = 30;
             break;
         case "february":
             days = 28;
             break;
     }
	
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	//Given the String variable day, determine if the day of the week stored in day is a weekday, is a weekend day, or an Invalid day.
	//When checking the value of day, make sure that your code takes into account letter case
	//If the value of day is Monday, Tuesday, Wednesday, Thursday, or Friday, then print to the console the day and " is a weekday."
	//The output for Tuesday should look like this: "Tuesday is a weekday."
	//If the value of day is Saturday or Sunday, then print to the console the day and " is a weekend day."
	//The output for Saturday should look like this: "Saturday is a weekend day."
	//Otherwise, print "Invalid day!"
	
	String day = "Saturday";
	if (day.equalsIgnoreCase("MONDAY") || day.equalsIgnoreCase("TUESDAY") ||
            day.equalsIgnoreCase("WEDNESDAY") || day.equalsIgnoreCase("THURSDAY") ||
            day.equalsIgnoreCase("FRIDAY")) {
            System.out.println(day + " is a weekday.");
        } else if (day.equalsIgnoreCase("SUNDAY") || day.equalsIgnoreCase("SATURDAY")) {
            System.out.println(day + " is a weekend day");
        } else {
            System.out.println("Invalid day!");
        }

	///////////////////////////////////////////////////////////
//Given the variable userValue, create a for loop that starts at 1 and goes to 100 including the value 100, printing the value of the counter to the console each time the loop processes.
	//The for loop should iterate from 1 up to and including 100
	//The for loop should increment the counter by the amount stored in userValue
	//The for loop should print the counter to the console at every iteration
	int userValue = 2;
	
	for (int i = 1; i <= 100; i += userValue) {
		System.out.println(i);
	}
	/////////////////////////////////////////////////////////////////////////////////////////////////////////
	//Create a for loop that starts at 10 and goes to 0.
	//The value of your index i decrements by 1 each time the loop finishes
	//Print the index i to the console for each iteration
	
	for (int i = 10; i >= 0; i--) {
		System.out.println(i);
	}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//Given variables power, base, and result, use a for loop to raise the base to the power of power (i.e. base^power).
	//The loop should run from 1 to the number stored in power
	//In the loop body, result should be multiplied by the base every time the loop iterates and that value stored in result, like this: result *= base or result = result * base
	//Print the value of result to the console
	int base = 2;
    int power = 4;
    int result = 1;

    for (int i = 1; i <= power; i++) {
        result *= base;
    }
    System.out.println(result);


	//////////////////////////////////////////////////////////////////////////////////////////////////////////
	int counter = 0;
	for (int i = 1; i < 100; i += 2) {
	    counter++;
	    System.out.println(counter);
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//Given the variable userNumber, do the following:
	//Check to see if userNumber is between 1 and 100 (Valid numbers are 1, 100, and all numbers in between)
	//If it is, run a while loop that prints all integer values starting with userNumber to 100
	//If not, print "Your number was not between 1 and 100." to the console.
	
	int userNumber = 99;
	if (userNumber >= 1 && userNumber <= 100) {
		int x = userNumber;
		while(x <= 100) {
		    System.out.println(i);
			x++;
		} 
	} else {
		System.out.println("Your number was not between 1 and 100.");
	}
}

	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//Create a for loop that prints out a multiplication table from 1 through 10 for a given variable num.
	//Print the multiplication table to the console
	//Make sure the spacing is the same as the expected output
	//If the value of num is 1, each iteration of the loop should look like the following:
	//1 x 1 = 1
	//1 x 2 = 2
	//1 x 3 = 3 … and so on up to 1 x 10 = 10.
	int num = 2;
	int i = 1; 
	for (i = 1; i <= 10; i++) {
		System.out.println(num + " x " + i + " = " + num*i);
	}
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Given the variables numToAdd, howManyTimes, and sumResult, do the following:
	//Create a do while loop that adds the value of numToAdd to the variable sumResult
	//You will want to set up your addition equation to add numToAdd to sumResult on each iteration of the loop.
	//The loop will run as many times as the value stored in howManyTimes.
	//Once the loop has finished running, print the value of sumResult to the console using System.out.println();
	
	int numToAdd = -3;
	int howManyTimes = 6;
	int sumResult = 0;
	 int i1 = 1;
     do {
    	 sumResult = numToAdd + sumResult; 
         i1++;
     }while (i1 <= howManyTimes);
     
	System.out.println(sumResult);
	
	
//////////////////////////////////////////////////////////////////////////////////////////
	//Using the given variable userNumber, create an if/else statement that checks to see if userNumber is more than 10 and under 100.
	//If it is, execute a do while loop that prints the value of userNumber to the console AND decrements it by 1 until userNumber is less than or equal to 10.
	//Otherwise, if userNumber is not greater than 10 and less than 100, print (exactly) "Your number is not a value that is more than 10 and less than 100." to the console, including the "." at the end
	
	int userNumber = 14;

	if (userNumber > 10 && userNumber < 100) {
		do {System.out.println(userNumber);
			userNumber--;
		}while (userNumber >= 10);
	} else {
			System.out.println("Your number is not a value that is more than 10 and less than 100.");
	}
	
	////////////////////////////////////////////////////////////////////////////////
//Write a loop (any type of loop will work) that does a countdown using the given variable countDown.
	//Check to make sure the number stored in countDown is not larger than 10, but is greater than or equal to 3
	//The loop should run from the value stored in countDown down to 1
	//Each time the loop runs, print the value of the counter followed by three periods (…)
	//Once out of the loop, print "We have lift off!"
	//Use System.out.println() to print everything to the console
	//If countDown is less than 3 or greater than 10, then the only message printed to the console is "We have lift off!"
	
	//for (int countDown = 10; countDown <= 10; countDown--) {
		//System.out.println(countDown);}
	 //else if ( countDown <= 3; String x1 = "We have liftoff!";
	//System.out.println(x1);)
	int countDown = 8;
	if (countDown >= 3 && countDown <= 10) {
        for (; countDown >= 1; countDown--) {
            System.out.println(countDown + "...");
        }
        System.out.println("We have lift off!");
    } else {
        System.out.println("We have lift off!");
    }
	////////////////////////////////////////////////////////////////////////////////////////////
	//Given the variable userWord and wordLength, create a do while loop that prints the word stored in userWord.
	//Declare a variable called counter and set it equal to wordLength, use counter to keep track of the count
	//If wordLength is less than 5 characters, then print userWord to the console 1 time
	//If the word is 5 or more characters long, then print userWord to the console wordLength number of times
	//This is how it should work: if userWord is "Loops", then wordLength would equal 5 and so "Loops" would print 5 times. If the word is "Java", then "Java" would only print 1 time because wordLength would less than 5
	
	String userWord = "Loops";
	int wordLength = userWord.length();
	
	//if (counter1 < 5) {System.out.println(userWord);
	//} else if (counter1 >= 5) {
		//do (System.out.println(userWord);)
	//}
	do{
        System.out.println(userWord);
        wordLength--;
    } while (wordLength > 0 && wordLength >= 5);
		
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////
	//Write a for loop that starts at zero and loops the length of a user-entered String saved in the given variable userWord. Every time the loop runs, the userWord is added to the given variable longString to make a repeating string.
	//For example, if String userWord = "Hello", the loop would run 5 times and concatenate the word "Hello" to longString 5 times, because "Hello" has 5 letters. The output would be HelloHelloHelloHelloHello.
		//Every time the loop processes, userWord should be added to longString
		//Outside of the for loop, use System.out.println(); to print longString to the console.
	
	String userWord1 = "Hello";
	String longString = "";
	int l = userWord1.length();
	
	if(userWord1.length() < 5) {
		longString += userWord1;
	} else {
		for(int w = 0; w < userWord1.length(); w++) {
			longString += userWord1;
		}
	} System.out.println(longString);
	
	//for (int w = 0; l < 5;); {
		//System.out.println(userWord1);
	 

}}

	
	
	

