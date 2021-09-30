package com.cybage.exception;

import java.util.Scanner;

class AgeValidation extends Exception{
	public AgeValidation(String message) {
		super(message);
	}
}

public class Person {

	static void validate(int age) throws AgeValidation{
		if(age>=18 && age<60) {
			System.out.println("Valid Age");
		}
		else {
			throw new AgeValidation("Age not valid");
		}
	}
	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(System.in)){
			System.out.println("Enter age: ");
			int age=scanner.nextInt();
			validate(age);
		}
		catch(AgeValidation e) {
			System.out.println(e);
		}
	}

}
