package edu.rutgers.lab2;


import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
//Rohan Handiwala
public class Section1 {
	public static void main(String[] args) {
		BufferedReader br = null;
		FileReader fr = null;
		try {
			// open file to read
			String fileName;
			// TODO: use scanner to read and store filename from console in file name
			Scanner sc = new Scanner(System.in);
			fileName = sc.nextLine();
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);
			String line;
			// TODO: replace methodName() with the correct method for reading while
			//((line = br.methodName()) != null)
			while ((line = br.readLine()) != null) {	
				System.out.println(line);
			}
			// print line
			
			fr.close();
			br.close();
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	
	}
	
	
}