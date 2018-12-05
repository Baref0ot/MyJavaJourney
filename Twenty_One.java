/*****************************************************************************************************

	Matthew Wright
	04/25/2018
	Mini Project
	
*****************************************************************************************************/
import java.util.Scanner;
public class Twenty_One{
	// methods
	public static int roll1(){
		int dice1 = (int)(Math.random() * 6) + 1;
		System.out.println(dice1);
		return dice1;
	}// end roll
	
	public static int roll2(){
		int dice1 = (int)(Math.random() * 6) + 1;
		int dice2 = (int)(Math.random() * 6) + 1;
		System.out.println(dice1);
		System.out.println(dice2);
		int sum = dice1 + dice2;
		return sum;
	}// end roll
	
	public static void main(String[] args){
		// Declarations
		String yes = "yes";
		String no = "no";
		Scanner input = new Scanner(System.in);
		int trackScore = 0;
		// Data Manipulation
		System.out.println("Roll the dice! Can you get exactly 21?");
	    System.out.println("Do you want to play?");
		
		String answer = input.nextLine();
			while(answer.equalsIgnoreCase(yes)){
					trackScore = roll2();
					System.out.println("Sum = " + trackScore);
			
				while(trackScore < 15){
					trackScore = trackScore + roll2();
					System.out.println("Sum = " + trackScore);
				}// end while
				
				while((trackScore > 15) && (trackScore < 21)){
					trackScore = trackScore + roll1();
					System.out.println("Sum = " + trackScore);
				}// end while
				
				if(trackScore == 21){
					System.out.println("YOU WON!!!");
				}// end if
				
				if(trackScore > 21){
					System.out.println("You Lost!!!");
				}// end if
				
				System.out.println("Do you want to play again?");
			    answer = input.nextLine();
			}// end while
	}// end main
}// end class