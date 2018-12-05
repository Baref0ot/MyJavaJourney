/*************************************************************

	Matthew Wright
	Lab # 9
	
**************************************************************/

public class Student extends Person{
	//Declarations
	private int studId;
	private String major;
	private double gpa;
	//Constructors
	public Student(){
		super();
		setStudID(0);
		setMajor("");
		setGPA(0.0);
	}//end Empty Construct
	public Student(String fN, String lN, String a, String e, int si, String m, double g){
		super(fN,lN,a,e);
		setStudID(si);
		setMajor(m);
		setGPA(g);
	}// end Construct
	//Methods
	public void setStudID(int si){studId = si;}
	public int getStudID(){return studId;}
	
	public void setMajor(String m){major = m;}
	public String getMajor(){return major;}
	
	public void setGPA(double g){gpa = g;}
	public double getGPA(){return gpa;}
	// Display
	public void Display(){
		super.Display();
		System.out.println(" Studnet ID= "+getStudID());
		System.out.println(" Major= "+getMajor());
		System.out.println(" GPA= "+getGPA());
	}// end Display
public static void main(String[] args){
	System.out.println("----------------------------------------------------------------------------");
	Student s1;
	s1 = new Student();
	s1.setFirstName("Jacob");
	s1.setLastName("Rittweger");
	s1.setAddress("222 Bishop Rd. Cartersville, GA 30121");
    s1.setEmail("Jacob.Rittweger@yahoo.com");
	s1.setStudID(33345);
	s1.setMajor("Industrial Maintenance");
	s1.setGPA(4.0);
	s1.Display();
	// space
	System.out.println("");
	// space
	Student s2;
	s2 = new Student("Matthew", "Wright", "121 Pine Ridge Rd. White, GA 30184","Mattwright700@yahoo.com",34095,"Computer Programming",3.5);
	s2.Display();
	System.out.println("----------------------------------------------------------------------------");
}// end main
}// end class