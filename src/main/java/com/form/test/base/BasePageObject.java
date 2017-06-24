package com.form.test.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePageObject<T> {
	protected WebDriver driver;
	protected WebDriverWait wait;
	
	protected BasePageObject(WebDriver driver){
		this.driver = driver;
		wait = new WebDriverWait (driver,40);
	}
	
	@SuppressWarnings("unchecked")
	protected T getPage(String url){
		driver.get(url);
		return (T) this;
	}

}
