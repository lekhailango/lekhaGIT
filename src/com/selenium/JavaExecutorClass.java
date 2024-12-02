package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaExecutorClass {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		Dimension size = driver.manage().window().getSize();
		System.out.println(size);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement value = driver.findElement(By.id("APjFqb"));
		js.executeScript("arguments[0].value='Olympics 2024';", value);
		Thread.sleep(2000);
		
		WebElement clck1 = driver.findElement(By.name("btnK"));
		js.executeScript("arguments[0].click();", clck1);
		Thread.sleep(2000);
		
		WebElement view = driver.findElement(By.xpath("//span[text()='Next']"));
		js.executeScript("arguments[0].scrollIntoView();", view);
		Thread.sleep(2000);
		
		js.executeScript("window.scroll(0,0)");
		Thread.sleep(2000);
		
		js.executeScript("window.scroll(600,200)");
		Thread.sleep(2000);
		driver.quit();
	}

}
