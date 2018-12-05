/*******************************************************************

Matthew Lee Wright
Lab # 4

********************************************************************/
public class ForTempLoop{
	public static void main(String[] args){
		// declarations
		double fahrenheit = 0;
		System.out.println("These are the degrees from Fahtenheit to Celsius: ");
		System.out.println("Fahrenheit        Celsius");
        for(fahrenheit=0; fahrenheit<= 300; fahrenheit+=20){
			double celsius = (fahrenheit-32.0) * (5.0/9.0);
			System.out.println(fahrenheit+"        "+celsius);
		}// end while
	}// end main
}//end class