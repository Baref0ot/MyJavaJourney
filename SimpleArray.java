/***********************************************************************

	Matthew Wright
	Lab # 6

************************************************************************/
public class SimpleArray{
	public static void main(String[] args){
			// create an array
		int simpArry[] = new int[100];
			// filling the array
		for(int i = 0; i <= 99; i++){
			simpArry[i] = (i + 500);
		}// end for
			// print the contents of the array
		for(int i = 0; i <= 99; i++){
			System.out.println("simpArry["+i+"] = "+simpArry[i]);
		}// end for
	}// end main
}// end class