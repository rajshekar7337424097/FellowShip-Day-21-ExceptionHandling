package com.bl.moodanalysers;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MoodAnalyserTest {
	
	@Test
	public  void testMoodAnalyser() {
		MoodAnalyer moodAnalyser = new MoodAnalyer();
		
		assertEquals("happy", moodAnalyser.analysemood("happy"));
		assertEquals("sad", moodAnalyser.analysemood("sad"));
		assertEquals("happy", moodAnalyser.analysemood(null));
		assertEquals("sad", moodAnalyser.analysemood(""));
		
	}

}
