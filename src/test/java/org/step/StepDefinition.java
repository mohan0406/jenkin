package org.step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
	WebDriver driver;
	@Given("user is in fb page")
	public void user_is_in_fb_page() {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\A\\drivers\\chromedriver.exe");
 driver=new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	}
	@When("user enters username and passwpord and click login button.")
	public void user_enters_username_and_passwpord_and_click_login_button() {
	 driver.findElement(By.id("email")).sendKeys("1234567");
	 driver.findElement(By.id("pass")).sendKeys("1234567");
	 driver.findElement(By.id("loginbutton")).click();


	}

	@Then("user logged in")
	public void user_logged_in() {
	  System.out.println("Login verified");
	}

	
}
