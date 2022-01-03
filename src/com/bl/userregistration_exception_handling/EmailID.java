package com.bl.userregistration_exception_handling;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailID {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter EmailID :");
		
		try {
			String emailPattern = "^abc(.+)[A-Za-z0-9]{3}+(@+)bl+(.+)[co]*(.[A-Za-z]{2})$";
			Pattern regex = Pattern.compile(emailPattern);
			
			String inputStr = sc.next();
			char valu = inputStr.charAt(20);
			Matcher emailMatcher = regex.matcher(inputStr);
			System.out.println(valu);
			sc.close();
			
			if(emailMatcher.matches()) {
				System.out.println(inputStr+ "is a Valid input");
			}else {
				System.out.println(inputStr+ "is a Invalid input");
			}
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println("StringIndexOutOfboundExceptiom");
		}
	}
}
