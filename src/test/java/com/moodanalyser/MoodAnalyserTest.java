package com.moodanalyser;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

	@Test
	public void GivenMessage_ReturnSad_WhenSad() {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
	String mood = moodAnalyser.analyseMood("I am in Sad mood");
	Assert.assertEquals("SAD",mood);
	}

	@Test
	public void GivenMessage_ReturnHappy_WhenNotSad() {
		MoodAnalyser moodAnalyser = new MoodAnalyser();
	String mood = moodAnalyser.analyseMood("I am in Happy mood");
 }
}