package com.jnit.Day17_11_2020;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Sample {
	public static void main(String[] args) throws IOException {
		System.out.println("===========Student Details===========");
		Student siddu=new Student(100,"Prasad Mld",75.00);
		File f1=new File("D://student.txt");
		f1.createNewFile();
		FileOutputStream fos=new FileOutputStream(f1);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		siddu.Display();
		oos.writeObject(siddu);
		oos.flush();
		oos.close();
		fos.close();




	}

}
