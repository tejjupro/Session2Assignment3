
package greatestOfThree;
import java.util.Scanner;

public class LargestOfThreeNumbers
// main class
{

	public static void main(String[] args) //main method
	{

	      int x, y, z;
	      System.out.println("Enter three integers ");
	      Scanner in = new Scanner(System.in); //scanner to get input from user on output
	 
	      x = in.nextInt();
	      y = in.nextInt();
	      z = in.nextInt();
	 
	      if ( x > y && x > z )  // if else loop used to satisfy condition
	         System.out.println("The Largest number is :"+x);
	      else if ( y > x && y > z )
	         System.out.println("The Largest number is :" +y);
	      else if ( z > x && z > y )
	         System.out.println("The Largest number is :" +z);
	      else   
	         System.out.println("Entered numbers are not distinct.");

	} //class ends here

} //main method ends here
