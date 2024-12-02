package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethods {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.navigate().to("https://www.flipkart.com/search?q=mobiles&as=on&as-show=on&otracker=AS_Query_TrendingAutoSuggest_1_0_na_na_na&otracker1=AS_Query_TrendingAutoSuggest_1_0_na_na_na&as-pos=1&as-type=TRENDING&suggestionId=mobiles&requestId=cae48b02-88f3-4a6b-88a3-2121857d6b5b");
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		WebElement text = driver.findElement(By.className("rgHxCQ"));
		System.out.println(text.getText());
		
		
	}
}
