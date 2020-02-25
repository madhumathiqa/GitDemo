package com.maven.selenium.jenkins;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoogleLogin {

	@Test
	public void openGoogle() {

		//Step1:set the property

		System.setProperty("webdriver.chrome.driver","/Users/diyasaravanan/Applications/Chromedriver/chromedriver"); 

		//Step2:create driver instance

		WebDriver driver=new ChromeDriver();

		//Step3:open the browser

		driver.get("https://www.google.com");
		
		System.out.println("Google in GoogleLogin class");
		
		//Step4:Manage the browser
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);		
		
		driver.findElement(By.name("q")).sendKeys("Java");
		
		driver.findElement(By.name("btnK")).click();

	}
}
