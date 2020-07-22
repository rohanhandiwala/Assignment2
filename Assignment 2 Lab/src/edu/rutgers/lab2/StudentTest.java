package edu.rutgers.lab2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner; 

public class StudentTest {
	public static void main(String[] args) {
		// read the file path to the file using Scanner
		// read the students file using BufferedReader
		// 
		/* File Format:
		 * studentID
		 * firstNames
		 * lastName
		 * grades
		 * 
		 * studentID2
		 * firstName2
		 * lastName2
		 * grades2
		 * 
		 * ArrayList<Student> students = new ArrayList<>();
		 * while ((line != br.readLine()) != null){
		 * 		//line refers to student ID
		 * 		//br.readLine() -> firstName
		 * 		//br.readLine() -> lastName
		 * 		//br.readLine() -> grades
		 * 		//br.readLine() -> " "
		 * 		
		 * 		use information to make a new instance of a student class
		 * 		parse grades and store it inside the new instance of student
		 * 		add new student to a list of students
		 * 		
		 * }
		 * 
		 * loop through list of students
		 * and for each student print out their id and average
		 */
		ArrayList<Student> students = new ArrayList<>();
		BufferedReader br = null;
		FileReader fr = null;
		try {
			
			String fileName;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter file name: "); 
			fileName = sc.nextLine();
			sc.close();
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);
			
			String line;
			int id = 0;
			String firstN = "";
			String lastN = "";
			while ((line = br.readLine()) != null) {
				
				
				id = Integer.parseInt(line);
				line = br.readLine();
				
				firstN = line;
				line = br.readLine();
				
				lastN = line;
				line = br.readLine();
				
			    
				String[] lines = line.split(" ");
			    
				Student newStudent = new Student(id, firstN, lastN);
			    
			    for(String thing : lines) {
			    	newStudent.addGrade(Double.parseDouble(thing));
			    }
			    
				students.add(newStudent);
				br.readLine();
				
			}
			
			fr.close();
			br.close();
		}
		catch (Exception e) {
			System.out.print(e.getMessage());
		}

		for(Student getthatstudent : students) {
			System.out.println("ID: " + getthatstudent.getStudentID() + " AVG : " + getthatstudent.computeAverage());
		}
	}
		

}