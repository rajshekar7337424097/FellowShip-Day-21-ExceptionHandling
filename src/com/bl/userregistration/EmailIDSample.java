package com.bl.userregistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailIDSample {
	
public static void main(String[] args) {
		
		String emailPattern = "^[a-zA-Z0-9_!#$%&@'*+-/=?`{|}~[];'+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\\\.[a-zA-Z0-9-]+)*$";
		Pattern regex = Pattern.compile(emailPattern);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter EmailID :");
		String inputStr = sc.next();
		Matcher emailMatcher = regex.matcher(inputStr);
		sc.close();
		
		if(emailMatcher.matches()) {
			System.out.println(inputStr+ "is a Valid input");	
		}else {
			System.out.println(inputStr+"is Invalid mail address");
		}
	}

}
