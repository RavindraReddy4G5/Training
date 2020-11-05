package com.jnit.Exception;

public class OutOfBound {
	public static void main(String[] args) {
		try
		{
			int [] num= {7,8,9};
			System.out.println(num[10]);
		}
		catch(Exception e)
		{
			System.out.println("index number not in range");
		}
		
	}

}
