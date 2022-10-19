/* This program randomly generates two single-digit integers, number1 and number2. 
With number1 >= number2, and it displays to the student a question such as “What is 9 - 2?” 
After the student enters the answer, the program displays a message indicating whether it is correct.
If number1 < number2 the values are swaped! */

import java.util.Scanner; //importing a scanner class

public class SubtractionQuiz
{
	public static void main(String[] args) {
    
		Scanner input = new Scanner(System.in); //creating a new scanner class object
		
		//generating random numbers and assigning them to num1 and num2
		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10); //generate random numbers between 0-9
		
		if(number1 < number2){ //using "if" statement to swap the values of num1 and num2 if num1 < num2
		    int temp = number1;
		    number1 = number2;
		    number2 = temp;
		}
		
		//prompt the user to enter the result
		System.out.print("What is " + number1 + " - " + number2 + "? ");
		int result = input.nextInt();
		
    //using if-else statement to check whether the entered answer is right.
		if(result == number1-number2){
		    System.out.print("You are correct. Keep it up!");
		}
		else{
		    System.out.println("The answer is incorrect. Better luck next time!");
		    System.out.println(number1 + " - " + number2 + " is " + result);
		}
    
	}
}

//Alternative method
/* 
import java.util.Scanner; //importing a scanner class

public class SubtractionQuiz
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//generating random numbers and assigning them to num1 and num2
		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10); //generate random numbers between 0-9
		
		
		//prompt the user to enter the result
		System.out.print("What is the difference between the numbers " + number1 + " and " + number2 + "? ");
		int result = input.nextInt();
		
		if(result == Math.abs(number1-number2)){
		    System.out.print("You are correct. Keep it up!");
		}
		else{
		    System.out.println("The answer is incorrect. Better luck next time!");
		}
	}
}

*/
