package com.flip.regression;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
//import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.flip.configuration.Config;
import com.flip.pages.Cart;
import com.flip.pages.Cart2;
import com.flip.pages.Checkout;
import com.flip.pages.Home;

import com.flip.pages.Televisions;

import Flipkart.Flip.Base;

public class MyTest {
	
	Base b= new Base();
	WebDriver driver = b.getDriver();
	
	@BeforeSuite
	public void setup() {
		
		
		driver.manage().window().maximize();
		driver.get(Config.Testsite);
	}
		
		@Test
		public void test01() {	
		Home hp = PageFactory.initElements(driver, Home.class);
		Televisions tp=hp.login("nautiyalanjali006@gmail.com", "Anj@1993");
		Cart cp=tp.movetelevisions();
		Cart2 cps=cp.addcart();
		Checkout co=cps.addtomycart();
		co.checkoutpage("Anjali", "8447474847", "201307", "noida", "C-40, Sector 59, Noida, Uttar Pradesh 201307 ", "Noida", "Uttar Pradesh", "near amar ujala building", "8445464745");
		
		}
		
		@AfterSuite
		public void Teardown() {
			
			
			driver.close();
		
			}
}


