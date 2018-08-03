package com.capg.BDD;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test1 {

	/*@org.junit.Test
	public void test() {
		fail("Not yet implemented");
	}*/
	static WebDriver driver;

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
			i_want_to_login_into_github();
			i_check_the_login();
			the_result_should_be_logged_in();
		} 
		catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}
	
	@Given("^I want to login into github$")
	public static void i_want_to_login_into_github() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("https://www.github.com/login");
		Thread.sleep(2000);
	   // throw new PendingException();
	}

	@When("^I check the login$")
	public static void i_check_the_login() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("login_field")).sendKeys("ricksen100");
		 driver.findElement(By.id("password")).sendKeys("azsxdc12");
		 driver.findElement(By.name("commit")).click();
	    //throw new PendingException();
	}

	@Then("^the result should be logged in$")
	public static void the_result_should_be_logged_in() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}
	
	
    
	
}
