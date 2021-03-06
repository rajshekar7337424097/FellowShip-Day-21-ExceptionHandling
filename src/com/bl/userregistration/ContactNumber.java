package com.bl.userregistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ContactNumber {
	
	public static void main(String[] args) {
		String phoneNumberPattern = "^[+]{0,1}[0-9]{0,2}[0-9]{10}$";
		Pattern regex = Pattern.compile(phoneNumberPattern);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Phone Number");
		String inputStr = sc.next();
		Matcher phoneNumberMatcher = regex.matcher(inputStr);
		sc.close();
		
		if(phoneNumberMatcher.matches()) {
			System.out.println(inputStr+"is a Valid input");
		}else {
			System.out.println(inputStr+"is a Invalid input");
		}
	}
}
