package com.moodanalyser;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
	/*
	 * to check sad mood
	 */
	@Test
	public void GivenMessage_ReturnSad_WhenSad() {

		MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad mood");
		String mood;
		try {
			mood = moodAnalyser.analyseMood();
			Assert.assertEquals("SAD", mood);
		} catch (MoodAnalyserException e) {
			System.out.println(e.getMessage());
		}
	}

	/*
	 * To check happy mood
	 */
	@Test
	public void GivenMessage_ReturnHappy_WhenNotSad() {

		MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Happy mood");
		String mood;
		try {
			mood = moodAnalyser.analyseMood();
			Assert.assertEquals("HAPPY", mood);
		} catch (MoodAnalyserException e) {
			System.out.println(e.getMessage());
		}
	}

	/*
	 * To check invalid mood
	 */
	@Test
	public void GivenMessage_ReturnHappy_WhenInvalidmood() {

		MoodAnalyser moodAnalyser = new MoodAnalyser(null);

		String mood;
		try {
			mood = moodAnalyser.analyseMood();
			Assert.assertEquals("HAPPY", mood);
		} catch (MoodAnalyserException e) {
			System.out.println(e.getMessage());
		}
	}

	/*
	 * null mood analysis Exception throw
	 */
	@Test
	public void GivenMessae_ReturnHappy_WhenMoodEmpty() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("");
		String mood;
		try {
			mood = moodAnalyser.analyseMood();
			Assert.assertEquals("HAPPY", mood);
		} catch (MoodAnalyserException e) {
			System.out.println(e.getMessage());

		}

	}
}