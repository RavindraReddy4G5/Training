package com.jnit.Day17_11_2020;

public class newThread {
	public static void main(String[] args) {
		B s=new B();
		Thread t=new Thread(s);
		s.start();
		for(int x=0;x<20;x++)
		{
			System.out.println("x value is :"+x);

	}

	}

}
