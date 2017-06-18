package pl.lait.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {
	static String signOnLinkText = "SIGN-ON";
	static String contactLinkText = "CONTACT";
	static String supportLinkText = "SUPPORT";
	static String registerLinkText = "REGISTER";
	
	public WebElement link_signOn(WebDriver driver){
		return driver.findElement(By.linkText(signOnLinkText));
	}
	
	public WebElement link_contact(WebDriver driver){
		return driver.findElement(By.linkText(contactLinkText));
		
	}
		
		public WebElement link_support(WebDriver driver){
			return driver.findElement(By.linkText(supportLinkText));
		}
		
		public WebElement link_register(WebDriver driver){
			return driver.findElement(By.linkText(registerLinkText));
	}

}
