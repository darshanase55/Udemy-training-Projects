package StudentDatabase;

public class Student {
	private String name;
	private String ssn;
	private String email;
	private static int id=1;
	private String phone;
	private String city;
	private String state;
	private String userId;
	private double balance=0;
	private static final double costofcourse=100;
	private int cid=-1;
	private String[] course=new String[5];
	//user ID that is combination 
	//of Static ID, random 4-digit number between 1000 and 9000, and last 4 of SSN
	public Student(String name, String ssn) {
	this.name=name;
	this.ssn=ssn;
	id++;
	email=name.toLowerCase()+id+"@sdet.edu";	
	int ran=(int)(Math.random()*(9000-1000)+1000);//(max-min)+min fgenerate random nos in range
	//System.out.println(ran);
	userId=id+ran+ssn.substring(5);
		
	}
	
	public void enroll(String subject){
	  cid++;
	 course[cid]=subject;
	 System.out.println("Congratulations enrolled in class "+subject);
	 balance=balance+costofcourse;
	 for (int i =0;i<5;i++){
		 System.out.println(course[i]);
	 }
		 }
	public void pay(double amt){
		balance=balance-amt;
		System.out.println("Amount you still owe is "+balance+" after the payment of "+amt+"$");
		
		
	}
	public double checkBalance(){
		return balance;
	}
	public String[] showCourse(){
		return course;
	
	}
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString(){
		
		return("[Name: "+name+"]\n[userid: "+userId+"]\n[ssn: "+ssn+"]\n[email: "+email+"]\n[phone: "+phone
				+"]\n[City: "+city+"]\n[State: "+state);
	}

}
