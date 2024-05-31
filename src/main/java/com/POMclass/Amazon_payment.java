package com.POMclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_payment {
	public WebDriver driver;
	
	
	@FindBy(xpath ="//*[@id=\"sc-buy-box-ptc-button\"]/span/input")
	private WebElement proceed_btn;

	@FindBy(xpath ="//*[@id=\"orderSummaryPrimaryActionBtn\"]/span/input")
	private WebElement default_Btn;
	
//	@FindBy(xpath = "//*[@id=\"pp-oCEz3r-96\"]/div/div/div/div/div[2]")
	//private WebElement crdr_option_btn;
	
//	@FindBy(xpath = "//*[@id=\"pp-oCEz3r-94\"]")
//	private WebElement card_link;
	
//	@FindBy(xpath ="//*[@id=\"pp-oCEz3r-94\"]")
//	private WebElement cardnum_applybtn;
	
	
	
	
	public Amazon_payment(WebDriver driver2) {
		this .driver =driver2;
		PageFactory.initElements(driver2, this);
	}


	public WebElement getProceed_btn() {
		return proceed_btn;
	}




	public WebElement getDefault_Btn() {
		return default_Btn;
	}




	public WebElement getCrdr_option_btn() {
		return crdr_option_btn;
	}




	public WebElement getCard_link() {
		return card_link;
	}




	public WebElement getCardnum_btn() {
		return cardnum_btn;
	}


	


	
	
	
	
}

