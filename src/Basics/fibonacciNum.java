package Basics;

public class fibonacciNum {
//011235.. sum of prev two numbs
public static void main(String [] args){
	int fib= fib(5);
	System.out.println(fib);
}

static int fib(int n){
	
	if(n==0)
		return 0;
	else if (n==1)
		return 1;
	else return( fib(n-1)+fib(n-2));
}
}