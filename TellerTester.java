/***********************************************************************

	Matthew Wright
	Lab # 9
	
************************************************************************/
public class TellerTester extends Teller{
	public static void main(String[] args){
		System.out.println("----------------------------------------------------------------------------");
		Teller t1;
		t1 = new Teller();
		t1.setFirstName("Larry");
		t1.setLastName("Bootmeg");
		t1.setAddress("333 Example blvrd. Somewhere, GA 44101");
		t1.setEmail("LarryBootmeg@yahoo.com");
		t1.setEmpID("78901");
		t1.setSalary("100,000.00");
		t1.setHoursWorked(40);
		t1.setShift("Day");
		t1.Display();
		//space
		System.out.println("");
		//space
		Teller t2;
		t2 = new Teller("Jimmy", "Dean Saugages", "777 SunShine dr. Imagination, Brain 11117","JDS@yahoo.com","00001","10,000,000.00", 40, "Day");
		t2.Display();
		System.out.println("----------------------------------------------------------------------------");
	}// end main
}// end class