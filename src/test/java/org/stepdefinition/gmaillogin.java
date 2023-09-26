package org.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.sam.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class gmaillogin extends BaseClass{
	
	@Given("To launch chrome browser and maximise window")
	public void to_launch_chrome_browser_and_maximise_window() {
	launchBrowser();
	WindowMaximize();
	}

	@When("To launch the url of the gmail application")
	public void to_launch_the_url_of_the_gmail_application() {
	    launchUrl("https://accounts.google.com/");
	}

	@When("To pass the valid email in email field")
	public void to_pass_the_valid_email_in_email_field() {
	   WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
	   email.sendKeys(" ");
	}

	@When("To check whether navigate to home page or not")
	public void to_check_whether_navigate_to_home_page_or_not() {
	   WebElement Nxt = driver.findElement(By.xpath("//span[text()='Next']"));
	   Nxt.click();
	}
	@Then("To close the chrome browser")
	public void to_close_the_chrome_browser() {
	  closeEntireBrowser();
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
