package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		WebElement search = driver.findElement(By.className("Pke_EE"));
		search.sendKeys("Tshirt");
		
		boolean displayed = search.isDisplayed();
		System.out.println(displayed);
		
		boolean enabled = search.isEnabled();
		System.out.println(enabled);
		
		boolean selected = search.isSelected();
		System.out.println(selected);
		
		WebElement click1 = driver.findElement(By.className("_2iLD__"));
		click1.click();
	}

}
