/********************************************************************

Matthew Wright
Lab # 5

*********************************************************************/
public class MaxClass{
	public static int max(int num1, int num2, int num3){
		int max;
		if((num1 > num2) && (num1 > num3)){
			max = num1;
		}else if((num2 > num1) && (num2 > num3)){
			max = num2;
		}else{
			max = num3;
		}// end else
		return max;
	}// end max
	public static void main(String[] args){
		int maxValue;
		maxValue = max(234,23,65);
		System.out.println(maxValue);
	}// end main
}// end class