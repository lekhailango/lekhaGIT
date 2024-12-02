package com.poma;

import org.openqa.selenium.WebDriver;

import com.pom.BookingPage;
import com.pom.LoginPage;
import com.pom.SearchPage;
import com.pom.SelectHotelPage;

public class PageObjectManager {

	public WebDriver driver;
	
	private LoginPage lp;
	private SearchPage sp;
	private SelectHotelPage shp;
	private BookingPage bp;

	public PageObjectManager(WebDriver driver2) {
		this.driver=driver2;
	}

	public LoginPage getLp() {
		if (lp==null) {
			lp = new LoginPage(driver);
		}
		return lp;
	}

	public SearchPage getSP() {
		if (sp==null) {
			sp = new SearchPage(driver);
		}
		return sp;	
	}
	public SelectHotelPage getSHP() {
		if (shp==null) {
			shp = new SelectHotelPage(driver);
		}
		return shp;
	}
	public BookingPage getBP() {
		if (bp==null) {
			bp = new BookingPage(driver);
		}
		return bp;
	}
}


