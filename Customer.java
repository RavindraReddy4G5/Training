package com.jnit.Day20_11_2020;

public class Customer {
		int amount=10000;
		synchronized void withdrawl(int amount) {
			System.out.println("Going to withdraw.......");
			if(this.amount<amount)
			{
				System.out.println("Less balance go and deposite");
			try {
				wait();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
		}
			this.amount-=amount;
			System.out.println("withdrawl completed....");
	}
		synchronized void Deposite(int amount) {
			System.out.println("going to deposite");
			this.amount+=amount;
			System.out.println("Deposite is done....");
			notify();
		}



}
