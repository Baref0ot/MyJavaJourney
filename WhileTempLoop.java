/*******************************************************************

Matthew Lee Wright
Lab # 4

********************************************************************/
public class WhileTempLoop{
	public static void main(String[] args){
		// declarations
		double fahrenheit = 0;
		System.out.println("These are the degrees from Fahtenheit to Celsius: ");
		System.out.println("Fahrenheit        Celsius");
        while(fahrenheit <= 300){
			double celsius = (fahrenheit-32.0) * (5.0/9.0);
			System.out.println(fahrenheit+"        "+celsius);
			fahrenheit= fahrenheit + 20;
		}// end while
	}// end main
}//end class