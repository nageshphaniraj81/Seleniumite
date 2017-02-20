package TestCases.GenericTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElementsByNameDemo {

	public static void main(String[] args) {
		String baseUrl = "http://www.google.com";
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\Seleniumite\\lib\\geckodriver.exe");
		WebDriver driver;
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(baseUrl);
		driver.findElement(By.id("lst-ib")).sendKeys("letskodeit");
		driver.findElement(By.name("btnG")).click();

	}

}
