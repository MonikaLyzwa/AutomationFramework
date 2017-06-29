package com.form.test;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.form.test.base.BaseTest;
import com.form.test.base.CsvDataProvider;
import com.form.test.pages.ExercisePage;


public class ExerciseTest extends BaseTest {
	@Test(priority = 1, groups = { "positive"})
	public void fillInUpRequiredFieldTest(){
		ExercisePage exercisePage = new ExercisePage(driver);

		String expectedPageTitle = "Exercise - Form test";
		String correctExercisePage = "Exercise - Form test";
		
		//Verifications
	    //Verify title of the page is correct - Exercise - Form test
		log.info("Verifications");
		String actualTitle = exercisePage.getTitle();
		Assert.assertTrue(expectedPageTitle.equals(actualTitle), 
				"Page title is not expected.\nExpected:" + expectedPageTitle + "nActual:" + actualTitle);
		
		//Fill up all required fields
		exercisePage.fillUpLAllRequiredFields("Monika", "£y¿wa", "monika_lyzwa@o2.pl", "5");
		
		//Push Submit button and wait for page profile to load
		ExercisePage exercisePage = exercisePage.pushSubmitButton();
		exercisePage.waitForExercisePageToLoad();
		
		//Verify correct name, surname, email, age
		Assert.assertTrue(exercisePage.isCorrectProfileLoaded(correctExercisePage), "Exercise name is not expected");

		//Clear all filled in fields
		ExercisePage exercisePage = exercisePage.pushClearButton();
		exercisePage.waitForExercisePageToLoad();
		
	}
}		
