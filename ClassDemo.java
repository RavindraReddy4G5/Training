package com.jnit.Day23_11_2020;

class Load
{
	public Load()
	{
		System.out.println("Load class constructor");
	}
	static 
	{
		System.out.println("Load class -- static method");
	}
}

public class ClassDemo {

	public static void main(String[] args) 
	{
		
		try {
			Class cot=Class.forName("com.jnit.Day23_11_2020.Load");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}