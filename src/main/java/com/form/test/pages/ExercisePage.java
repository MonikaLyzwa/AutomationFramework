package com.form.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.log4testng.Logger;

import com.form.test.base.BasePageObject;

public class ExercisePage extends BasePageObject<ExercisePage>{
	private By submitExerciseButton = By.xpath ("//button[@id = 'submitExercise']");
	private By clearExerciseButton = By.xpath ("//button[@class = 'form-test-link']");
	private By exerciseNameText = By.xpath ("//h1[@class='exercise-name']");
	private By nameText = By.xpath ("//h1[@class='nameField-name']");
	private By surnameText = By.xpath ("//h1[@class='surnameField-name']");
	private By email = By.xpath ("//h1[@class='emailField-name']");
	private By age = By.xpath ("//h1[@class='ageField-name']");

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
	
	public void fillUpLAllRequiredFields (String nameText, String surnameText, String email, Integer age){
		System.out.println("Filling up all required fields");
		type(nameText, nameField);
		type(surnameText, surnameField);
		type(email, emailField);
		type(age, ageField);
		
	}
	
	public ExercisePage pushClearButton(){
		System.out.println("Clicking on Submit button");
		clickBy(submitExerciseButton);
		return new ExercisePage(driver, log);
		
	}
	
	public ExercisePage pushSubmitButton(){
		System.out.println("Clicking on Clear button");
		clickBy(clearExerciseButton);
		return new ExercisePage(driver, log);
		
	}
		
}
