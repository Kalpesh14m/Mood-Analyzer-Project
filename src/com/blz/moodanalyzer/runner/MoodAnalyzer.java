package com.blz.moodanalyzer.runner;

public class MoodAnalyzer {
	public static void main(String[] args) {
		System.out.println("Hello World!!!");
		MoodAnalyzer myMood = new MoodAnalyzer();
		System.out.println("My Mood: " + myMood.analyseMood("Sad"));

	}

	public String analyseMood(String msg) {
		return msg.contains("Sad") ? "Sad" : "Happy";
	}

}
