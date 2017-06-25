package com.form.test;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.form.test.base.BaseTest;
import com.form.test.base.CsvDataProvider;
import com.form.test.pages.ExercisePage;
import com.form.test.pages.LoginPage;



public class LoginTest extends BaseTest {
	@Test(priority = 1, groups = { "positive"})
	public void positiveLoginTest(){
		LoginPage logInPage = new LoginPage(driver);

		String expectedPageTitle = "Exercise - Form test";
		String correctExercisePage = "Exercise - Form test";
		
		//Open form test page
		logInPage.openLogInPage();
		
		//Fill up login and password
		logInPage.fillUpLoginAndPassword("monika", "haslo");
		
		//Push Sign In button and wait for page profile to load
		ExercisePage exercisePage = logInPage.pushSignInButton();
		exercisePage.waitForExercisePageToLoad();
		
		//Verifications
	    //Verify title of the page is correct - Exercise - Form test
		log.info("Verifications");
		String actualTitle = exercisePage.getTitle();
		Assert.assertTrue(expectedPageTitle.equals(actualTitle), 
				"Page title is not expected.\nExpected:" + expectedPageTitle + "nActual:" + actualTitle);
		
		//Verify correct name, surname, email, age
		Assert.assertTrue(exercisePage.isCorrectProfileLoaded(correctExercisePage), "Exercise name is not expected");
		
		//Fill up name, surname, email and age
		//Push Submit button 
		
		//Clear all filled in fields
	}
		
		@Test(dataProvider = "CsvDataProvider", dataProviderClass = CsvDataProvider.class, priority = 2, groups = { "negative", "broken"})
		public void negativeLoginTest(Map<String, String> testData, Logger log){
			String expectedErrorMessage = "Login incorrect.";
			String testNumber = testData.get("no");
			String login = testData.get("login");
			String password = testData.get("password");
			String description = testData.get("description");
			
			log.info("Test No #" + testNumber + "for" + description + "Where\nEmail:" + login + "\nPassword:" + password);
			
			LoginPage logInPage = new LoginPage(driver);
			
			//Open form test page
			logInPage.openLogInPage();
			
			//Fill up login and password
			logInPage.fillUpLoginAndPassword("login", "password");
			
			//Push Sign In button and wait for page profile to load
			logInPage.pushSignInButton();
			
			String errorMessage = logInPage.getLogInErrorMessage();
			
			Assert.assertTrue(errorMessage.contains(expectedErrorMessage), 
					"Error message is not expected. Expected" + expectedErrorMessage + "nActual:" + errorMessage + ".");
	}

}
