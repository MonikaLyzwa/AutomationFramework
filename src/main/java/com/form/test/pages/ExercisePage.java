package com.form.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.log4testng.Logger;

import com.form.test.base.BasePageObject;

public class ExercisePage extends BasePageObject<ExercisePage>{
	private By submitExerciseButton = By.xpath ("//button[@id = 'submitExercise']");
	private By clearExerciseButton = By.xpath ("//a[@class = 'form-test-link']");
	private By exerciseNameText = By.xpath ("//h1[@class='exercise-name']");

	public ExercisePage(WebDriver driver, Logger log) {
		super(driver, log);
		
	}
	
	public void waitForExercisePageToLoad () {
		log.info("Waiting for Profile page to load");
		waitForVisibilityOf(submitExerciseButton);
		waitForVisibilityOf (clearExerciseButton, 10);
		
	}
	
	public boolean isCorrectProfileLoaded (String correctExcerciseName)
	{
		if (getText(exerciseNameText).equals(correctExcerciseName)){
			return true;
		}
		return false;
	}

}
