






package com.jnit;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIterater {
  public static void main(String a[]){
    ListIterator<String> listIterator = null;
    List<String> name = new ArrayList<String>();
	List<String> place = new ArrayList<String>();
	List<String> bike = new ArrayList<String>();
	List<String> area = new ArrayList<String>();
    name.add("Ravindra");
    place.add("Hyderabad");
    bike.add("MT15");
    area.add("goa");
    listIterator=name.listIterator();
    listIterator=place.listIterator();
    listIterator=bike.listIterator();
    listIterator=area.listIterator(); 
    System.out.println("Traversing the list in forward direction:");
    while(listIterator.hasNext()){
       System.out.println(listIterator.next());
    }
    System.out.println("\nTraversing the list in backward direction:");
    while(listIterator.hasPrevious()){
       System.out.println(listIterator.previous());
    }
  }
}