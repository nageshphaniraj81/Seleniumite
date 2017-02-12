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

public class RadioButtonsAndCheckBoxes {

	WebDriver driver;
	String baseUrl;
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\Seleniumite\\lib\\geckodriver.exe");
		driver = new FirefoxDriver();
		baseUrl = "https://letskodeit.teachable.com/pages/practice";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(baseUrl);
	}

	@Test
	public void test() throws InterruptedException {

		WebElement bmwRadioBtn = driver.findElement(By.id("bmwradio"));
		bmwRadioBtn.click();
		Thread.sleep(2000);

		WebElement benzRadioBtn = driver.findElement(By.id("benzradio"));
		benzRadioBtn.click();
		Thread.sleep(2000);
		
		WebElement hondaRadioBtn = driver.findElement(By.id("hondaradio"));
		hondaRadioBtn.click();
		Thread.sleep(2000);
		
		System.out.println("BMW Radio is Selected?"+ bmwRadioBtn.isSelected());
		System.out.println("Benz Radio is Selected?"+ benzRadioBtn.isSelected());
		System.out.println("Honda Radio is Selected?"+ hondaRadioBtn.isSelected());

		
		WebElement bmwCheckBox = driver.findElement(By.id("bmwcheck"));
		bmwCheckBox.click();
		
		WebElement benzCheckBox = driver.findElement(By.id("benzcheck"));
		benzCheckBox.click();
		
		WebElement hondaCheckBox = driver.findElement(By.id("hondacheck"));
		hondaCheckBox.click();
		Thread.sleep(2000);
		
		System.out.println("BMW Checkbox is Checked?"+ bmwCheckBox.isSelected());
		System.out.println("Benz Checkbox is Checked?"+ benzCheckBox.isSelected());
		System.out.println("Honda Checkbox is Checked?"+ hondaCheckBox.isSelected());
		
	}
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}

}
