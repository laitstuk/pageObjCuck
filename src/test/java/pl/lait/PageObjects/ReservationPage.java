package pl.lait.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ReservationPage {
	
	static String oneWay_xapth = "/html/body/div/table/tbody/tr/td[2]/table/tbody/" 
	+ "tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/"
	+ "td/form/table/tbody/tr[2]/td[2]/b/font/input[2]";
	
	static String passCount_name = "passCount";
	static String fromPort_name = "fromPort";
	static String fromMonth_name = "fromMonth";
	static String fromDay_name = "fromDay";
	
	static String toPort_name = "toPort";
	static String toMonth_name = "toMonth";
	static String toDay_name = "toDay";
	static String ServClass_xpath = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/"
			+ "td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/"
			+ "tr[9]/td[2]/font/font/input[1]";
	
	
	public WebElement radio_oneWay(WebDriver driver){
		return driver.findElement(By.xpath(oneWay_xapth));
		
	}

	public Select selectPassengersCount(WebDriver driver){
		Select passangers = new Select(driver.findElement(By.name(passCount_name)));
		return passangers;
		
	}
	public void selectPassengersCount(WebDriver driver, String VisibleText){
		Select passangers = new Select(driver.findElement(By.name(passCount_name)));
		passangers.selectByVisibleText(VisibleText);
		
	}
	public void selectFromPort(WebDriver driver, String VisibleText){
		Select fromPort = new Select(driver.findElement(By.name(fromPort_name)));
		fromPort.selectByVisibleText(VisibleText);
	}
	
	public void selectFromMonth(WebDriver driver, String VisibleText){
		Select fromMonth = new Select(driver.findElement(By.name(fromMonth_name)));
		fromMonth.selectByVisibleText(VisibleText);
	}
	
	public void selectFromDay(WebDriver driver, String VisibleText){
		Select fromDay = new Select(driver.findElement(By.name(fromDay_name)));
		fromDay.selectByVisibleText(VisibleText);
	}
	
	public void selectToPort(WebDriver driver, String VisibleText){
		Select toPort = new Select(driver.findElement(By.name(toPort_name)));
		toPort.selectByVisibleText(VisibleText);
	}
	
	public void selecttoMonth(WebDriver driver, String VisibleText){
		Select toMonth = new Select(driver.findElement(By.name(toMonth_name)));
		toMonth.selectByVisibleText(VisibleText);
	}
	
	public void selectToDay(WebDriver driver, String VisibleText){
		Select toDay = new Select(driver.findElement(By.name(toDay_name)));
		toDay.selectByVisibleText(VisibleText);
	}
	
	// public WebElement radio_First(WebDriver driver){
		//return driver.findElement(By.name("servClass"));
	  
	}

