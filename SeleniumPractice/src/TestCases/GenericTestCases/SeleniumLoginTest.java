package TestCases.GenericTestCases;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import Utilities.ExtentFactory;

public class SeleniumLoginTest {
	private WebDriver driver;
	private String baseUrl;
	ExtentReports report;
	ExtentTest test;

	@BeforeClass
	public void beforeClass() {
		
		report = ExtentFactory.getInstance();
		test = report.startTest("Verify Welcome Text");
		baseUrl = "http://www.letskodeit.com/";
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\Seleniumite\\lib\\geckodriver.exe");
		driver = new FirefoxDriver();
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
		WebElement signupLink = driver.findElement(By.id("comp-iiqg1vggactionTitle"));
		signupLink.click();
		test.log(LogStatus.INFO, "Clicked on Signup Link");
		
		WebElement loginLink = driver.findElement(By.id("signUpDialogswitchDialogLink"));
		loginLink.click();
		test.log(LogStatus.INFO, "Clicked on Login Link");
		
		WebElement emailField = driver.findElement(By.xpath("//div[@id='memberLoginDialogemail']//input"));
		emailField.sendKeys("test1@email.com");
		test.log(LogStatus.INFO, "Enter Email");
		
		WebElement passwordField = driver.findElement(By.xpath("//div[@id='memberLoginDialogpassword']//input"));
		passwordField.sendKeys("abcabc");
		test.log(LogStatus.INFO, "Enter Password");
		
		WebElement goButton = driver.findElement(By.id("memberLoginDialogoklink"));
		goButton.click();
		test.log(LogStatus.INFO, "Clicked on GO button");
		
		Thread.sleep(3000);
		
		WebElement welcomeText = null;
		
		try {
			welcomeText = driver.findElement(By.xpath("//div[text()='Hello test@email.com']"));
		}
		catch (NoSuchElementException e) {
			System.out.println(e.getMessage());
		}
		Assert.assertTrue(welcomeText != null);
		test.log(LogStatus.PASS, "Verified welcome text");
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
