package com.moodanalyser;

public class MoodAnalyser {


	private String message;
	public enum errortypes {
		EMPTY_MOOD_ERROR, NULL_MOOD_ERROR
	}

	public MoodAnalyser() {
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
	public String analyseMood() throws MoodAnalyserException {

		try {
			if (message.length() == 0)
				throw new MoodAnalyserException(errortypes.EMPTY_MOOD_ERROR.toString());
			else if (message.contains(("sad"))) {
				return "SAD";
			} else {
				return "HAPPY";
			}
		} catch (NullPointerException e) {
			throw new MoodAnalyserException(errortypes.NULL_MOOD_ERROR.toString());
		}
	}
	}
