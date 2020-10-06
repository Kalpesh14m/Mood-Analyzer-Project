package com.blz.moodanalyzer.runner;

public class MoodAnalyzer {
	public static void main(String[] args) {
		System.out.println("Hello World!!!");
		MoodAnalyzer myMood = new MoodAnalyzer();
		boolean flag = myMood.analyseMood("sad");

		System.out.println("My Mood: " + flag);

	}

	public boolean analyseMood(String msg) {
		if (msg.equalsIgnoreCase("happy"))
			return true;
		return false;
	}
}
