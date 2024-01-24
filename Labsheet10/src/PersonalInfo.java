
public class PersonalInfo {
	private Person name; // object name reference class Person
	private Date bDay;// reference class Date
	// declare a private attribute
	private int personID;
	//Default constructor
	//Postcondition : first Name = "", lastName= ""
	//dDay =1, dMount=1, dYear=1990
	//personID = 0
	PersonalInfo() {
		name = new Person();//first Name = "", lastName= ""
		bDay = new Date();//dDay =1, dMount=1, dYear=1990
		personID = 0;
	}
	//Constructor with parameter
	PersonalInfo(String first , String last , int month, int day, int year, int ID){
		name= new Person(first,last); // firstname = first , lastname = last;
		bDay= new Date(month,day,year);
		personID = ID;

	}
	//Method to set the personal information
	// invoke(call) set method form class Person and class Date
	public void setPersonalInfo(String first , String last , int month, int day, int year, int ID) {
		name.setName(first, last);
		bDay.setDate(month, day, year);
		personID = ID;
	}
	//Method to return the string of personal information
	public String toString() {
		return"Name: "+ name.toString() + "\n"+"Datee of Birth: "+bDay.toString()+"\n"+""
				+ "Personal ID : "+personID;
	
	}
	
}
