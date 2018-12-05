/************************************************************************
  Matthew Lee Wright
  Ron Enz (In Class- JavaI)
  Janurary 24, 2018
*************************************************************************/

import java.util.Scanner;

public class UserInput {
  public static void main(String[] args) {
  
    // Creat a Scanner object
  Scanner input = new Scanner(System.in);
  
    // Prompt User for their salary
  System.out.println(" Please enter your salary below. ");
  double salary = input.nextDouble();
  
  // Reads the users salary back to console
  System.out.println(" Your salary is $" + salary);
  }
}

  
  