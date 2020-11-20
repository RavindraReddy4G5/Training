package com.jnit.Day20_11_2020;

public class SleepDemo extends Thread {
	public void run() {
		for(int i=1;i<=5;i++) {

			try {
				Thread.sleep(5000);

			}
			catch(Exception e)
			{
				e.printStackTrace();

			}
			System.out.println(i);
		}


	}
	public static void main(String[] args) {
		SleepDemo sd=new SleepDemo();
		sd.start();
	}

}
