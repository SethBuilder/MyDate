import FormatIO.*;
public class Person {
	
	//instance variables
	private String fname, lname;
	MyDate dob;
	
	//constructor
	public Person(String fn, String ln, MyDate d){
		
		fname = fn;
		lname = ln;
		dob = d;
	}
	
	String getFirstName() {return fname;}
	String getLastName(){return lname;}
	MyDate getDOB(){return dob;}
	
	public void print(Console con){
		
		con.print(fname + " " + lname + " " + "born on" + " ");
		dob.print(con);
	}
	
	public int age(MyDate now){
		
		return dob.differenceInYears(now);
	}
	
}

