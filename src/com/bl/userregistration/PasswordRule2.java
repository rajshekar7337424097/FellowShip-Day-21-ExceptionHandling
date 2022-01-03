package com.bl.userregistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordRule2 {
	
	public static boolean passwordRule2(String inputStr) {
		String passwordPattern = "^[A-Za-z]{8}$";
		Pattern regex = Pattern.compile(passwordPattern);
		Matcher passwordMatcher = regex.matcher(inputStr);
		if(passwordMatcher.matches()) {
			System.out.println(inputStr+"Rule 1 is passed and Succesfully loggedin");
			return true;
		}else {
			System.out.println(inputStr+"is a Invalid input");
			return false;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Password must be 8 character password.");
		System.out.println("Enter Password :");
		String inputStr = sc.next();
		sc.close();
		passwordRule2(inputStr);
	}
}
