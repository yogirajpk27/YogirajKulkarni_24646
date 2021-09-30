package com.cybage.exception;

import java.util.Scanner;

public class Assign2 {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {

		Assign2 s = studentData();
	}

	public static Assign2 studentData() {
		try {
			System.out.println("enter name");
			String name = scanner.nextLine();
			
			System.out.println("subject 1 marks");
			int s1 = Integer.parseInt(scanner.nextLine());
			
			System.out.println("subject 2 marks");
			int s2 = Integer.parseInt(scanner.nextLine());
			
			System.out.println("subject 3 marks");
			int s3 = Integer.parseInt(scanner.nextLine());
			
			return new Assign2();
		}
		catch(NumberFormatException e) {
			throw new NumberFormatException("number needeed");
		}
	}
}
