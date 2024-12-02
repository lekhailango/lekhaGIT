package com.selenium;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class Mini_Project {
	
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/SearchHotel.php");
		Dimension size = driver.manage().window().getSize();
		System.out.println(size);
		driver.findElement(By.id("username")).sendKeys("Lekha2128");
		driver.findElement(By.id("password")).sendKeys("Rishi@28");
		driver.findElement(By.id("login")).click();
		WebElement loc = driver.findElement(By.id("location"));
		Select s = new Select(loc);
		s.selectByValue("Melbourne");
		WebElement hotl = driver.findElement(By.id("hotels"));
		Select sc = new Select(hotl);
		sc.selectByVisibleText("Hotel Sunshine");
		WebElement rtype = driver.findElement(By.name("room_type"));
		Select sct = new Select(rtype);
		sct.selectByIndex(3);
		WebElement rnos = driver.findElement(By.id("room_nos"));
		Select sclt = new Select(rnos);
		sclt.selectByValue("2");
		WebElement date1 = driver.findElement(By.id("datepick_in"));
		date1.clear();
		date1.sendKeys("23/09/2024");
		WebElement date2 = driver.findElement(By.name("datepick_out"));
		date2.clear();
		date2.sendKeys("28/09/2024");
		WebElement Adltnos = driver.findElement(By.id("adult_room"));
		Select se = new Select(Adltnos);
		se.selectByVisibleText("4 - Four");
		WebElement chldnos = driver.findElement(By.name("child_room"));
		Select st = new Select(chldnos);
		st.selectByIndex(2);
		driver.findElement(By.name("Submit")).click();
		Actions ac = new Actions(driver);
		WebElement radiobtn = driver.findElement(By.id("radiobutton_0"));
		ac.click(radiobtn).build().perform();
		driver.findElement(By.name("continue")).click();
		driver.findElement(By.name("first_name")).sendKeys("Lekha");
		driver.findElement(By.name("last_name")).sendKeys("Ilango");
		driver.findElement(By.name("address")).sendKeys("Chennai");
		driver.findElement(By.id("cc_num")).sendKeys("1234567890987654");
		WebElement cctype = driver.findElement(By.id("cc_type"));
		Select sec = new Select(cctype);
		sec.selectByValue("VISA");
		WebElement expmnth = driver.findElement(By.name("cc_exp_month"));
		Select sele = new Select(expmnth);
		sele.selectByIndex(8);
		WebElement expyear = driver.findElement(By.id("cc_exp_year"));
		Select slect = new Select(expyear);
		slect.selectByValue("2027");
		driver.findElement(By.name("cc_cvv")).sendKeys("321");
		WebElement booknw = driver.findElement(By.id("book_now"));
		booknw.click();
		Thread.sleep(9000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scroll(0,700)");
		Thread.sleep(2000);
		TakesScreenshot ts = (TakesScreenshot)driver;
		File scr = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\lekha\\eclipse-workspace\\Selenium\\Screen\\MiniProjectSS3.png");
		FileUtils.copyFile(scr, des);
		driver.findElement(By.name("logout")).click();
		Thread.sleep(2000);
		driver.quit();
	}

}
