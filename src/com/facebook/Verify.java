package com.facebook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Verify {

WebDriver driver;
	
	@Test
public void loginSample() {
	driver.navigate().to("https://www.google.com");
	driver.navigate().back();
    driver.navigate().forward();
	System.out.println(driver.getTitle());
	
}
	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Surendra\\SeleniumJarFiles\\drivers\\chromedrivernew.exe");
		
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//wait for 30 seconds.
		driver.get("https://www.facebook.com/");
	System.out.println(driver.getCurrentUrl());
	}
	
	@AfterMethod
	public void close() {
		//driver.close();
	}
	//driver.close();
	
	
	
	
	
	
}

