package com.form.test;

import org.testng.annotations.Test;

import com.form.test.base.BaseTest;

public class FirstTest extends BaseTest{
		
	@Test
	public void firstTestMethod() {
				
		//open Form Test from exercise
		driver.get("http://www.formtest.com");
		System.out.println ("Form test opened. Test Passed!");
			
	}
	
}
