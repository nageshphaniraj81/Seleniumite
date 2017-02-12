package basicweb;

import static org.junit.Assert.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {
	
	private WebDriver driver;
	private String baseUrl1;
	//private String baseUrl2;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\Seleniumite\\lib\\geckodriver.exe");
		driver = new FirefoxDriver();
		baseUrl1 = "https://www.expedia.com/";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
	}

	@Test
	public void testDropdown() throws Exception{
		driver.get(baseUrl1);
		
		Select sel = new Select(driver.findElement(By.id("hotel-1-adults")));
		Select sel2 = new Select(driver.findElement(By.id("hotel-1-children")));
		
		List <WebElement> options = sel.getOptions();
		int size = options.size();
		System.out.println("Size of the array is :"+size);

		List <WebElement> options2 = sel2.getOptions();
		int size2 = options2.size();
		System.out.println("Size of the array is :"+size2);
		
		sel.selectByValue("3");
		System.out.println("Able to set number of adults to 3");
		sel2.selectByValue("6");
		System.out.println("Able to set number of children to 6");
		
		for(int i=0;i<size;i++){
			System.out.println("Hi");
		//	System.out.println("Option : # "+i+" is :"+options.get(i).getText());
		}
//		for(int i=0;i<size2;i++){
//			System.out.println("Hello");
//			System.out.println("Option : # "+i+" is :"+options2.get(i).getText());
//		}
			
	}

	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}

}
