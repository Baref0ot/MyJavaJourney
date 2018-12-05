/*******************************************************************

Matthew Lee Wright
Lab # 4

********************************************************************/
public class DoWhileTempLoop{
	public static void main(String[] args){
		// declarations
		double fahrenheit = 0;
		System.out.println("   These are the degrees from Fahtenheit to Celsius: ");
		System.out.println("     Fahrenheit        Celsius");
        do{
			double celsius = (fahrenheit-32.0) * (5.0/9.0);
			System.out.println("     "+fahrenheit+"              "+celsius);
			fahrenheit= fahrenheit + 20;
		}// end do
		while(fahrenheit <= 300);
	}// end main
}//end class