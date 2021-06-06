package com.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;
import com.commonactions.Commonactions;
import com.utility.Log;

public class HomePage extends Base {


	@FindBy(xpath="//a[@id='welcome']")
	private WebElement welcomeTxt;
	
	@FindBy(xpath="//div[@id='welcome-menu']/ul/li[2]/a")
	private WebElement logoutLink;
	
	
	public void logout() {
		Commonactions.waitForElement(getDriver(), welcomeTxt).click();
		Commonactions.waitForElement(getDriver(), logoutLink).click();
		Log.info("Logout successfull");
	}
	

	
}
