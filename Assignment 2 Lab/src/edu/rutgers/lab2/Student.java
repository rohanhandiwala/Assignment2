package edu.rutgers.lab2;

import java.util.ArrayList;

public class Student {

private int studentID;
private String lastName;
private String firstName;
ArrayList<Double> grades = new ArrayList<>();

// Constructor
// syntax: [access modifier] ClassName(...) {...}
public Student(int ID, String fname, String lname) {
	studentID = ID;
	firstName = fname;
	lastName = lname;	
}

// TODO
public double computeAverage() {
	if (grades.isEmpty()) {
		return 0;
	}
double avg = 0.0;
	for (int i = 0; i <grades.size(); i++) {
	avg += grades.get(i);
	}
 return avg / grades.size();
}

public void addGrade(double grade) {
	grades.add(grade);
}

public int getStudentID() {
	return this.studentID;
}

}

