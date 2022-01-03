package com.bl.userregistration_exception_handling;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LastNameException {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Last Name :");
		
		try {
			String lastNamePattern = "^[A-Z]{1}[a-z]{3,9}$";
			Pattern regex = Pattern.compile(lastNamePattern);
			
			String inputStr = sc.next();
			char valu = inputStr.charAt(30);
			Matcher lastNameMatcher = regex.matcher(inputStr);
			System.out.println(valu);
			
			sc.close();
			
			if(lastNameMatcher.matches()) {
				System.out.println(inputStr+"is a Valid input");
			}else {
				System.out.println(inputStr+"is a Invalid input");
			}
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println("StringIndexOutOfBoundException");
		}
	}
}
