package com.form.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.form.test.base.BasePageObject;

public class ExercisePage extends BasePageObject<ExercisePage>{
	private By submitExerciseButton = By.xpath ("//button[@id = 'submitExercise']");
	private By clearExerciseButton = By.xpath ("//a[@class = 'form-test-link']");

	public ExercisePage(WebDriver driver) {
		super(driver);
		
	}
	
	public void waitForExercisePageToLoad () {
		waitForVisibilityOf(submitExerciseButton);
		waitForVisibilityOf (clearExerciseButton, 10);
		
	}

}
