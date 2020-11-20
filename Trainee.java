package com.jnit.Day20_11_2020;

public class Trainee {
		public synchronized void message(String companyName)
		{
			for(int i=0;i<10;i++) {
				System.out.println("welcome to the company");
				try {
					Thread.sleep(1000);
					System.out.println(companyName);
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		}
	}
	class mThread extends Thread
	{
		Trainee c;
		String comapnyName;
		public mThread(Trainee c,String comapnyName) {
			this.c=c;
			this.comapnyName = comapnyName;
		}
		public void run()
		{
			c.message(comapnyName);
		}
	}
	
