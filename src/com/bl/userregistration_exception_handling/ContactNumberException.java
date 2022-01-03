package com.bl.userregistration_exception_handling;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ContactNumberException {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Phone Number :");
		
		try {
			String phoneNumberPattern = "^[+]{0,1}[0-9]{0,2}[0-9]{10}$";
			Pattern regex = Pattern.compile(phoneNumberPattern);
			
			String inputStr = sc.next();
			int valu = Integer.parseInt("jhsakjk");
			Matcher contactNumberMatcher = regex.matcher(inputStr);
			System.out.println(valu);
			
			sc.close();
			
			if(contactNumberMatcher.matches()) {
				System.out.println(inputStr+"is a Valid Input");
			}else {
				System.out.println(inputStr+ "is a Invalid input");
			}
		}catch(NumberFormatException e) {
		System.out.println("NumberFormatException");
			
		}
	}
}
