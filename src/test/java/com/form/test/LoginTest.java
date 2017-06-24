package com.form.test;

import org.testng.annotations.Test;

import com.form.test.base.BaseTest;
import com.form.test.pages.LoginPage;

public class LoginTest extends BaseTest {
	@Test
	public void positiveLoginTest(){
		LoginPage logInPage = new LoginPage(driver);
		//Open form test page
		//Fill up name, surname, email and age
		//Push Submit button 
		//Verifications
		//Verify all required fields filed up
	}

}
