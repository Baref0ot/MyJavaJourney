/*********************************************************************

	Matthew Wright
	Lab # 9
	
**********************************************************************/
public class Employee extends Person{
	//Declarations
	private String empId;
	private String salary;
	//Constructors
	public Employee(){
		super();
		setEmpID("");
		setSalary("");
	}// end  Empty Employee Construct
	public Employee(String fN, String lN, String a, String e, String eI, String sal){
		super(fN,lN,a,e);
		setEmpID(eI);
		setSalary(sal);
	}// end Emloyee Construct
	//Methods
	public void setEmpID(String eI){empId = eI;}
	public String getEmpID(){return empId;}
	
	public void setSalary(String sal){salary = sal;}
	public String getSalary(){return salary;}
	
	public void Display(){
		super.Display();
		System.out.println(" Employee ID #: "+getEmpID());
		System.out.println(" Salary: "+getSalary());
	}// end Display
	
	public static void main(String[] args){
		Employee e1;
		e1 = new Employee("Lanier", "Turley", "555 Example dr. Cartersville, GA 30120","LanierTurley555@yahoo.com","12354","700,000.00");
		e1.Display();
	}// end main
}// end class