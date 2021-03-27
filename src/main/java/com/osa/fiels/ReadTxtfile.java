package com.osa.fiels;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadTxtfile {
	public static void main(String[] args) throws FileNotFoundException {
	Scanner txt=ReadTxtfile.readFile("src\\main\\resources\\file.txt");
	
	}
	public static Scanner readFile(String filePath) throws FileNotFoundException {
		File file=new File(filePath);
		Scanner scan= new Scanner(file);
		while(scan.hasNextLine()) {
		System.out.println(scan.nextLine());		
		}
		return scan;
	}
	

}
