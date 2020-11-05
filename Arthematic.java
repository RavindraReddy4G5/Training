package com.jnit.Exception;

public class Arthematic {
	public static void main(String[] args) {
		
		int a=10 , b=0;
		try
		{
			int c=a/b;
			System.out.println(c);
			
		}
		catch(ArithmeticException ae)
		{
			ae.printStackTrace();
			System.out.println("a number cannot divisible by zero");
		}
		
	}

}
