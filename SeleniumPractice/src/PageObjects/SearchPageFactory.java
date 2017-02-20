package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public  class SearchPageFactory {
	
	WebDriver driver;
	
	@FindBy(id="tab-flight-tab")
	WebElement flightTab;
	
	@FindBy(id="flight-origin")
	WebElement originCity;
	
	@FindBy(id="flight-destination")
	WebElement destinationCity;
	
	@FindBy(id="flight-departing")
	WebElement departureDate;
	
	@FindBy(id="flight-returning")
	WebElement returnDate;
	
	public SearchPageFactory(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickFlightsTab(){
		flightTab.click();
	}
	
	public void setOriginCity(String origin){
		originCity.sendKeys(origin);
	}
	
	public void setDestinationCity(String origin){
		destinationCity.sendKeys(origin);
	}
	
	public void setDepartureDate(String depDate){
		departureDate.sendKeys(depDate);
	}
	
	public void setReturnDate(String retDate){
		returnDate.sendKeys(retDate);
	}

}
