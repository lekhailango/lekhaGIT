package com.testrunner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.project.BaseClass;

public class Testclass extends BaseClass{

	public static void main(String[] args){
		launchBrowser("chrome");
		launchUrl("https://www.facebook.com/login/");
		
		WebElement username = driver.findElement(By.id("email"));
		input(username, "7550232425");
		
		WebElement password = driver.findElement(By.id("pass"));
		input(password, "Lekha@123");
		
		WebElement loginButton = driver.findElement(By.id("loginbutton"));
		clickElement(loginButton);
		
		closeBrower();
	}
}
