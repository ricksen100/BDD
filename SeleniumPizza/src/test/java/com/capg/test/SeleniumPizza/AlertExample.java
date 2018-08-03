package com.capg.test.SeleniumPizza;

import static org.junit.Assert.*;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AlertExample{

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
		driver.get("http://localhost:8082/Selenium/alert1.html");
		Thread.sleep(2000);
		/* driver.findElement(By.id("pizza"));
		 driver.findElement(By.id("Pizza1"));
		 driver.findElement(By.id("Pizza2"));
		 driver.findElement(By.id("sel"));
		 driver.findElement(By.name("Pizza"));
		 driver.findElement(By.name("Pizza"));*/
		/*Alert alert=driver.switchTo().alert();
		*/
		/*System.out.println(alert.getText());*/
		/*alert.accept();*/
		WebElement element=driver.findElement(By.id("sel"));
		Select se=new Select(element);
		se.selectByVisibleText("Tomato");
		se.selectByVisibleText("Panner");
		//To get all the options that are selected in the dropdown.
		List<WebElement> allSelectedOptions = se.getAllSelectedOptions();
		for (WebElement webElement : allSelectedOptions)
		{
		//System.out.println("You have selected ::"+ webElement.getText());
			logger.info(""+webElement.getText());
			
		}
				System.out.println("DOne");
		logger.info("done");
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
