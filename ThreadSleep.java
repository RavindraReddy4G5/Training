package com.jnit.Day20_11_2020;

	public class ThreadSleep {

		public static void main(String[] args) {
			Trainee batch10=new Trainee();
			mThread x=new mThread(batch10,"Motivity");
			mThread y=new mThread(batch10,"JNIT");
			x.start();
			y.start();

		}

}
