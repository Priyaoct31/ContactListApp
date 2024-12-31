package org.Java;

import java.io.IOException;

import org.Pojo.ContactListPojo;
import org.Pojo.ContactValidationPojo;
import org.Pojo.LoginPojo;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Executable extends BaseClass {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		
		
		launchBrowser();
		maxWindow();
		
		pictures("Login");
		
		LoginPojo p1 = new LoginPojo();
		textPresentOrNotValidation(p1.getSignUpButton());				
		System.out.println("Sign Up Button is available");		
		pauseProgram();		
		driver.findElement(By.xpath("//button[text()='Sign up']")).click();		
		System.out.println("Sign Up Button is clicked");	
		textPresentOrNotValidation(p1.getAddUserPage());	
		System.out.println("Redirected to Add User page");
		
		pictures("signUp");
		
		fillTextBox(p1.getFirstName(), readFromExcel(0,1));
		fillTextBox(p1.getLastName(), readFromExcel(1,1));
		//fillTextBox(p1.getEmail(), readFromExcel(2,1));
		
		String dynamicEmail = generateDynamicEmail();
        System.out.println("Generated Email: " + dynamicEmail);
        WebElement emailTextBox = driver.findElement(By.id("email")); // Update the locator as per your page
        emailTextBox.sendKeys(dynamicEmail);
		p1.getPassword().sendKeys("1234567");		
		btnClick(p1.getSubmitButton());	
		userSignUpValidation();	
		
		pictures("Signup details");
		
		
		ContactListPojo c1 = new ContactListPojo();
		pauseProgram();
		btnClick(c1.getAddNewButton());
		
		fillTextBox(c1.getAddFirstName(), readFromExcel(4,1));
		fillTextBox(c1.getAddLastName(), readFromExcel(5,1));
		pauseProgram();
		//fillTextBox(c1.getAddDateOfBirth(), readFromExcel(6,1));
		
		String dob = generateDOB(1995, 5, 25); // Change year, month, and day as needed
        System.out.println("Generated DOB: " + dob);
        WebElement dobTextBox = driver.findElement(By.id("birthdate")); // Update the locator as per your page
        dobTextBox.sendKeys(dob);
        
        
		fillTextBox(c1.getAddEmail(), readFromExcel(7,1));
		pauseProgram();
		//fillTextBox(c1.getAddPhoneNumber(), readFromExcel(8,1));
		driver.findElement(By.xpath("//input[@placeholder='8005551234']")).sendKeys("+919623154682");
		fillTextBox(c1.getAddStreet1(), readFromExcel(9,1));
		fillTextBox(c1.getAddStreet2(), readFromExcel(10,1));
		fillTextBox(c1.getAddCity(), readFromExcel(11,1));
		fillTextBox(c1.getAddStateProvince(), readFromExcel(12,1));
		pauseProgram();
		driver.findElement(By.xpath("//input[@placeholder='Postal Code']")).sendKeys("560066");
		fillTextBox(c1.getAddCountry(), readFromExcel(14,1));
		btnClick(c1.getSubmitContactButton());
		
		pauseProgram();
		
		pictures("NewContact");
		
		
		//alertHandle();
		
		
		//btnClick(c2.getEditContact());
		
		
		WebElement element1 = driver.findElement(By.xpath("//div/table/tr/td[2]"));
		Actions actions = new Actions(driver);
		actions.doubleClick(element1).perform();
		
		ContactValidationPojo c2 = new ContactValidationPojo();
		btnClick(c2.getEditButton());
		
		WebElement textBox1 = driver.findElement(By.id("email"));
		textBox1.click();
		textBox1.sendKeys(Keys.CONTROL, "a");
		pauseProgram();
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].select();", textBox1);
		textBox1.sendKeys(Keys.BACK_SPACE);
		pauseProgram();
		//textBox1.clear();
		textBox1.sendKeys("abcexam@goe.com");
		
		pictures("EditDetails");
		
		btnClick(c2.getEditSubmitButton());
		
		pauseProgram();
		
		btnClick(c2.getDeleteContactButton());
		
		alertHandle();
		
		pictures("DeleteContact");
		
		btnClick(c2.getLogOutButton());
		
		pictures("Logout");
		
		System.out.println("Logged out successfully");
		
		driver.quit();
		
		
		
		
		
	}
	}


