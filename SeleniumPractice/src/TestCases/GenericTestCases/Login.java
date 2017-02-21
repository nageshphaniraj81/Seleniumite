package TestCases.GenericTestCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import PageObjects.HomePage;
import Utilities.ExtentFactory;

public class Login {
	private WebDriver driver;
	private String baseUrl;
	ExtentReports report;
	ExtentTest test;
	HomePage hp;

	@BeforeClass
	public void beforeClass() {
		
		report = ExtentFactory.getInstance();
		test = report.startTest("Verify Welcome Text second time");
		baseUrl = "http://www.letskodeit.com/";
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\Seleniumite\\lib\\geckodriver.exe");
		driver = new FirefoxDriver();
		hp = new HomePage(driver,test);
        test.log(LogStatus.INFO, "Firefox Initilized");
		// Maximize the browser's window
		driver.manage().window().maximize();
		test.log(LogStatus.INFO, "Firefox maximised");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		test.log(LogStatus.INFO, "Wait for 10 seconds");
		driver.get(baseUrl);
		test.log(LogStatus.INFO, "Open the URL");
	}
	
	@Test
	public void test1_validLoginTest() throws Exception {
		hp.login("test@email.com", "abcabc");
		Thread.sleep(3000);
		boolean result = hp.isWelcomeTextPresent();
		Assert.assertTrue(result);
		test.log(LogStatus.PASS, "Verified Welcome Text");
	}
	@AfterMethod
	public void tearDown(ITestResult testResult) throws IOException {
		if (testResult.getStatus() == ITestResult.FAILURE) {
			String path = Utilities.Screenshots.takeScreenshot(driver, testResult.getName());
			String imagePath = test.addScreenCapture(path);
			test.log(LogStatus.FAIL, "Verify Welcome Text Failed", imagePath);
		}
		driver.quit();
		report.endTest(test);
		report.flush();
	}

}
