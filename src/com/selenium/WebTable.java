package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://qavbox.github.io/demo/webtable/");
		List<WebElement> element1 = driver.findElements(By.xpath("(//table)[1]/tbody/tr/td"));
		for (WebElement alldata : element1) {
			System.out.println("All Data in the Table: " + alldata.getText());
		}
		List<WebElement> element2 = driver.findElements(By.xpath("(//table)[1]/tbody/tr[2]/td"));
		for (WebElement rowdata : element2) {
			System.out.println("Only Row Data: " + rowdata.getText());			
		}
		List<WebElement> element3 = driver.findElements(By.xpath("(//table)[1]/tbody/tr/td[4]"));
		for (WebElement columndata : element3) {
			System.out.println("Only Column Data: " + columndata.getText());
		}
		List<WebElement> element4 = driver.findElements(By.xpath("(//thead)[2]"));
		for (WebElement headdata : element4) {
			System.out.println("Headers Data: " + headdata.getText());
		}
		WebElement table2 = driver.findElement(By.xpath("(//table)[2]/tbody/tr[2]/td[5]"));
		System.out.println("The particular data from Table 2 is: " + table2.getText());
		driver.quit();
	}

}
