package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelPage {

	public WebDriver driver;
	
	@FindBy(name="radiobutton_0")
	private WebElement radiobutton_0;
	
	@FindBy(xpath="//input[@name='continue']")
	private WebElement Continue;

	public WebElement getContinue() {
		return Continue;
	}

	public SelectHotelPage(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getRadiobutton_0() {
		return radiobutton_0;
	}

	public void setRadiobutton_0(WebElement radiobutton_0) {
		this.radiobutton_0 = radiobutton_0;
	}

	public WebDriver getDriver() {
		return driver;
	}
}
