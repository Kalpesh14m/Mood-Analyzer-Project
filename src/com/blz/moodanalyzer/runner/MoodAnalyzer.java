package com.blz.moodanalyzer.runner;

public class MoodAnalyzer {
	private String mood;

	public MoodAnalyzer(String mood) {
		this.mood = mood;
	}

	public static void main(String[] args) {
		System.out.println("Hello World!!!");
		MoodAnalyzer myMood = new MoodAnalyzer("My Sad mood");
		System.out.println("My Mood: " + myMood.analyseMood());

	}

	public String analyseMood() {
		if (mood.contains("Sad"))
			return "Sad";
		return "Happy";
	}
}
