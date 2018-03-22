package com.flip.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.flip.configuration.Config;

import Flipkart.Flip.Base;

public class Home extends Base {
	
	public WebDriver driver;
	public Home (WebDriver driver)
	{
		this.driver=driver;
	}

	@FindBy(xpath=Config.Login)
	public WebElement Login;
	
	@FindBy(xpath=Config.Username)
	public WebElement Username;
	
	@FindBy(xpath=Config.Password)
	public WebElement Password;
	
	@FindBy(xpath=Config.LoginBttn)
	public WebElement LoginBttn;
	
	@FindBy(xpath=Config.Appliances)
	public WebElement Appliances;
	
	@FindBy(xpath=Config.TV)
	public WebElement TV;
	
	// Business Logic
	

	public Televisions login(String myusername, String mypassword)
	
	{
		
	 Login.click();	
	 Username.sendKeys(myusername);
	 Password.sendKeys(mypassword);
	 LoginBttn.click();
	 Appliances.click();
	 TV.click();
	 return PageFactory.initElements(driver, Televisions.class);
	 
	}
	
}
