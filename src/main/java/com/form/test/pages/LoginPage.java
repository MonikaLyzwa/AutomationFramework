package com.form.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.form.test.base.BasePageObject;

public class LoginPage extends BasePageObject<LoginPage> {

	private static final String url = "http://www.formtest.com/";
	private By loginField = By.xpath("//input[@id= 'login']");
	private By passwordField = By.xpath("//input[@id = 'password']");
	private By signInButton = By.xpath("//button[@type ='submit']");
	private By errorMessage = By.xpath("//span[@data-automation-id='login-failure-help-message']");

	public LoginPage(WebDriver driver) {
		super(driver);	
	}
	
	public void openLogInPage() {
		getPage(url);
	}
	
	public void fillUpLoginAndPassword (String login, String password){
		System.out.println("Filling up email and password");
		type(login, loginField);
		type(password, passwordField);
	}
	
	public ExercisePage pushSignInButton(){
		System.out.println("Clicking on Sign in button");
		clickBy(signInButton);
		return new ExercisePage(driver);
		
	}

	public String getLogInErrorMessage() {
		waitForVisibilityOf(errorMessage,10);
		return getText(errorMessage);
	}
		
}

	

