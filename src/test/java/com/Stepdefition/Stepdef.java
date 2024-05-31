package com.Stepdefition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdef {
	static WebDriver driver;
	
	@Given("User navigated to the Instagram login page")
	public void user_navigated_to_the_instagram_login_page() {
	     driver =new EdgeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://www.instagram.com/?hl=en");
	}
	@When("User enter the valid username in the username field {string}")
	public void user_enter_the_valid_username_in_the_username_field(String username) {
	    driver.findElement(By.xpath("//input[@type='text']")).sendKeys(username);
	}
	@When("User enter the valid password in the password feild {string}")
	public void user_enter_the_valid_password_in_the_password_feild(String password) {
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
	}
	   
	@When("User click the Login button and navigated to the Instagram Home page")
	public void user_click_the_login_button_and_navigated_to_the_instagram_home_page() {
	driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]")).click();
	}
	@Then("user can Seen the Instagram Home page")
	public void user_can_seen_the_instagram_home_page() {
		System.out.print("Hom page");
	    
	}


	

	
	

}
