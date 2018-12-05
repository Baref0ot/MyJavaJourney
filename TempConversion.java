/*******************************************************************

	Matthew Lee Wright
	Lab # 6

********************************************************************/
public class TempConversion{
	public static void main(String[] args){
		// declarations
		double fahrenheit;
		double celsius;
		double fahrArry[] = new double[15];
		double celcArry[] = new double[15];
		System.out.println(" ");
		System.out.println("------------------------------------------------------------");
		System.out.println("These are the degrees from Fahtenheit to Celsius: ");
		System.out.println(" ");
		System.out.println("  Fahrenheit       Celsius");
		System.out.println(" ");
        for(int i = 0; i < 15; i++){
			fahrArry[i] = i* 20;
			celcArry[i] = (fahrArry[i]-32.0) * (5.0/9.0);
		}// end for
		/*for(int i = 0; i < 15; i++){
			celcArry[i] = celsius;
		}*/
		for(int i = 0; i < 15; i++){
			System.out.println("  " +fahrArry[i]+ "      =       " +celcArry[i]);
		}// end for
		System.out.println(" ");
		System.out.println("-------------------------------------------------------------");
	}// end main
}//end class