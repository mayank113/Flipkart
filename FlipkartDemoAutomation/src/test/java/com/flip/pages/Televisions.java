package com.flip.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.flip.configuration.Config;

import Flipkart.Flip.Base;

public class Televisions extends Base {
	public WebDriver driver;
	public Televisions (WebDriver driver)
	{
		this.driver=driver;
	}
	
	@FindBy(xpath=Config.Samsung)
	public WebElement Samsung;
	
	// Business Logic
	public Cart movetelevisions()
	
	{
		Samsung.click();
		return PageFactory.initElements(driver, Cart.class);
	}
}
