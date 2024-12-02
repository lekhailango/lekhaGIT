package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath_Locator {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();

		//Basic XPath
		WebElement phonenumber = driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']"));
		phonenumber.sendKeys("7550232425");
		
		//XPath with Text and Contains
		WebElement signup = driver.findElement(By.xpath("//span[contains(text(),'with Facebook')]"));
		signup.click();

		//XPath with Text
		WebElement login = driver.findElement(By.xpath("//a[text()='Sign up for Facebook']"));
		login.click();
		
		// XPath with contains
		WebElement loginfb = driver.findElement(By.xpath("//input[contains(@aria-label,'First')]"));
		loginfb.sendKeys("lekha");
		
		WebElement surname = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		surname.sendKeys("Ilango");
		
	}

}
