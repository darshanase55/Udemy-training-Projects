package Basics;

public class SalaryCalculator {
public static void main(String [] args){
	//var for defining career 
	// computer the salary
	//rate*hrsperweek*weeksperyear
	String career = null;
	System.out.println("Programs begins");
	career="Software developer";
	System.out.println("My career is "+ career);
	int hrsperweek=40;
	int weeksperyear=50;
	double rate=42.50;
	double salary= hrsperweek*weeksperyear*rate;
	System.out.println("My salary as a "+ career+" at the rate of "+ rate+" is "+salary);
}
}
