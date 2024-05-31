package PageObjectManager;

import org.openqa.selenium.WebDriver;

import com.Baseclass.base_amazon;
import com.POMclass.Amazon_loginPOM;
import com.POMclass.Amazon_payment;
import com.POMclass.Amazon_searchpom;

public class poma extends base_amazon{
	
	Amazon_loginPOM lp;
	Amazon_searchpom as;
	Amazon_payment ap;
	
	
	public poma(WebDriver driver) {
		
		
	}


	public Amazon_loginPOM getloginpage() {
		if (lp==null) {
			lp =new Amazon_loginPOM(driver);
		}
		return lp;
		
	}

	
	public Amazon_searchpom getsearchpage() {
		
		if (as==null) {
			as =new Amazon_searchpom(driver);
		}
		return as;
		
		
		
	}
	
	public Amazon_payment getpaymentpage() {
		
		if (ap==null) {
			ap = new Amazon_payment(driver);
		}
		return ap;
		
		
	}
	
	
	
	
	
}
