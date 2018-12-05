/***************************************************************************

   Matthew L. Wright
   Lab # 3
   
*****************************************************************************/
   

import java.util.Scanner;

public class PassWd{
	public static void main(String[] args){
			// create a Scanner object and set space for the user's input 
		Scanner input = new Scanner(System.in);
			// declarations
		String password = "1234";
		
			// promt the user to enter the password
		System.out.println("Please enter the password");
		
			// this is where the user enters the password
		String enteredPassword = input.nextLine();
		
		if(enteredPassword.equals("1234")){
			System.out.println("Welcome Valued Customer.");
		} // end if
		else{
			System.out.println("Login incorrect!");
			System.out.println("Please try again.");
			} // end else
	} // end main method
} //end class