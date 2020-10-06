package com.blz.moodanalyzer.runner;

public class MoodAnalyzer {
	public static void main(String[] args) {
		System.out.println("Hello World!!!");
		MoodAnalyzer myMood = new MoodAnalyzer();
		boolean flag = myMood.analyseSadMood("Sad");

		System.out.println("My Mood: " + flag);

	}

	public boolean analyseSadMood(String msg) {
		if (msg.contains("Sad"))
			return true;
		return false;
	}

	public boolean analyseHappyMood(String msg) {
		if (msg.contains("Happy"))
			return true;
		return false;
	}

}
