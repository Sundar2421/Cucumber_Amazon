package com.AmazonStepdef;



import org.openqa.selenium.By;

import com.Baseclass.base_amazon;
import com.POMclass.Amazon_loginPOM;

import PageObjectManager.poma;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefnition_Amz extends base_amazon {
	
	poma pp =new poma(driver);
	
	
	
	@Given("Launch The Url")
	public void launch_the_url() {
	    urlLaunch(driver, "https://www.amazon.in/",10 );
	    clicktheElement(driver, pp.getloginpage().pressSiginbtn());
	}
	@When("Click The Sigin Button To Navigate To The Loginpage")
	public void click_the_sigin_button_to_navigate_to_the_loginpage() {
	      clicktheElement(driver,pp.getloginpage().pressSiginbtn());
	}
	@When("user enter the valid moblienum in the moblienum feild")
	public void user_enter_the_valid_moblienum_in_the_moblienum_feild() {
	    inputvalue(driver,pp.getloginpage().getMobliebtn(),"8807815876");
	}
	@When("user click the continue Button to navigate password page")
	public void user_click_the_continue_button_to_navigate_password_page() {
	   clicktheElement(driver, pp.getloginpage().getCotinuebtn());
	}
	@When("user should click the password Button and enter the valid password in the password feild")
	public void user_should_click_the_password_button_and_enter_the_valid_password_in_the_password_feild() {
	   inputvalue(driver,pp.getloginpage().getPasswordbtm(), "Sundar@2001");
	}
	@When("user landed on the Amazon home page")
	public void user_landed_on_the_amazon_home_page() {
		clicktheElement(driver, pp.getloginpage().getSigbtn());
	  System.out.print("user on Home Page");
	}


	 
	@When("User Select the Search Bar Feild")
	public void user_select_the_search_bar_feild() {
	    clicktheElement(driver, pp.getsearchpage().getSearchbar());
	    System.out.print("Scenario2 start");
	}
	@When("User Enter The Product Name In The Search Bar")
	public void user_enter_the_product_name_in_the_search_bar() {
	  inputvalue(driver, pp.getsearchpage().getSearchbar(),"dell xps");
	}
	@When("Click The Search Button")
	public void click_the_search_button() {
	 clicktheElement(driver, pp.getsearchpage().getSearchbtn());
	}
	@When("Scrolldown The Window And Click The Product")
	public void scrolldown_the_window_and_click_the_product() {
		scrollup(500);
		 clicktheElement(driver, pp.getsearchpage().getProductselection());
	 scrollup(500);
	 System.out.print("over");
	}
	@Then("Scrolldown The Page And Click The Add To Cart Button")
	public void scrolldown_the_page_and_click_the_add_to_cart_button() {
		
		windowHandler(1);
	    
	    jsClick(driver, pp.getsearchpage().getAddtocartbutton());
	    staticWait(2000);
	}

	
	
	@When("User Click The Proceed To Buy Button")
	public void user_click_the_proceed_to_buy_button() {
	   clicktheElement(driver, pp.getpaymentpage().getProceed_btn());
	}
	@When("Select default Address Button")
	public void select_default_address_button() {
	    clicktheElement(driver, pp.getpaymentpage().getDefault_Btn());
	}
	//@When("click debit or Credit Option")
	//public void click_debit_or_credit_option() {
	  //clicktheElement(driver, pp.getpaymentpage().getCrdr_option_btn();
	//}
	@When("scroll up the page")
	public void select_enter_card_details_link() {
		staticWait(10000);
	  scrollup(500);
	}
	@Then("verifi the checkout page and select apply")
	public void enter_card_number_in_the_feild() {
		System.out.print("verified");
	}
	
}
