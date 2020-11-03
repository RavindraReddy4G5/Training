package com.jnit;
class Bike
{
	 void parts() {
		 System.out.println(" ready to repair the bike");
		 Person ram=new Person();
		 ram.worker();
	 }
	 
	  class Person
	 {
	 void worker() {
		 System.out.println("workers are available");
	 }
	 }
}

public class NestedClass {
	public static void main(String[] args) {
		Bike bike=new Bike();
		bike.parts();
		//Bike.Person ram=new Bike().new Person(); ram.worker();//
		// Bike.Person ram=bike.new Person(); ram.worker();//
			
		
	}

}
