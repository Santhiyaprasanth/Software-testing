package org.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.sam.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class positivenegative extends BaseClass {
	@Given("User has to launch the chrome browser and maximise window")
	public void user_has_to_launch_the_chrome_browser_and_maximise_window() {
	  launchBrowser();
	  WindowMaximize();
	}

	@When("User has to launch the url of the gmail app")
	public void user_has_to_launch_the_url_of_the_gmail_app() {
	   launchUrl("https://accounts.google.com/");
	}

	@When("User has to pass the valid data {string} in email field")
	public void user_has_to_pass_the_valid_data_in_email_field(String Emaildatas) {
	    WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
	    email.sendKeys(Emaildatas);
	    		}

	@When("User has to click next")
	public void user_has_to_click_next() {
	    WebElement Nxt = driver.findElement(By.xpath("//span[text()='Next']"));
	    Nxt.click();
	}

	@Then("User has to close the chrome browser")
	public void user_has_to_close_the_chrome_browser() {
	  
	}


}
