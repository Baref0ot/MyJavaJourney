/***********************************************

Matthew Wright
Lab # 5

************************************************/
public class AvgClass{
	public static double avg(double num1, double num2, double num3, double num4){
		double avg = (num1 + num2 + num3 + num4) / 4;
		return avg;
	}// end avg
	public static void main(String[] args){
		double average;
		average = avg(2,2,2,99);
		System.out.println(average);
	}// end main
}// end class