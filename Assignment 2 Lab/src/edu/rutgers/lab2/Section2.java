package edu.rutgers.lab2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Section2 {

 public static void main (String[] args) throws IOException {
 // use Scanner to read input file name
 Scanner sc = new Scanner(System.in);
 String fileName = sc.nextLine(); // remember to import
 
 // use BufferedReader to read the first two lines of the file
FileReader fr = new FileReader(fileName);
BufferedReader br = new BufferedReader(fr);
String line1 = br.readLine();
String line2 = br.readLine();
 int rows = Integer.parseInt(line1); // TODO (Integer.parseInt("#") might be useful)
 int cols = Integer.parseInt(line2); // TODO (Integer.parseInt("#") might be useful)
 int[][] matrix = new int[rows][cols];
 // read the remaining lines
 for (int i = 0; i < rows; i++) {
 String line = br.readLine();
 // see 'split' method to break line into components by spaces
 String[] parts = line.split("TODO");
 // iterate through parts and save the information in 'matrix'.
 for (int j = 0; j < cols; j++) {
 matrix[i][j] = Integer.parseInt(parts[j]);
 }
 }
// close FileReader and BufferedReader
 // print matrix
 System.out.println(rows);
 System.out.println(cols);
 for (int i = 0; i < rows; i++) {
 for (int j = 0; j < cols; j++) {
 System.out.println(matrix[i][j] + " ");
 }
 System.out.println();
 }
 }
}