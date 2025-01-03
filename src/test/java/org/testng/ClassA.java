package org.testng;

import org.Java.BaseClass;
import org.Pojo.LoginPojo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassA extends BaseClass {
	
	public static WebDriver driver;
	@BeforeTest
	
public static void launchBrowser() {
        
        WebDriverManager.chromedriver().setup();     
        driver = new ChromeDriver();  	
        driver.get("https://thinking-tester-contact-list.herokuapp.com/");

    }
	
	@Test
	
	public void loginTest() throws InterruptedException {
		
		driver.findElement(By.id("email")).sendKeys("priya20250103160706@example.com");
		driver.findElement(By.id("password")).sendKeys("1234567");
		driver.findElement(By.id("submit")).click();
	
}
	@Test
    public void testMethod() {
        Reporter.log("This is a custom log message.", true);
    }
}