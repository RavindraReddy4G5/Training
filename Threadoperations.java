package com.jnit.Day17_11_2020;

public class Threadoperations {
	public static void main(String[] args) {
		Thread t=new Thread();
		System.out.println(t.isAlive());
		t.start();
		System.out.println(t.isAlive());

	}

}
