package com.moodanalyser;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

	@Test
	public void GivenMessage_ReturnSad_WhenSad() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad mood");
	String mood = moodAnalyser.analyseMood();
	Assert.assertEquals("SAD",mood);
	}

	@Test
	public void GivenMessage_ReturnHappy_WhenNotSad() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Happy mood");
	String mood = moodAnalyser.analyseMood();
	Assert.assertEquals("HAPPY",mood);
 }
	
	@Test
	public void GivenMessage_ReturnHappy_WhenInvalidmood() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am in null mood");
	String mood = moodAnalyser.analyseMood();
	Assert.assertEquals("HAPPY",mood);
}
}