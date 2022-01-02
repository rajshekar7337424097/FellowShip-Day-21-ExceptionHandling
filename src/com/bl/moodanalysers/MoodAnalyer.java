package com.bl.moodanalysers;

public class MoodAnalyer {
	
	public String analysemood(String mood) {
		try {
			if(mood == null || mood.isEmpty()) {
				throw new InvalidMoodException("Null Value passed");
			}
			int a = 10 / 0;
		}catch (InvalidMoodException e) {
			e.printStackTrace();
			return "happy";
		}catch (Exception e) {
			e.printStackTrace();
		}
		return mood;
	}
	
	public static void main(String[] args) {
		try {
			int a = 10 / 0;
			
			System.out.println(a);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		int b = 15 / 2;
		System.out.println(b);
	}
}
