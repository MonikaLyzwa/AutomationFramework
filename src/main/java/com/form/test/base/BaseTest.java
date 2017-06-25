package com.form.test.base;


import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.log4testng.Logger;

public class BaseTest {
	protected WebDriver driver;
	protected Logger log;
	
	@BeforeClass(alwaysRun = true)
	protected void setUpClass(ITestContext ctx) {
		String testName = ctx.getCurrentXmlTest().getName();
		//log = Logger.getLogger(testName);
		
	}
	
	@Parameters({"browser"})
	@BeforeMethod(alwaysRun = true)
	protected void methodSetUp(String browser) {
		log.info("Method set up");
		System.out.println("Method set up");
		driver = BrowserFactory.getDriver(browser);	
	}

	@AfterMethod(alwaysRun = true)
	protected void methodTearDown() {
		log.info("Method tear down");
		driver.quit();
	}

}
