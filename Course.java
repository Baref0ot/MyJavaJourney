/*****************************************************************************

	Matthew Wright
	Lab # 8
	
*****************************************************************************/
public class Course{
	// Declarations
	private String courseId;
	private String courseName;
	private String description;
	private String creditHour;
	//Constructors
	public Course(){
		setCourseId("");
		setCourseName("");
	    setDescription("");
		setCreditHour("");
	}
	public Course(String cid, String cN, String d, String cH){
		setCourseId(cid);
		setCourseName(cN);
		setDescription(d);
		setCreditHour(cH);
	}
	// methods
	public void setCourseId(String cId){courseId=cId;}
	public String getCourseId(){return courseId;}
	
	public void setCourseName(String cN){courseName=cN;}
	public String getCourseName(){return courseName;}
	
	public void setDescription(String desc){description=desc;}
	public String getDescription(){return description;}
	
	public void setCreditHour(String cH){creditHour=cH;}
	public String getCreditHour(){return creditHour;}
	
	public void display(){
		System.out.println("Course ID= "+getCourseId());
		System.out.println("Course Name= "+getCourseName());
		System.out.println("Description= "+getDescription());
		System.out.println("Credit Hours= "+getCreditHour());
	}// end display
	public static void main(String[] args){
		// using empty constructor
		System.out.println("----------------------------------------------------------------------------");
		Course c1;
		c1 = new Course();
		c1.setCourseId("CIST 1305");
		c1.setCourseName("Computer Concepts");
		c1.setDescription("This is an introductory course to learn O.O.P fundamentals.");
		c1.setCreditHour("3");
		c1.display();
		// using constructor with arguments
		System.out.println("");
		Course c2;
		c2 = new Course("CIST 3232", "Java Programming 1", "This is an introductory course to learn Java Programming skills", "5");
		c2.display();
		System.out.println("------------------------------------------------------------------------------");
		}//end main
}// end class