package frameworklite;

import static org.junit.Assert.*;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchWindow {

	private WebDriver driver;
	private String baseUrl;
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\Seleniumite\\lib\\geckodriver.exe");
		driver = new FirefoxDriver();
		baseUrl = "https://letskodeit.teachable.com/p/practice/";
		
		// Maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseUrl);
	}

	@Test
	public void test()throws InterruptedException {


		
		// Get the handle
		String parentHandle = driver.getWindowHandle();
		System.out.println("Parent Handle is : "+parentHandle);
		
		// click on open window button
		WebElement openWindow = driver.findElement(By.id("openwindow"));
		openWindow.click();
		
		//Get both the handles
		Set<String> handles = driver.getWindowHandles();
		
		// Switch between handles
		for(String handle : handles){
			System.out.println("Handle = "+handle);
			if(!handle.equals(parentHandle)){
				driver.switchTo().window(handle);
				Thread.sleep(3000);
				WebElement searchBox = driver.findElement(By.id("search-courses"));
				searchBox.sendKeys("python");
				Thread.sleep(3000);
				driver.close();
			}
		}
		
		//Switch back to parent window
		driver.switchTo().window(parentHandle);
	}
	
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

}
