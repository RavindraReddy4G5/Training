package com.jnit.Day17_11_2020;

import java.io.Serializable;

public class Student implements Serializable{
	int Id;
	 String name;
	 double marks;

public Student(int id, String name, double marks) {
		super();
		Id = id;
		this.name = name;
		this.marks = marks;
	}
   public void Display()
   {
   	System.out.println("Id is :"+ this.Id);
   	System.out.println(("Name is :"+this.name));
   	System.out.println("Marks are :"+this.marks);
   }


}
