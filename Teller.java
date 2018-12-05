/*******************************************************************

	Matthew Wright
	Lab # 9
	
********************************************************************/
public class Teller extends Employee{
	//Declarations
	private int hoursWorked;
	private String shift;
	//Constructors
	public Teller(){
		super();
		setHoursWorked(0);
		setShift("");
	}// end Empty Construct
	public Teller(String fN, String lN, String a, String e, String eI, String sal, int hw, String sh){
		super(fN,lN,a,e, eI, sal);
		setHoursWorked(hw);
		setShift(sh);
	}// end Construct
	//Methods
	public void setHoursWorked(int hw){hoursWorked = hw;}
	public int getHoursWorked(){return hoursWorked;}
	
	public void setShift(String sh){shift = sh;}
	public String getShift(){return shift;}
	
	public void Display(){
		super.Display();
		System.out.println(" Hours Worked= "+getHoursWorked());
		System.out.println(" Shift= "+getShift());
	}// end Display
}// end class