package com.jnit.Exception;

public class NumberFormat {
	public static void main(String[] args) {
		String s1 ="ravi";
		String s2 ="kittu";
		try
		{
		int i1=Integer.parseInt(s1);
		int i2=Integer.parseInt(s2);
		int i=i1/i2;
		System.out.println(i);
		}
		catch(NumberFormatException ne)
		{
			ne.printStackTrace();
			System.out.println("string can not divided");
		}
		
		
	}

}
