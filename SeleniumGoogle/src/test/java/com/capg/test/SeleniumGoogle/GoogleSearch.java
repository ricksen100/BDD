package com.capg.test.SeleniumGoogle;

import static org.junit.Assert.*;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	WebDriver driver;
	Logger logger=Logger.getLogger(GoogleSearch.class.getName());
	@Test
	public void ExampleForAlert() 
	{
		try
		{
		System.setProperty("webdriver.chrome.driver","D:\\SRINIVAS\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in");
		Thread.sleep(2000);
		 driver.findElement(By.id("lst-ib")).sendKeys("Selenium");
		 driver.findElement(By.name("btnK")).click();
		/*Alert alert=driver.switchTo().alert();
		*/
		/*System.out.println(alert.getText());*/
		/*alert.accept();*/
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
