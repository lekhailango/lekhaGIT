package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		Dimension size = driver.manage().window().getSize();
		System.out.println(size);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scroll(700, 400)");
		Thread.sleep(2000);
		driver.findElement(By.id("alertButton")).click();
		Thread.sleep(2000);
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		driver.switchTo().alert().accept();
		driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(2000);
		driver.findElement(By.id("promtButton")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("Lekha");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		}

}
