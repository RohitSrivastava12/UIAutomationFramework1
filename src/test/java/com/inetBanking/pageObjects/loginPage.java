package com.inetBanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	//Step 1:- initialising the driver object
	WebDriver driver;
	
	//Step 2:- Locating/identifying all the web elements on that page
	@FindBy(name="uid")
	WebElement uname;
	
	@FindBy(name="password")
	WebElement pwd;
	
	@FindBy(name="btnLogin")
	WebElement login;
	
	//Step 3:-Creating the constructor
	public loginPage(WebDriver d){
		driver=d;
		PageFactory.initElements(d, this);
	}
	
	//Step 4:-Action for all the elements(Creating methods for all the elements available)
	//will take usname,passwd from main method(actual test case)
	public void setUsername(String usname) {
		uname.sendKeys(usname);
	}
	
	public void setPassword(String passwd) {
		pwd.sendKeys(passwd);
	}
	
	public void clicklogin() {
		login.click();
	}
	
	

}
