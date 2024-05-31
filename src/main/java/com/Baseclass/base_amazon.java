package com.Baseclass;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class base_amazon{
	
		public static WebDriver driver;

		public static  WebDriver browserLanch(String browsername) {

			if (browsername.equalsIgnoreCase("chrome")) {

				driver = new ChromeDriver();
			} else if (browsername.equalsIgnoreCase("edge")) {
				driver = new EdgeDriver();
			} else if (browsername.equalsIgnoreCase("firefox")) {
				driver = new FirefoxDriver();
			}
			driver.manage().window().maximize();
			return driver;
		}

		protected void  urlLaunch(WebDriver driver, String url, int sec) {

			try {
				driver.get(url);
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

		protected void clicktheElement(WebDriver driver, WebElement element) {

			try {
				new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(element));
				element.click();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		protected void inputvalue(WebDriver driver, WebElement element, String value) {

			try {
				new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(element));
				element.sendKeys(value);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		protected void staticWait(int millisec) {

			try {
				Thread.sleep(millisec);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		protected static void Endsetup(WebDriver driver) {
				
			driver.quit();

		}
		
		protected void scroll(WebDriver driver, int x,int y) {
			try {
				((JavascriptExecutor)driver).executeScript("window.scrollBy("+x+","+y+") ;");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}



	public void scrollup(int dist) {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,"+ dist +");","");
	}
	
	protected void jsClick(WebDriver driver, WebElement element) {
		try {
			new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(element));
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	public void windowHandler(int index) {

		Set<String> windows = driver.getWindowHandles();
		List<String> li = new ArrayList<String>(windows);
		driver.switchTo().window(li.get(index));

	}
}

