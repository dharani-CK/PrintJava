import java.util.Scanner; //importing Scanner class object

public class LinearEq
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); //creating a new Scanner class object
	    
      //prompt and read the variables for the equation 1.
	    System.out.print("For the first equation ax+by=e. Enter the values of a, b and e: ");
	    double a = input.nextDouble();
	    double b = input.nextDouble();
	    double e = input.nextDouble();
	    
      //prompt and read the variables for the equation 2.
	    System.out.print("For the second equation cx+dy=f. Enter the values of c, d and f: ");
	    double c = input.nextDouble();
	    double d = input.nextDouble();
	    double f = input.nextDouble();
	    
      //Using Cramer's rule to find the values of x and y
	    double x = ((e * d) - (b * f)) / ((a * d) - (b * c));
	    double y = ((a * f) - (e * c)) / ((a * d) - (b * c));
	    
      //Displaying the results
	    System.out.println("The value of x is " + x);
	    System.out.println("The value of y is " + y);
	}
}
