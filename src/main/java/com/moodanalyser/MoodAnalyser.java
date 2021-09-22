package com.moodanalyser;

public class MoodAnalyser {


	private String message;

	public MoodAnalyser() {
		this.message = null;
	}

	/*
	 * The method to take in the message via a constructor
	 */
	public MoodAnalyser(String message) {
		this.message = message;
	}

	/*
	 * The method to read the message and return Happy or sad
	 */
	public String analyseMood() {
		try {
			if (message.contains("Sad"))
				return "SAD";
			else {
				return "HAPPY";
			}
		} catch (NullPointerException e) {
			return "HAPPY";
			// TODO Auto-generated method stub

		}
	}
}
