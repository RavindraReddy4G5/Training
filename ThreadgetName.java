package com.jnit.Day17_11_2020;

public class ThreadgetName {
	public static void main(String[] args) {
		System.out.println("Running.........."+Thread.currentThread().getName());
		Alive a=new Alive();
		Alive al=new Alive();
		System.out.println(a.getName());
		System.out.println(al.getName());
		a.setName("Ravindra");
		al.setName("Reddy");
		a.start();
		al.start();



	}

}
