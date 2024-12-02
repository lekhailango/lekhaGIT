package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameClass {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/frame");
		driver.switchTo().frame("firstFr");
		WebElement firstname = driver.findElement(By.name("fname"));
		firstname.sendKeys("Lekha");
		WebElement lastname = driver.findElement(By.name("lname"));
		lastname.sendKeys("ilango");
		Thread.sleep(2000);
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@src='innerFrame']"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.name("email")).sendKeys("lekhailango08@gmail.com");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Watch tutorial']")).click();
		Thread.sleep(2000);
		driver.quit();
	}

}
