package com.jnit.Day20_11_2020;

public class Test {
	public static void main(String[] args) {
		Customer reddy=new Customer();
		new Thread(){
			public void run()
			{
				reddy.withdrawl(10000);
				
			}
		}.start();
		new Thread(){
			public void run()
			{
				reddy.withdrawl(12000);
				
			}
		}.start();
			
		}

	}
	
