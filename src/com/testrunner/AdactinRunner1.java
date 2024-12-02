package com.testrunner;

import java.io.IOException;

import com.poma.PageObjectManager;
import com.project.BaseClass;

public class AdactinRunner1 extends BaseClass{

	public static void main(String[] args) throws IOException {
		launchBrowser("chrome");
		launchUrl("https://adactinhotelapp.com/");
		PageObjectManager pom = new PageObjectManager(driver);
		input(pom.getLp().getUsername(), "Lekha2128");
		input(pom.getLp().getPassword(), "Test@123");
		clickElement(pom.getLp().getLogin());
		selectByValue(pom.getSP().getLocation(), "London");
		selectByValue(pom.getSP().getHotels(), "Hotel Sunshine");
		selectByText(pom.getSP().getRoom_type(), "Super Deluxe");
		selectByValue(pom.getSP().getRooroom_nosmnos(), "3");
		clearText(pom.getSP().getDatepick_in());
		input(pom.getSP().getDatepick_in(), "18/12/2024");
		clearText(pom.getSP().getDatepick_out());
		input(pom.getSP().getDatepick_out(), "28/12/2024");
		selectByText(pom.getSP().getAdult_room(), "3 - Three");
		selectByValue(pom.getSP().getChild_room(), "2");
		clickElement(pom.getSP().getSubmit());
		clickElement(pom.getSHP().getRadiobutton_0());
		clickElement(pom.getSHP().getContinue());
		input(pom.getBP().getFirst_name(), "Lekha");
		input(pom.getBP().getLast_name(), "Ilango");
		input(pom.getBP().getAddress(), "No:1/2,ABC Street,Guindy,Chennai-32");
		input(pom.getBP().getCc_num(), "1234567891234567");
		selectByValue(pom.getBP().getCc_type(), "VISA");
		selectByText(pom.getBP().getCc_exp_month(), "December");
		selectByValue(pom.getBP().getCc_exp_year(), "2030");
		input(pom.getBP().getCc_cvv(), "123");
		clickElement(pom.getBP().getBook_now());
		explicitWait(pom.getBP().getLogout());
		scrollDown();
		screenshot("ConfirmationSS");
		clickElement(pom.getBP().getLogout());
		screenshot("LogoutSS");
		quitBrowser();
	}
}
