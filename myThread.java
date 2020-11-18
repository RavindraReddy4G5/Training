package com.jnit.Day17_11_2020;

public class myThread {
	public static void main(String[] args) {
		A s=new A();
		s.start();
		for(int x=0;x<20;x++)
		{
			System.out.println("x value is :"+x);
		}


	}


}
