package com.blz.moodanalyzer.runner;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestUserMoodHappy {

	@Test
	public void testHappyMood_thenAssertionSuccess() {
		MoodAnalyzer mood = new MoodAnalyzer();
		String flag = mood.analyseMood("I am in happy Mood");
		assertEquals("Happy", flag);
	}

}
