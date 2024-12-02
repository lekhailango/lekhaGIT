package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownMultiple {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		Dimension size = driver.manage().window().getSize();
		System.out.println(size);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scroll(1000, 500)");
		Thread.sleep(2000);		
		WebElement multipledd = driver.findElement(By.id("ide"));		
		Select s = new Select(multipledd);
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
		s.selectByIndex(1);
		Thread.sleep(1000);
		s.selectByValue("nb");
		Thread.sleep(1000);
		s.selectByVisibleText("Visual Studio");
		Thread.sleep(1000);
//		s.deselectByVisibleText("Visual Studio");
//		Thread.sleep(1000);
//		s.deselectByValue("nb");
//		Thread.sleep(1000);
//		s.deselectByIndex(1);
//		Thread.sleep(1000);
		System.out.println("All Data");
		List<WebElement> options = s.getOptions();
		for (WebElement alldata : options){
			System.out.println(alldata.getText());
		}
		System.out.println("All Selected Options");
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for (WebElement selected : allSelectedOptions){
			System.out.println(selected.getText());
		}
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		System.out.println("The first selected option is: " + firstSelectedOption.getText());
		s.deselectAll();
		driver.quit();
	}
}
