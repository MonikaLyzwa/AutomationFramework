package com.form.test;

import org.testng.annotations.Test;

import com.form.test.base.BaseTest;

public class SecondTest extends BaseTest{

	@Test
	public void secondTestMethod() {

		// open LinkedIn from exercise
		driver.get("http://www.linkedin.com");
		System.out.println("LinkedIn opened. Test Passed!");

	}
}
