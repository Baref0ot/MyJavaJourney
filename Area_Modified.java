/**********************************************************

 Matthew Lee Wright
 Lab # 3
 
***********************************************************/
import java.util.Scanner;

public class Area_Modified{
	public static void main(String[] args){
		// creats a Scanner object
		Scanner input = new Scanner(System.in);
		/* prompts user to enter 'C' for circle, 'S' for square, or 'R' for rectangle 
		   to determine which opperation of area to use later */
		System.out.println(" Type 'C' to calculate the area of circle, ");
		System.out.println(" 'S' to calculate the area of a square, or ");
		System.out.println(" 'R' to calculate the area of a rectangle. ");
		// user enters input
		String shape = input.nextLine();			
			switch(shape){
				case "C": // Circle
					System.out.print(" Enter a radius: ");
					double radius = input.nextDouble();
					double areaC = 3.14 * radius * radius;
					System.out.println(" The area for a circle with a radius of "+radius+" is: "+ areaC);
				break;
					
				case "S": // Square
					System.out.print(" Enter the length of a side: ");
					double length = input.nextDouble();
					double areaS = length * length;
					System.out.println(" The area of a square with the length of "+length+" is: "+ areaS);
				break;
					
				case "R": // Rectangle 
					System.out.print(" Enter a height: ");
					double height = input.nextDouble();
					System.out.print(" Enter a width: ");
					double width = input.nextDouble();
					double areaR = height * width;
					System.out.println(" The area of a rectangle with the height of "+height+" and a width of "+width+" is: "+ areaR);
				break;
			}// end switch
	}// end main
}// end class