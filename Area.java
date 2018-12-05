/**********************************************************

 Matthew Lee Wright
 Lab # 5
 
***********************************************************/
import java.util.Scanner;

public class Area{
	// declarations
		static String circle = "C";
		static String square = "S";
		static String rectangle = "R";
		static String quit = "X";
		static Scanner input = new Scanner(System.in);
	public static String input(){
		// creates a scanner object
		// User Prompt
		System.out.println(" Enter 'C' to calculate the area of circle, ");
		System.out.println(" 'S' to calculate the area of a square, or ");
		System.out.println(" 'R' to calculate the area of a rectangle. ");
		/* user enters the shape for which they want to calculate the area*/		
			 String shape = input.nextLine();
		return shape;
	}
	public static void circle() {
		System.out.print(" Enter a radius: ");
		double radius = input.nextDouble();
		input.nextLine();
		double area = 3.14 * radius * radius;
		System.out.println(" The area for a circle with a radius of "+radius+" is: "+ area);
	
	}
	public static void square() {
			System.out.print(" Enter the length of a side: ");
			double length = input.nextDouble();
			input.nextLine();
			double area = length * length;
			System.out.println(" The area of a square with the length of "+length+" is: "+ area);
	}
	
	public static void rectangle() {
			System.out.print(" Enter a height: ");
			double height = input.nextDouble();
			System.out.print(" Enter a width: ");
			double width = input.nextDouble();
			input.nextLine();
			double area = height * width;
			System.out.println(" The area of a rectangle with the height of "+height+" and a width of "+width+" is: "+ area);
	}
	public static void calculations(String usersShape){
			double area;
			// initalize while loop
			int x = 0;
			//while(x < 99999999){
			             // Circle
				if(usersShape.equalsIgnoreCase(circle)){
						circle();
				}        // Square
				else if(usersShape.equalsIgnoreCase(square)){
					    square();
				}       // Rectangle
				else if(usersShape.equalsIgnoreCase(rectangle)){
						rectangle();
					    // quit
				}else if(usersShape.equalsIgnoreCase(quit)){
						System.exit(0);
				}
				x++;
				System.out.println(" ");
				input.nextLine();
				       // ask the user if they want to continue
				System.out.println("Try Again? If so, enter C, S, or R, otherwise type X.");	
	}           
	
	public static void main(String[] args){
		String chosenShape;
		double shapesArea;
		while (true) {
			chosenShape = input();
			calculations(chosenShape);
		}
	}// end main
}// end class