import FormatIO.*;
public class MyDate {
	//INSTANCE VARIABLES
	private int day, month, year;
	
	
	//CONSTRUCTORS
	public MyDate(int d, int m, int y){
		
		day = d;
		month = m;
		
		//this is a better way for year
		year = (y>=0 && y<=20) ? y + 200 : 1900+ y;
		
		/*if(y>=0 && y<=20)
		
			year = y + 2000;
		
		else if(y>=21 && y<=99)
			
			year = y + 1900;*/
			
	}
	
	public MyDate(int ddmmyy){
		
		int yy = ddmmyy%100;
		
		//putting year in 1900 or 2000 format
		//cooler way of doing year
		year = (yy>=0&&yy<=20) ? yy+ 200 : yy + 1900;
		
		/*if(yy>=0 && yy<=20)
			
			year = yy + 2000;
		
		else if(yy>=21 && yy<=99)
			
			year = yy + 1900;*/
		//end of year
		
		int mm = (ddmmyy/100)%100;
		
		month = mm;
		
		int dd = ddmmyy/10000;
		//int dint = (int)dd%100;
		
		day = dd;
	}
	
	//END OF CONSTRUCTORS
	
	//ACCESSORS 
	public int getDay(){return day;}
	public int getMonth(){return month;}
	public int getYear(){return year;}
	public String getddmmyy(){return "" + day + month + year%100;};
	
	//METHODS
	
	public void print(Console con){
		
		con.println(day + "/" + month + "/" + year);
	}
	
	public int differenceInYears (MyDate now)
	{
		if(now.getMonth()>this.getMonth())
			return now.getYear()-this.getYear();
		
		else if(now.getMonth()<this.getMonth())
			return now.getYear()-this.getYear()-1;
		
		else if(now.getDay()>this.getDay())
			return now.getYear()-this.getYear();
		
		else if(now.getDay()<this.getDay())
			return now.getYear()-this.getYear()-1;
		
		else
			return now.getYear() - this.getYear() - 1;
		
	}
}