package TestCases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WorkingWithElementList {

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

		boolean isChecked = false;
//		List<WebElement> radioButtons = driver
//				.findElements(By.xpath("//input[contains(@type,'radio') and contains(@name,'cars')]"));
		List<WebElement> radioButtons = driver
				.findElements(By.name("cars"));

		int sizeOfList = radioButtons.size();
        System.out.println("Size of the Array is :"+sizeOfList);
		for (int i = 0; i < sizeOfList; i++) {
			isChecked = radioButtons.get(i).isSelected();
			if (!isChecked) {
				radioButtons.get(i).click();
				Thread.sleep(1000);
			}
		}

	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}

}
