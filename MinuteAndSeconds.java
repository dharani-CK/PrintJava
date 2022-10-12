/* This program takes input from the user in seconds and converts them into minutes + remaining seconds */

import java.util.Scanner; //importing Scanner class

public class MinuteAndSeconds
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in); //creating a scanner class object
	    
	    //prompt the user to enter input
	    System.out.print("Enter the seconds: ");
	    int seconds = input.nextInt();
	    
	    //compute seconds into minutes + seconds
	    int minutes = seconds / 60; //seconds to minutes
	    int remainingSeconds = seconds % 60; 
	    
	    //display the results
	    System.out.println("The " + seconds + " seconds contain " + minutes + " minutes and " + sec + " seconds");
		
	}
}
