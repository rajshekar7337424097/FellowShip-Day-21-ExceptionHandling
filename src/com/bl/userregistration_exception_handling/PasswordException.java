package com.bl.userregistration_exception_handling;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordException {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Password :");
		
		try {
			String passwordPattern = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@$!%*#?&])[A-Za-z0-9@$!%*#?&]{8,}$";
			Pattern regex = Pattern.compile(passwordPattern);
			
			String inputStr = sc.next();
			char valu = inputStr.charAt(10);
			Matcher passwordMatcher = regex.matcher(inputStr);
			System.out.println(valu);
			sc.close();
			
			if(passwordMatcher.matches()) {
				System.out.println(inputStr+"is a valid input");
			}else {
				System.out.println(inputStr+"is a Invalid input");
			}
		}catch(StringIndexOutOfBoundsException e){
			System.out.println("StringIndexOutOfBoundException");		
		}
	}
}
