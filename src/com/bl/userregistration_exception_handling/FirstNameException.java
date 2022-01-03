package com.bl.userregistration_exception_handling;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FirstNameException {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Name :");
		try {
			String firstNamePattern = "^[A-Z]{1}[a-z]{3,9}$";
			Pattern regex = Pattern.compile(firstNamePattern);
			
			String inputStr = sc .next();
			char valu = inputStr.charAt(20);
			Matcher firstNameMatcher = regex.matcher(inputStr);
			sc.close();
			System.out.println(valu);
			
			if(firstNameMatcher.matches()) {
				System.out.println(inputStr+"is a Valid input");
			}else {
				System.out.println(inputStr+"is a Invalid input");
			}
		} catch(StringIndexOutOfBoundsException e) {
			System.out.println("StringIndexOutOfBoundException");
		}	
	}
}
