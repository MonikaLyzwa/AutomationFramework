package com.form.test;

import org.testng.annotations.Test;

import com.form.test.base.BaseTest;
import com.form.test.pages.ExercisePage;
import com.form.test.pages.LoginPage;

public class LoginTest extends BaseTest {
	@Test
	public void positiveLoginTest(){
		LoginPage logInPage = new LoginPage(driver);
		//Open form test page
		logInPage.openLogInPage();
		//Fill up login and password
		logInPage.fillUpLoginAndPassword("monika", "haslo");
		//Push Sign In button and wait for page profile to load
		@SuppressWarnings("unused")
		ExercisePage exercisePage = logInPage.pushSignInButton();
		//Fill up name, surname, email and age
		//Push Submit button 
		//Verifications
		//Verify all required fields filed up
		//Clear all filled in fields
	}

}
