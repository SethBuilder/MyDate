import FormatIO.*;
public class MyDateTester {
	
	public static void main(String[] arg){
		
		Console con = new Console();
		
		MyDate md = new MyDate(123456);
		
		md.print(con);
		
		Person pr = new Person("Jon", "Smith", md);
		
		pr.print(con);
		
		
	}

}
