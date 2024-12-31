package org.Java;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	public static File f,d1;
	public static JavascriptExecutor js;
	
	public static void launchBrowser() {
        
        WebDriverManager.chromedriver().setup();     
        driver = new ChromeDriver();  	
        driver.get("https://thinking-tester-contact-list.herokuapp.com/");

    }
    	
    	public static void maxWindow() {
    		driver.manage().window().maximize();
    	}
    	
    	public static void btnClick(WebElement buttonClick) {
    		buttonClick.click();
    		
    	}
    	
    	public static void pauseProgram() throws InterruptedException {
    		Thread.sleep(5000);
    	}
    	
	public static void textPresentOrNotValidation(WebElement element) {
    		
    		
    		List<String> textsToVerify = Arrays.asList("Add User");
    		String pageSource = driver.getPageSource();
    		for (String text : textsToVerify) {
                if (pageSource.contains(text)) {
                    System.out.println("The text \"" + text + "\" is present on the webpage.");
                } else {
                    System.out.println("The text \"" + text + "\" is NOT present on the webpage.");
                }
            }
	}

	public static void fillTextBox(WebElement element, String value) {
		element.sendKeys(value);
	}
	
	public static String readFromExcel(int rowNo, int cellNo) throws IOException {
		
		File f = new File("C:\\Users\\pc\\eclipse-workspace\\PriyaDec2024\\ContactListApp\\Excel\\ContactListApp.xlsx");
		FileInputStream fin = new FileInputStream(f);
		XSSFWorkbook book = new XSSFWorkbook(fin);		
		XSSFSheet sh = book.getSheet("ContactListApp");
		XSSFRow r = sh.getRow(rowNo);
		XSSFCell c = r.getCell(cellNo);
		int type = c.getCellType();
		String name = "";
		if(type==1) {
			name = c.getStringCellValue();
			
		}
		return name;
}
	public static void userSignUpValidation() {
        
        List<String> textsToVerify = Arrays.asList("Email address is already in use");      
        String pageSource = driver.getPageSource();        
        for (String text : textsToVerify) {
            if (pageSource.contains(text)) {
                System.out.println("Text found: " + text + ". Closing the browser.");
                driver.close(); 
                return; 
            }
        }

        System.out.println("No matching text found in the page source.");
    }
	
	 public static String generateDynamicEmail() {
	       
	        String timestamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
	        return "priya" + timestamp + "@example.com";
	    }
	 
	 public static String generateDOB(int year, int month, int day) {
		    // Create a LocalDate object for the specified date
		    LocalDate date = LocalDate.of(year, month, day);
		    
		    // Format the date in the yyyy-MM-dd format
		    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		    return date.format(formatter);
		}
	 
	public static void alertHandle() {
    		
    		Alert alert = driver.switchTo().alert();
    		String alertText = alert.getText();
            System.out.println("Alert Text: " + alertText);
            alert.accept();
            System.out.println("Alert accepted successfully!");
    	}
	
	public static void pictures(String filename) throws IOException {
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		f = ts.getScreenshotAs(OutputType.FILE);
		d1 = new File("C:\\Users\\pc\\eclipse-workspace\\PriyaDec2024\\ContactListApp\\Pictures\\"+filename+".png");
		FileHandler.copy(f, d1);
	}
}
