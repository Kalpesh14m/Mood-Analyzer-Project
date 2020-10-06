package com.blz.moodanalyzer.runner;

public class MoodAnalyzer {
	public static void main(String[] args) {
		System.out.println("Hello World!!!");
		MoodAnalyzer myMood = new MoodAnalyzer();
		String mood = myMood.analyseMood("Sad");
		System.out.println("My Mood: " + mood);

	}

	public String analyseMood(String msg) {
		if (msg.contains("Sad"))
			return "Sad";
		return "Happy";
	}

}
