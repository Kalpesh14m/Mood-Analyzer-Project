package com.blz.moodanalyzer.runner;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestUserMoodSad {

	@Test
	public void testSadMood_thenAssertionTrue() {
		MoodAnalyzer mood = new MoodAnalyzer();
		String flag = mood.analyseMood("I am in Sad Mood");
		assertEquals("Sad", flag);
	}

}
