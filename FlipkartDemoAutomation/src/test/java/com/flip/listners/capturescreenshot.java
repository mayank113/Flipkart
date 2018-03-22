package com.flip.listners;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import Flipkart.Flip.Base;
	

public class capturescreenshot extends Base implements ITestListener {

	@Override
	public void onFinish(ITestContext arg0) {
		
		Reporter.log("Passed: " +arg0.getPassedTests());
		Reporter.log("Failed: " +arg0.getFailedTests());
		
		
	}

	@Override
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
					
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		if(!result.isSuccess()) {
			
			String userDirector = System.getProperty("user.dir");
			String customLocation= "\\src\\test\\java\\com\\flip\\screenshots";
			String failureImageFileName=userDirector+customLocation+new SimpleDateFormat("MM-dd-yyyy-HH-ss").format(new GregorianCalendar().getTime())+"-"+result.getMethod().getMethodName()+ ".png";
			//will take screenshot on failure
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try
		{
			// copy failed test screenshot to the failureimagefilename
			FileUtils.copyFile(scrFile, new File(failureImageFileName));
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
		// linkup file to the script and will shows the result in testng report
		
		Reporter.log("<a href=\""+failureImageFileName + "\"><img src=\file:///" +failureImageFileName +"\" alt=\"\"" + "height='200' width='200'/>" + "<br" );
		Reporter.setCurrentTestResult(null);
		Reporter.log(result.getName()+ "--Test Failed \n");
		}
		
		
		
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

}