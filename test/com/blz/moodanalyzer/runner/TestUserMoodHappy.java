package com.blz.moodanalyzer.runner;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestUserMoodHappy {

	@Test
	public void testHappyMood_thenAssertionTrue() {
		MoodAnalyzer mood = new MoodAnalyzer();
		boolean flag = mood.analyseHappyMood("I am in Happy Mood");
		assertTrue(flag);
	}

}
