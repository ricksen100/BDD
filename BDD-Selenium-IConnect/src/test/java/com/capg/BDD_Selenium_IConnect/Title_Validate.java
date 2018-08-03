package com.capg.BDD_Selenium_IConnect;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import junit.framework.TestCase;

public class Title_Validate {

	static WebDriver driver;
   static String title;
	@Before
	public void init()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","D:\\SRINIVAS\\Selenium\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			
		}
		catch(Exception e)
		{
			
		}
	}
	@Test
	public void githubTest()
	{
		
		try {
			validate_webpage_using_title();
			linl_given_matches();
			ok();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	@Given("^Validate webpage using title$")
	public static void validate_webpage_using_title() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("http://icompass.fs.capgemini.com/");
	
		Thread.sleep(2000);
	    //throw new PendingException();
	}

	@When("^Linl given matches$")
	public static void linl_given_matches() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		/*String i = driver.getCurrentUrl();
		  System.out.println(i);
		  String j = driver.getTitle();
		  System.out.println("Your page title Is : "+j);
		  Assert.assertEquals("Only Testing",j);
		  Assert.assertEquals("Only Testing",driver.getTitle());*/
	    //throw new PendingException();
		if(driver.getTitle().equals("OpenAM (Login)"))
		{
			
		
		System.out.println("Validated");}
		else
		{
			System.out.println("Not Validated");
		}
	}

	@Then("^OK$")
	public static void ok() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}


}
