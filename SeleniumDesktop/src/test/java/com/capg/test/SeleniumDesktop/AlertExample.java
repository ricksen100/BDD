package com.capg.test.SeleniumDesktop;

import static org.junit.Assert.*;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	
	WebDriver driver;
	Logger logger=Logger.getLogger(AlertExample.class.getName());
	@Test
	public void ExampleForAlert() 
	{
		try
		{
		System.setProperty("webdriver.chrome.driver","D:\\SRINIVAS\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8082/Selenium/alert.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@onclick='alertFunction()']")).click();
		Alert alert=driver.switchTo().alert();
		
		System.out.println(alert.getText());
		alert.accept();
		logger.info("Done");
		}
		catch(Exception e)
		{
			
		}
		finally
		{
			//driver.close();logger.info("Done");
		}
	}
}
