package com.blz.moodanalyzer.runner;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestUserMoodSad {

	@Test
	public void testSadMood_thenAssertionTrue() {
		MoodAnalyzer mood = new MoodAnalyzer();
		boolean flag = mood.analyseMood("I am in Sad Mood");
		assertTrue(flag);
	}

}
