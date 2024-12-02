package com.project;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	public static WebDriver driver;
	public static WebDriver launchBrowser(String browserType){
		if(browserType.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		else if(browserType.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		else if(browserType.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		return driver;
	}
    //1
	public static WebDriver launchUrl(String Url) {
		driver.get(Url);
		return driver;
	}
	//2
	public static void closeBrower() {
		driver.close();
	}
	//3
	public static void clearText(WebElement element) {
		element.clear();
	}
	//4
	public String getText(WebElement element) {
		return element.getText();
	}
	//5
	public static void input(WebElement element, String value) {
		element.sendKeys(value);
	}
	//6
	public boolean isSelected(WebElement element) {
		return element.isSelected();
	}
	//7
	public boolean isDisabled(WebElement element) {
		return element.isDisplayed();
	}
	//8
	public boolean isEnabled(WebElement element) {
		return element.isEnabled();
	}
	//9
	public static WebDriver navigateTo(String Url) {
		driver.navigate();
		return driver;
	}
	//10
	public static void navigateBack() {
        driver.navigate().back();
    }
	//11
	public static void navigateForward() {
        driver.navigate().forward();
    }
	//12
	public static void clickElement(WebElement element) {
		element.click();
	}
	
	public static Select dropDownObject(WebElement element) {
		Select s = new Select(element);
		return s;		
	}
	//13
	public static void selectByValue(WebElement element, String value) {
		dropDownObject(element).selectByValue(value);
	}
	//14
	public static void selectByIndex(WebElement element, int index) {
		dropDownObject(element).selectByIndex(index);
	}
	//15
	public static void selectByText(WebElement element, String value) {
		dropDownObject(element).selectByVisibleText(value);
	}
	//16
	public static void isMultipleDropdown(WebElement element) {
		dropDownObject(element).isMultiple();
    }
	//17
	public static void scrollDown() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 500)");
    }
	//18
	public static void scrollUp() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, -500)");
    }
	//19
	public static void screenshot(String name) throws IOException {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File scr = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\lekha\\eclipse-workspace\\Selenium\\Screen\\"+name+".png");
		FileUtils.copyFile(scr, des);
	}
    //20
	public static void hoverOverElement(WebElement element) {
		Actions ac = new Actions(driver);
        ac.moveToElement(element).perform();
    }
	//21
	public static void doubleClick(WebElement element) {
		Actions ac = new Actions(driver);
        ac.doubleClick(element).perform();
    }
	//22
	public static void contextClick(WebElement element) {
		Actions ac = new Actions(driver);
        ac.contextClick(element).perform();
    }
	//23
	public static void deselectByValue(WebElement element, String value) {
		dropDownObject(element).deselectByValue(value);
	}
	//24
	public static void deselectByIndex(WebElement element, int index) {
		dropDownObject(element).deselectByIndex(index);
	}
	//25
	public static void deselectByText(WebElement element, String value) {
		dropDownObject(element).deselectByVisibleText(value);
	}
	//26
	public static void quitBrowser() {
		driver.quit();
	}
	//27
	public static void explicitWait(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}
