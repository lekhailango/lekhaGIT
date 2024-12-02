package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practice.expandtesting.com/dropdown#google_vignette");
		Dimension size = driver.manage().window().getSize();
		System.out.println(size);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scroll(1000, 700)");
		Thread.sleep(2000);
		
		WebElement singledd = driver.findElement(By.id("country"));
		
		Select s = new Select(singledd);
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
		
		s.selectByIndex(9);
		Thread.sleep(2000);
		s.selectByValue("IN");
		Thread.sleep(2000);
		s.selectByVisibleText("Netherlands");
		Thread.sleep(2000);
		driver.quit();
	}

}
