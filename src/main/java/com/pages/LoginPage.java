package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;
import com.commonactions.Commonactions;
import com.pages.HomePage;
import com.utility.Log;

public class LoginPage extends Base {
	

	
	Commonactions actions;
	//Web Elements
	@FindBy(id="txtUsername")
	WebElement username;
	
	@FindBy(id="txtPassword")
	WebElement password;
	
	@FindBy(id="btnLogin")
	WebElement loginBtn;
	
	@FindBy(xpath="//div[@id='divLogo']/img")
	private WebElement HRMlogo;
	
	
	public LoginPage() {
		PageFactory.initElements(getDriver(), this);
		
	}
	
	public String validatePageTitle() {
		return getDriver().getTitle();
	}
	
	public boolean validatePageLogo() {
		Commonactions.waitForElement(getDriver(), HRMlogo);
		return HRMlogo.isDisplayed();
	}
	
	public HomePage validateLoginFunction() {
		Commonactions.waitForElement(getDriver(), username);
		username.sendKeys(prop.getProperty("username"));
		Log.info("Entered username");
		Commonactions.waitForElement(getDriver(), password);
		password.sendKeys(prop.getProperty("password"));
		Log.info("Entered password");
		Commonactions.waitForElement(getDriver(), loginBtn);		
		loginBtn.click();
		Log.info("Clicked login button");
		
		return new HomePage();
	}


}
