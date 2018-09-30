package Basics;

public class fact {

	public static void main(String[] args)
	{
		/*int f=fact(5);
		int s=sum(5);
		System.out.println(f);

		System.out.println(s);*/
		int[] arr={1,2,3,4,5};
		System.out.println(min(arr));
		System.out.println(max(arr));

		System.out.println(avg(arr));
	}
	
	static double avg(int []arr){
		int sum=0;
		for(int i=0;i<arr.length;i++){
		 sum=arr[i]+sum;
		}
		return (sum/arr.length);
	}
	static int min(int []arr){
		int min=arr[0];
	//	System.out.println(arr.length);
		for (int i=1;i<arr.length;i++){
			//System.out.println(i);
			if (min>arr[i])
				min=arr[i];
			
			
		}
		return min;
	}
	
	static int max(int []arr){
		int max=arr[0];
	//	System.out.println(arr.length);
		for (int i=1;i<arr.length;i++){
			//System.out.println(i);
			if (max<arr[i])
				max=arr[i];
			
			
		}
		return max;
	}
	
	
	
	static int sum(int n){
		if(n==0)
			return 0;
		if (n==1)
			return 1;
		return(n+sum(n-1));
		
	}
	static int fact(int n){
		// 5=n*fact(n-1)
		
		if(n==0)
			return 1;
		if (n==1)
			return 1;
		if (n==2)
			return 2;
		int j=n;
		n=n-1;
		return(j*fact(n));
		//return n;
		
		
	}
}
