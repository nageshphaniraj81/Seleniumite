package basicweb;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementDisplayed {

	WebDriver driver;
	String baseUrl1;
	String baseUrl2;
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\Seleniumite\\lib\\geckodriver.exe");
		driver = new FirefoxDriver();
		baseUrl1 = "https://letskodeit.teachable.com/p/practice";
		baseUrl2 = "http://www.expedia.com";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();	
	}

	@Test
	public void testLetsKodeIt() throws InterruptedException  {
		driver.get(baseUrl1);
		WebElement textBox = driver.findElement(By.id("displayed-text"));
		System.out.println("State of the textbox is : "+textBox.isDisplayed());
		Thread.sleep(1000);
		
		WebElement hideButton = driver.findElement(By.id("hide-textbox"));
		hideButton.click();
		System.out.println("Clicked on Hide Button");
		System.out.println("State of the textbox is : "+textBox.isDisplayed());
		Thread.sleep(1000);
		
		WebElement showButton = driver.findElement(By.id("show-textbox"));
		showButton.click();
		System.out.println("Clicked on Show Button");
		WebElement textBox2 = driver.findElement(By.id("displayed-text"));
		System.out.println("State of the textbox is : "+textBox2.isDisplayed());
		Thread.sleep(1000);
					
	}
	
//	@Test
//	public void testExpedia() {
//		driver.get(baseUrl2);
//		
//	}
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		//driver.quit();
	}

}
