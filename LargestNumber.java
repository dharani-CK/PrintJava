/*
This program prompts the user to enter 10 integers and displays the largest of those numbers.
*/

import java.util.Scanner; // importing a scanner class

public class LargestNumber {
	public static void main(String[] args) {
	     
	        Scanner input = new Scanner(System.in); // creating a new scanner class object
          
          // prompt the user to enter 10 integers
          System.out.println("Enter 10 integers: ");
          int num1 = input.nextInt();
          int num2 = input.nextInt();
          int num3 = input.nextInt();
          int num4 = input.nextInt();
          int num5 = input.nextInt();
          int num6 = input.nextInt();
          int num7 = input.nextInt();
          int num8 = input.nextInt();
          int num9 = input.nextInt();
          int num10 = input.nextInt();
          
          // determine the maximum number
          int largestNum = Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(Math.max
                       (Math.max(Math.max(num1, num2), num3), num4), num5), num6), num7), num8), num9), num10);
          
          // display the results
          System.out.println("The largest number is " + largestNum);
	}
}

SAMPLE RUN:
Enter 10 integers: 
1 33 45 678 45 3 89 0 5 66 enter->
The largest number is 678

