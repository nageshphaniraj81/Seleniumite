package basicweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IDXPATHAmazonDemo {

	public static void main(String[] args) throws InterruptedException {

		String baseUrl = "http://www.amazon.in";
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\Seleniumite\\lib\\geckodriver.exe");
		WebDriver driver;
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(baseUrl);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 7");
		driver.findElement(By.xpath(".//*[@id='nav-search']/form/div[2]/div/input")).click();
		driver.findElement(By.xpath(".//*[@id='navFooter']/table/tbody/tr/td[1]/ul/li[2]/a")).click();
        Thread.sleep(600);
        driver.close();
	}

}
