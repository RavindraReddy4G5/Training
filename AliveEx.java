package com.jnit.Day17_11_2020;

import java.util.Scanner;

public class AliveEx extends Thread{
	int x,y;
	public void run()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter x,y values");
		x=sc.nextInt();
	    y=sc.nextInt();
	}


}
