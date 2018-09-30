package Basics;

public class bankAccountAPP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	bankAccount b1=new bankAccount("123456789",1000);
	bankAccount b2=new bankAccount("234567890",2000);
	bankAccount b3=new bankAccount("345678901",3000);
	b1.setname("Jim");
	b1.deposit(500);
	b1.deposit(600);
	b1.withdrawal(100);
	b1.accrue();
	System.out.println(b1.getbalance());
	System.out.println(b1.getname());
	//bankAccount b2=new bankAccount("Savings");

	}

}
