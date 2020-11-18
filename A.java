package com.jnit.Day17_11_2020;

public class A extends Thread{
	public void run()
	{
		for(int i=0;i<20;i++)
		{
			System.out.println("i value is :"+i);
		}
	}
}
