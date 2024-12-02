package com.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMouse {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		Actions ac = new Actions(driver);
		WebElement dbleclick = driver.findElement(By.xpath("//button[text()='Copy Text']"));
		ac.doubleClick(dbleclick).build().perform();
		WebElement drag1 = driver.findElement(By.id("draggable"));
		WebElement drop1 = driver.findElement(By.id("droppable"));
		ac.dragAndDrop(drag1, drop1).perform();
		driver.navigate().to("https://www.amazon.in/");
		driver.findElement(By.id("icp-nav-flyout")).click();
		WebElement clk1 = driver.findElement(By.xpath("//input[@value='ta_IN']"));
		ac.click(clk1).build().perform();
		WebElement clk2 = driver.findElement(By.linkText("Customer Service"));
		ac.moveToElement(clk2).perform();
		Thread.sleep(2000);
		ac.contextClick(clk2).perform();
		Thread.sleep(2000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
}
