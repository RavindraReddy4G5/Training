package com.jnit;

public class Factorial {

	public static void main(String[] args) {
		//sum of each digit of a number
		int sum=0;
		for(int n=123,rem;n>0;rem=n%10,sum=sum+rem,n=n/10);

			System.out.println("sum is="+sum);
			
			
			//sum of factorial of each digit
			int add=0,fact=1,rem,n=145;
	         while(n>0)
	         { rem=n%10;
	        	 fact=1;
	        	 while(rem>0)
	        	 {
	        		 fact=fact*rem;
	        		 rem--;
	        	 }
	        	 add=add+fact;
	        	 n=n/10;
	         }
	        	 System.out.println("sum of factorial digits is="+add);

	}

}
