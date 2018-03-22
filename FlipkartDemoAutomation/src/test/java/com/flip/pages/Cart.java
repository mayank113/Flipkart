package com.flip.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flip.configuration.Config;

import Flipkart.Flip.Base;

public class Cart extends Base {
	
	public WebDriver driver;
	public Cart (WebDriver driver)
	{
		this.driver=driver;
	}

	
	@FindBy(xpath=Config.addtocart)
	public WebElement addtocart;
	
	// Business Logic
	public Cart2 addcart()
	
	{
		addtocart.click();
		return PageFactory.initElements(driver, Cart2.class);
		
		
	}
}
