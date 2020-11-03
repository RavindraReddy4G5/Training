package com.jnit;


	abstract class Gun{
		abstract void range();
		abstract void cost();
	}
	public class Anumulous {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Gun Ak47=new Gun() {
				void range() {
					System.out.println("range of a gun is 200m");
				}
				void cost() {
					System.out.println("Cost of the gun is 100000/-");
				}
			};
			Gun m416=new Gun() {
				void range() {
					System.out.println("range of the is 1km");
				}
				void cost() {
					System.out.println("Cost of the gun m416  is 400000/-");
				}
			};
			Ak47.range();
			Ak47.cost();
			m416.range();
			m416.cost();
		}


}
