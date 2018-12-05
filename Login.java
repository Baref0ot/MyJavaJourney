/****************************************************************

 Matthew Lee Wright
 Lab # 3
 
*****************************************************************/
import java.util.Scanner;

public class Login{
	public static void main(String[] args){
			// Declarations
		String userId = "admin";
		String password = "ctc";
			// Create the Scanner Object
		Scanner input = new Scanner(System.in);
			// Promt the User to enter User Id and Password
		System.out.println(" Please enter the User Id and Password");
			// Users enteredUserId and enteredPassword
		System.out.print("User Id: ");
		String enteredUserId = input.nextLine();
		System.out.print("Password: ");
		String enteredPassword = input.nextLine();
			// if enteredUserId equals userId AND enteredPassword equals password
		if( enteredUserId.equals(userId) && (enteredPassword.equals(password))){
			System.out.println(" Admin User Logged In");
			} //end if
		else{
			System.out.println("Admin Login Credintials are incorrect");
			} //end else
		} //end class
} //end class