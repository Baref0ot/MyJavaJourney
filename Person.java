/******************************************************************

	Matthew Wright
	Lab # 9


******************************************************************/
public class Person{
	// Declarations
	private String firstName;
	private String lastName;
	private String address;
	private String email;
	//Constructors
	public Person(){
		setFirstName("");
		setLastName("");
		setAddress("");
		setEmail("");
	}
	public Person(String fN, String lN, String a, String e){
		setFirstName(fN);
		setLastName(lN);
		setAddress(a);
		setEmail(e);
	}
	// Methods
	public void setFirstName(String fN){firstName = fN;}
	public String getFirstName(){return firstName;}
	
	public void setLastName(String lN){lastName = lN;}
	public String getLastName(){return lastName;}
	
	public void setAddress(String a){address = a;}
	public String getAddress(){return address;}
	
	public void setEmail(String e){email = e;}
	public String getEmail(){return email;}
	
	public void Display(){
		System.out.println(" First Name: "+getFirstName());
		System.out.println(" Last Name: "+getLastName());
		System.out.println(" Address: "+getAddress());
		System.out.println(" Email: "+getEmail());
	}// end Display
	public static void main(String[] args){
		//empty Constructor
		System.out.println("----------------------------------------------------------------------------");
		Person p1;
		p1 = new Person();
		p1.setFirstName("Jacob");
		p1.setLastName("Rittweger");
		p1.setAddress("222 Bishop Rd. Cartersville, GA 30121");
		p1.setEmail("Jacob.Rittweger@yahoo.com");
		p1.Display();
		//Constructor with Parameters
		System.out.println();
		Person p2;
		p2 = new Person("Matthew", "Wright","121 Pine Ridge Rd. NW White, GA 30184","Mattwright700@yahoo.com");
		p2.Display();
		System.out.println("----------------------------------------------------------------------------");
	}// end main
}// end class