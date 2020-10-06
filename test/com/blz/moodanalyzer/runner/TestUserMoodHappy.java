package com.blz.moodanalyzer.runner;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestUserMoodHappy {

	@Test
	public void testHappyMood_thenAssertionSuccess() {
		MoodAnalyzer mood = new MoodAnalyzer();
		assertEquals("Happy", mood.analyseMood("I am in happy Mood"));
	}

}
