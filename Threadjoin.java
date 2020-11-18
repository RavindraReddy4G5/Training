package com.jnit.Day17_11_2020;

public class Threadjoin {
	public static void main(String[] args) throws java.lang.InterruptedException {
		AliveEx al=new AliveEx();
		al.start();
		al.join();
		System.out.println("add ="+(al.x+al.y));

	}


}
