/*****************************************************************************************************

	Matthew Wright
	04/25/2018
	Price Is Right Game
	
*****************************************************************************************************/

import java.util.Scanner;
public class Price_Is_Right{
		//Declarations
		public static String yes = "yes";
		public static String no = "no";
		public static Scanner input = new Scanner(System.in);
		
	//Methods
	public static int Spin(){
		int wheel = (int)((Math.random() * 20) + 1) * 5;
		return wheel;
	}// end Spin
	
		public static int Player1(){
			System.out.println("");
			System.out.println("PLAYER 1:");
			int p1Score = Spin();
			System.out.println("  Spin 1 = "+p1Score);
			System.out.println("  Spin Again?");
			if(p1Score == 100){
			   System.out.println("  You have earned an extra Spin.");
			   System.out.println("  Take the Shot to earn more cash?");
			   String answer = input.nextLine();
			   if(answer.equalsIgnoreCase(yes)){
					int a = Spin();
					System.out.println("  EXTRA SPIN = "+a);
					if(a == 100){
						System.out.println("  YOU JUST EARNED $25,0000!!!");
					}// end nested if
					else if(a == 15){
						System.out.println("  YOU JUST EARNED $15,0000!!!");
					}// end else if
					else if(a == 5){
						System.out.println("  YOU JUST EARNED $15,0000!!!");
					}// end else if
					else{
						System.out.println("Nothing!...YOU GET NOTHING!!!");
					}// end else
				}// end nested if
				System.out.println("  You Still have one Spin left.");
			}// end if
			String answer = input.nextLine();
			if(answer.equalsIgnoreCase(yes)){
				int x = Spin();
				System.out.println("  Spin 2 = "+x);
				p1Score = (p1Score + x);
			}//end if
			System.out.println("  Total Points = "+p1Score);
			return p1Score;
		}// end Player1
		
		public static int Player2(){
			System.out.println("");
			System.out.println("PLAYER 2:");
			int p2Score = Spin();
			System.out.println("  Spin 1 = "+p2Score);
			if(p2Score == 100){
			   System.out.println("  You have earned an extra Spin.");
			   System.out.println("  Take the Shot to earn more cash?");
			   String answer = input.nextLine();
			   if(answer.equalsIgnoreCase(yes)){
					int a = Spin();
					System.out.println("  EXTRA SPIN = "+a);
					if(a == 100){
						System.out.println("  YOU JUST EARNED $25,0000!!!");
					}// end nested if
					else if(a == 15){
						System.out.println("  YOU JUST EARNED $15,0000!!!");
					}// end else if
					else if(a == 5){
						System.out.println("  YOU JUST EARNED $15,0000!!!");
					}// end else if
					else{
						System.out.println("Nothing!...YOU GET NOTHING!!!");
					}// end else
			   }// end nested if
				System.out.println("  You Still have one Spin left.");
			}//end if
			System.out.println("  Spin Again?");
			String answer = input.nextLine();
			if(answer.equalsIgnoreCase(yes)){
				int x = Spin();
				System.out.println("  Spin 2 = "+x);
				p2Score = (p2Score + x);
			}//end if
			System.out.println("  Total Points = "+p2Score);
			return p2Score;
		}// end Player2
		
		public static int Player3(){
			System.out.println("");
			System.out.println("PLAYER 3:");
			int p3Score = Spin();
			System.out.println("  Spin 1 = "+p3Score);
			if(p3Score == 100){
			   System.out.println("  You have earned an extra Spin.");
			   System.out.println("  Take the Shot to earn more cash?");
			   String answer = input.nextLine();
			   if(answer.equalsIgnoreCase(yes)){
					int a = Spin();
					System.out.println("  EXTRA SPIN = "+a);
					if(a == 100){
						System.out.println("  YOU JUST EARNED $25,0000!!!");
					}// end nested if
					else if(a == 15){
						System.out.println("  YOU JUST EARNED $15,0000!!!");
					}// end else if
					else if(a == 5){
						System.out.println("  YOU JUST EARNED $15,0000!!!");
					}// end else if
					else{
						System.out.println("Nothing!...YOU GET NOTHING!!!");
					}// end else
				}// end nested if
				System.out.println("  You Still have one Spin left.");
			}// end if
			System.out.println("  Spin Again?");
			String answer = input.nextLine();
			if(answer.equalsIgnoreCase(yes)){
				int x = Spin();
				System.out.println("  Spin 2 = "+x);
				p3Score = (p3Score + x);
			}//end if
			System.out.println("  Total Points = "+p3Score);
			return p3Score;
		}// end Player3
	
	public static void main(String [] args){
		System.out.println("");
		System.out.println("");
		System.out.println("	-The goal of the game is to spin a higher number than the other");
		System.out.println("	 two players without spinning over 100.");
		System.out.println("");
		System.out.println("	-If two people tie they both loose and the other player wins.");
		System.out.println("");
		System.out.println("	-If you spin over 100 you are out.");
		System.out.println("");
		System.out.println("");
		System.out.println("Start Game?");
		String answer = input.nextLine();
		while(answer.equalsIgnoreCase(yes)){
		System.out.println("");
		System.out.println("***There Shall ONLY be ONE WINNER***");
		// Declarations
		int a = Player1();
		int b = Player2();
		int c = Player3();
			
			System.out.println("");
			System.out.println("--------------------SUMMARY!--------------------");
				System.out.println("Player1 = "+a);
				System.out.println("Player2 = "+b);
				System.out.println("Player3 = "+c);
			System.out.println("--------------------WHO WON?--------------------");
				
				if(a > 100){
				   a = 0;
				}// end if
				if(b > 100){
					b = 0;
				}// end if
				if(c > 100){
					c = 0;
				}// end if
				
				//Player 1
				if(((a > b) && (a > c)) || ((b == c)) || (c == b)){    
						System.out.println("Player 1 = You WIN!!!");
				}else{
					System.out.println("Player 1 = You Lose!!!");
				}// end else
				
				//Player 2
				if(((b > a) && (b > c)) || ((c == a) || (a == c))){  
						System.out.println("Player 2 = You WIN!!!");
				}else{
					System.out.println("Player 2 = You Lose!!!");
				}// end else
					 
				//Player 3
				if(((c > a) && (c > b)) || ((a == b) || (b == a))){  
						System.out.println("Player 3 = You WIN!!!");
				}else{
					System.out.println("Player 3 = You Lose!!!");
				}// end else
			System.out.println("");
			System.out.println("");
			System.out.println("Play again?");
			answer = input.nextLine();
		}// end while
	}// end main
}// end class