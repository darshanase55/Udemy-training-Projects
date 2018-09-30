package Basics;

public class bankAccount implements Iinterest {
	private String name;
	private static int id=1000;
	private String accNumber;//id+ran(2)+ssn(first2)
	
	private static final String routingNumber="0005352";// will be same for all objs final cannot chage this value
	private String ssn;
	private double balance;
	
	
	//contructors
	public bankAccount(String ssn,double initDeposit) {
	
		//System.out.println("new account created");
		id++;
		this.ssn=ssn;	
		
		setAccNumber();
		balance=initDeposit;
	}
	
	public String getAccNumber() {
		
		return accNumber;
	}

	public void setAccNumber() {
		int ran=(int) (Math.random()*100);
		accNumber=id+""+ran+ssn.substring(0, 2);
		System.out.println("Acc number "+accNumber);
	}
	
	public String getname()
	{
		return name;
	}
	public void setname(String name){
		this.name=name;
	}
	
	public void deposit(double amt){
		balance=amt+balance;
		
	}
	public double getbalance(){
		return balance;
		
	}
	
	void withdrawal(double amt){
		balance=balance-amt;
		
	}
	public void accrue(){
		balance=balance*(rate/100+1);
		
	}
}
