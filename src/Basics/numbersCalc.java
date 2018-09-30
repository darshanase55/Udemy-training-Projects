package Basics;

public class numbersCalc {
	public static void main (String []args){
		printName();
		addNums(5,10);
		addNums(5,5,10);
	}

	static void printName(){
		System.out.println("My name is Darshana");
	}
	
	static void addNums(int x, int y){
		System.out.println("addition of two number "+(x+y));
		
	}
	static void addNums(int x, int y, int z){
		System.out.println("addition of three "+(x+y+z));
	}
}
