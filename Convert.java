/**************************************

Matthew Wright
Lab # 2

Takes user's input of a Celcius degree 
and converts it to Fahrenheit degree.
***************************************/
import java.util.Scanner;

public class Convert{
	public static void main(String[] args){
			// Declarations
		double cel; // Celcius
			// Setting memory aside for input to be entered through the Scanner
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a tempature in Fahrenheit.");
			/* declaring the the variable Fahr (Fahrenheit) as a double and assigning it's
			   value to be whatever degree the user inputs */
		double fahr = input.nextDouble();
			// the formula for converting Fahrenheit tempature to Celcius
		cel = (5.0 / 9.0) * (fahr - 32.0);
			// Displaying calculated Celcius results from entered Fahrenheit tempature
		System.out.println(" The tempature " +fahr+ " in Fahrenheit ");
		System.out.println("translates to " +cel+ " degrees Celcius.");
	}
} // end class
		