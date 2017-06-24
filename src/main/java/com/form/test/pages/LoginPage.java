package com.form.test.pages;

import org.openqa.selenium.WebDriver;

import com.form.test.base.BasePageObject;

public class LoginPage extends BasePageObject<LoginPage> {
	private static final String URL = "http://www.formtest.com/dashboard/login";

	public LoginPage(WebDriver driver) {
		super(driver);
		
	}
	
	public void openLogInPage() {
		getPage(url);
	}
}


