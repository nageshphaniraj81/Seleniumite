package TestCases.DBTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;


// Sequel Pro - for Database
// Driver Download - https://dev.mysql.com/downloads/connector/odbc/

public class DatabaseTesting {
	// Connection object
	static Connection conn = null;
	
	// Statement object
	private static Statement stmt;
	
	// Result Set
	private static ResultSet results = null;
	
	// Constant for Database URL
	public static String DB_URL = "jdbc:mysql://localhost:3306/nagesh"; // ORacle "jdbc:oracle:thin:@localhost:1521/sid"

	// Constant for Database Username
	public static String DB_USER = "root";
	
	// Constant for Database Password
	public static String DB_PASSWORD = "New02$$ton";
	
	// Driver
	public static String driver = "com.mysql.jdbc.Driver"; // "oracle.jdbc.driver.OracleDriver"
	
	// WebDriver
	// public static WebDriver dv;

	@BeforeClass
	public void beforeClass() {
		// Intialize WebDriver
		// dv = new FirefoxDriver();
		
		// Properties for creating connection to database
		Properties props = new Properties();
		
		props.setProperty("user", "root");
		
		props.setProperty("password", "");
	    
		try {
			
			// STEP 1: Register JDBC driver
			Class.forName(driver).newInstance();
			
			// STEP 2: Get connection to DB
			System.out.println("Connecting to a selected database...");
			
			conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
			
			// conn = DriverManager.getConnection(DB_URL, props);		
			System.out.println("Connected database successfully...");
			
			// STEP 3: Statement object to send the SQL statement to the Database
			System.out.println("Creating statement...");
			stmt = conn.createStatement();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void test() throws SQLException {
        String query = "select * from users";
        try {
        	// STEP 4: Extract data from result set
        	results = stmt.executeQuery(query);
        	while (results.next()) {
        		int ssn = results.getInt("ssn");
        		String first = results.getString("first_name");
        		String last = results.getString("last_name");
        		String age = results.getString("age");
        		String city = results.getString("city");
        		
        		// Display Values
        		System.out.println("SSN: " + ssn);
        		System.out.println("Last Name: " + last);
        		System.out.println("First Name: " + first);
        		System.out.println("City: " + city);
        		System.out.println("Age: " + age);
        		
        		// From GUI
//        		WebElement element = dv.findElement(By.id("uname"));
//        		String actualUserName = element.getText();
//        		Assert.assertEquals(actualUserName, first);
            }
        	results.close();
		} catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		}
	}

	@AfterClass
	public void afterClass() {
		try {
			if (results != null)
				results.close();
			if (stmt != null)
				conn.close();
			if (conn != null)
				conn.close();
		} catch (SQLException se) {
			se.printStackTrace();
		}
	}
}