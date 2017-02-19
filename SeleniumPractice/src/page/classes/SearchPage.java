package page.classes;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import TestCases.ExpediaHome;

public class SearchPage {
	
	public static WebElement element = null;
	static Logger log = Logger.getLogger(SearchPage.class);
	
	public static WebElement originTextBox(WebDriver driver){
		element = driver.findElement(By.id("flight-origin"));
		log.info("Origin textbox element found ");
		return element;
	}
	
	public static void fillOriginTextBox(WebDriver driver,String origin){
		element = originTextBox(driver);
		element.sendKeys(origin);
		log.info("Entered origin city as"+origin);
	}
	
	public static WebElement destinationTextBox(WebDriver driver){
		element = driver.findElement(By.id("flight-destination"));
		return element;
	}
	
	public static void fillDestinationTextBox(WebDriver driver,String origin){
		element = destinationTextBox(driver);
		element.sendKeys(origin);
		log.info("Entered destination city as"+origin);
	}

	public static WebElement departureDateTextBox(WebDriver driver){
		element = driver.findElement(By.id("flight-departing"));
		return element;
	}
	
	public static void fillDepartureDateTextBox(WebDriver driver,String origin){
		element = departureDateTextBox(driver);
		element.sendKeys(origin);
		log.info("Entered departure date as"+origin);
	}
	
	public static WebElement returnDateTextBox(WebDriver driver){
		element = driver.findElement(By.id("flight-returning"));
		return element;
	}
	
	public static void fillReturnDateTextBox(WebDriver driver,String origin){
		element = returnDateTextBox(driver);
		element.sendKeys(origin);
		log.info("Entered return date  as"+origin);
	}
	
	public static WebElement searchButton(WebDriver driver){
		element = driver.findElement(By.id("search-button"));
		return element;
	}
	
	public static void clickOnSearchButton(WebDriver driver){
		element = searchButton(driver);
		element.click();
	}
	
	public static void navigateToFlightsTab(WebDriver driver){
		//driver.findElement(By.id("header-history")).click();
		element = element.findElement(By.id("tab-flight-tab"));
		element.click();
	}
	
	public static void clearAllFields(WebDriver driver){
		driver.findElement(By.id("flight-origin")).clear();
		driver.findElement(By.id("flight-departing")).clear();
		driver.findElement(By.id("flight-destination")).clear();
		driver.findElement(By.id("flight-returning")).clear();
	}
	
}
