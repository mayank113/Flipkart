package Flipkart.Flip;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	
	public WebDriver driver = null;
	public WebDriver getDriver() {
		
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20L,TimeUnit.SECONDS) ;
		
		return driver;
		
	}
	
	
	
	

}
