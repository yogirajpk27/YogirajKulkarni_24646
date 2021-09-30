package com.cybage.exception;

import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
	
		int age;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the age");
		age=scanner.nextInt();
		try {
			if(age>18 && age<60)
			{
				System.out.println("Valid Age");
			}
			else {
				throw new Exception("Not Valid");
			}
			
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
			
		}
		scanner.close();




	}

}
