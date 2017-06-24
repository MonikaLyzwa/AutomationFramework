package com.form.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.form.test.base.BasePageObject;

public class LoginPage extends BasePageObject<LoginPage> {

	private static final String url = "http://www.formtest.com/";
	private By loginField = By.xpath("//input[@id= 'login']");
	private By passwordField = By.xpath("//input[@id = 'password']");
	private By signInButton = By.xpath("//button[@type ='submit']");

	public LoginPage(WebDriver driver) {
		super(driver);	
	}
	
	public void openLogInPage() {
		getPage(url);
	}
	
	public void fillUpLoginAndPassword (String login, String password){
		type(login, loginField);
		type(password, passwordField);
	}
	
	public ExercisePage pushSignInButton(){
		clickBy(signInButton);
		return new ExercisePage(driver);
	
		
	}
		
	}

	

