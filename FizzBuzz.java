package com.jnit.Day11_11_2020;

import java.util.Scanner;
/*
 * 1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz 
 */
public class FizzBuzz {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter no.of times");
		int n = scanner.nextInt();
		for (int i = 1; i <= n; i++) {
			if (i % 15 == 0)
				System.out.println("FizzBuzz" + " ");
			else if (i % 5 == 0)
				System.out.println("Buzz" + " ");
			else if (i % 3 == 0)
				System.out.println("Fizz" + " ");
			else
				System.out.println(i + " ");
		}
	}

}
