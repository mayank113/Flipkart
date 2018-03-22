package com.flip.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flip.configuration.Config;

import Flipkart.Flip.Base;

public class Cart2 extends Base {
	
	public WebDriver driver;
	public Cart2 (WebDriver driver)
	{
		this.driver=driver;
	}

	
	@FindBy(xpath=Config.places)
	public WebElement places;
	
	// Business Logic
	public Checkout addtomycart()
	
	{
		places.click();
		return PageFactory.initElements(driver, Checkout.class);
		
		
	}
}
