package com.jnit;

import java.util.Scanner;

public class SumOfIntegers {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter your number ");
		int n=scanner.nextInt();
		int i=1;
		int sum=0;
		while(i<=n)
		{
		 sum=sum+i;
		 i++;
		}
		System.out.println(sum);
	}

}
