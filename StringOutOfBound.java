package com.jnit.Exception;

public class StringOutOfBound {
	public static void main(String[] args) {
		String s1="ravindra reddy";
		try
		{
			char ch=s1.charAt(22);
			System.out.println(ch);
		}
		catch(StringIndexOutOfBoundsException se)
		{
			System.out.println("enter vallid index number");
		}
	}

}
