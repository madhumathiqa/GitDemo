package com.maven.selenium.jenkins;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Amazonlogin {
	WebDriver driver,driver1;
	
	@BeforeTest
	public void setdriver() 
	{	
		//Step1:set the property
		System.setProperty("webdriver.chrome.driver","/Users/diyasaravanan/Applications/Chromedriver/chromedriver"); 
		driver=new ChromeDriver();
		driver1=new ChromeDriver();
		
	}
	
	@Test
	public void openAmazonUrl()
	{
		System.out.println("Opening Amazon homepage");
		driver.get("https://www.amazon.com");
		
	}
	
	@Test
	public void openGogoleUrl()
	{
		System.out.println("Opening Google homepage in chrome");
		driver1.get("https://www.google.com");
	}
	
	@AfterTest
	public void close() {
		driver.close();
		System.out.println("hai");
	}
	
	

}
