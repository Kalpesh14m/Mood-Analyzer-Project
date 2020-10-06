package com.blz.moodanalyzer.runner;

public class MoodAnalyzer {
	public static void main(String[] args) {
		System.out.println("Hello World!!!");
		MoodAnalyzer myMood = new MoodAnalyzer();
		boolean flag = myMood.analyseMood("Sad");

		System.out.println("My Mood: " + flag);

	}

	public boolean analyseMood(String msg) {
		if (msg.contains("Sad"))
			return true;
		return false;
	}
}
