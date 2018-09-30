package StudentDatabase;

public class StudentPortal {

	public static void main(String []args) {
		
		// TODO Auto-generated constructor stub
		
		Student s=new Student("Darshana", "908651234");
		s.setCity("Albany");
		s.setPhone("5187389483");
		s.setState("NY");
		s.enroll("english");
		s.enroll("math");
		s.pay(100.80);
		s.checkBalance();
		System.out.println(s.toString());
	}

}
