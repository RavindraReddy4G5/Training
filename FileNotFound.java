package com.jnit.Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFound {
	public static void main(String[] args) {
		File file=new File("D://file.txt");
		try {
			FileReader fileReader =new FileReader(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("give proper pathname");
		}
		
	}
}
