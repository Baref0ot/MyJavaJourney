public class MilesToKilos{
	public static void main(String[] args){
		// declarations
		int miles = 1;
		System.out.println(" ");
		System.out.println("The following program will convert Miles 1 through 100 to Kilometers.");
		System.out.println(" ");
		System.out.println("   Miles:       Kilometers:   ");
		while( miles <= 100 ){
			double kilometers = miles * 1.609;
			System.out.println("   "+miles+"            "+kilometers);
			miles++;
		}// end while
	}// end main
}// end class