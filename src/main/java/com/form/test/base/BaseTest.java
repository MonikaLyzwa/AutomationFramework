package com.form.test.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTest {
	protected WebDriver driver;
	
	@Parameters({"browser"})
	@BeforeMethod
	protected void methodSetUp(String browser) {
		System.out.println("Method set up");
		driver = BrowserFactory.getDriver(browser);
		
	}

	@AfterMethod
	protected void methodTearDown() {
		System.out.println("Method tear down");
		driver.quit();
	}

}
