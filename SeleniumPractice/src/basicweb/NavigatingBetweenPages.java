package basicweb;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigatingBetweenPages {
	WebDriver driver;
	String baseUrl;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\Seleniumite\\lib\\geckodriver.exe");
		driver = new FirefoxDriver();
		baseUrl = "https://letskodeit.teachable.com/";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Test
	public void test() throws InterruptedException {
		driver.get(baseUrl);
		String title = driver.getTitle();
		System.out.println("Title of the page is :" + title);

		String currentURL = driver.getCurrentUrl();
		System.out.println("Currenl URL is : " + currentURL);

		String urlToNavigate = "https://sso.teachable.com/secure/42299/users/sign_in?clean_login=true&reset_purchase_session=1";
		driver.navigate().to(urlToNavigate);
        System.out.println("Navigating to Login");
		currentURL = driver.getCurrentUrl();
		System.out.println("Currenl URL now : " + currentURL);

		Thread.sleep(2000);

		driver.navigate().back();
		System.out.println("Navigate Back");
		Thread.sleep(2000);
		currentURL = driver.getCurrentUrl();
		System.out.println("Currenl URL now : " + currentURL);

		driver.navigate().forward();
		System.out.println("Navigate Forward");
		currentURL = driver.getCurrentUrl();
		System.out.println("Currenl URL now : " + currentURL);
		
		driver.navigate().back();
		System.out.println("Navigate Back");
		Thread.sleep(2000);
		currentURL = driver.getCurrentUrl();
		System.out.println("Currenl URL now : " + currentURL);
		
		driver.navigate().refresh();
		System.out.println("Navigate refresh");
		
		// Refresh the web page using currest URL
		currentURL = driver.getCurrentUrl();
		System.out.println("Currenl URL now : " + currentURL);
        driver.get(currentURL);
        
        String pageSource = driver.getPageSource();
        System.out.println(pageSource);
	}

	@After
	public void tearDown() throws Exception {
	}

}
