package com.flip.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import com.flip.configuration.Config;

import Flipkart.Flip.Base;

public class Checkout extends Base {
	
	public WebDriver driver;
	public Checkout (WebDriver driver)
	{
		this.driver=driver;
	}

	
	@FindBy(xpath=Config.Newaddress)
	public WebElement Newaddress;
	
	@FindBy(xpath=Config.Name)
	public WebElement Name;
	
	@FindBy(xpath=Config.Phonenumber)
	public WebElement Phonenumber;
	
	@FindBy(xpath=Config.Pincode)
	public WebElement Pincode;
	
	@FindBy(xpath=Config.Locality)
	public WebElement Locality;
	
	@FindBy(xpath=Config.Address)
	public WebElement Address;
	
	@FindBy(xpath=Config.City)
	public WebElement City;
	
	@FindBy(xpath=Config.State)
	public WebElement State;
	
	@FindBy(xpath=Config.Landmark)
	public WebElement Landmark;
	
	@FindBy(xpath=Config.Alternatephone)
	public WebElement Alternatephone;
	
	@FindBy(xpath=Config.Addresstype)
	public WebElement Addresstype ;
	
	@FindBy(xpath=Config.Save)
	public WebElement Save ;
	
	@FindBy(xpath=Config.Paymentoption)
	public WebElement Paymentoption ;
	
	// Business Logic
	public void checkoutpage(String myname,String phone,String pin,String local,String add,String ci,String st,String land,String alph)
	
	{
		
		Newaddress.click();
		Name.sendKeys(myname);
		Phonenumber.sendKeys(phone);
		Pincode.sendKeys(pin);
		Locality.sendKeys(local);
		Address.sendKeys(add);
		City.clear();
		City.sendKeys(ci);
		State.clear();
		State.sendKeys(st);
		Landmark.sendKeys(land);
		Alternatephone.sendKeys(alph);
		Addresstype.click();
		Save.click();
		Paymentoption.click();
		
	}
	
	
	
}
