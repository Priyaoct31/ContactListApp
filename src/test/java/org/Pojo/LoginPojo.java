package org.Pojo;

import org.Java.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends BaseClass {
	
public LoginPojo() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[text()='Sign up']")
	private WebElement signUpButton;

	public WebElement getSignUpButton() {
		return signUpButton;
	}

	public void setSignUpButton(WebElement signUpButton) {
		this.signUpButton = signUpButton;
	}
	
	@FindBy (xpath = "//h1[text()='Add User']")
	private WebElement addUserPage;
	
	@FindBy(id = "firstName")
	private WebElement firstName;
	
	@FindBy(id = "lastName")
	private WebElement lastName;
	
	@FindBy (id = "email")
	private WebElement email;
	
	@FindBy(xpath = "//input[@type='password']")
	private WebElement password;
	
	@FindBy (id = "submit")
	private WebElement submitButton;
	
	@FindBy(xpath="//span[text() ='Email address is already in use']")
	private WebElement signUpError;

	public WebElement getSignUpError() {
		return signUpError;
	}

	public void setSignUpError(WebElement signUpError) {
		this.signUpError = signUpError;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public void setFirstName(WebElement firstName) {
		this.firstName = firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public void setLastName(WebElement lastName) {
		this.lastName = lastName;
	}

	public WebElement getEmail() {
		return email;
	}

	public void setEmail(WebElement email) {
		this.email = email;
	}

	public WebElement getPassword() {
		return password;
	}

	public void setPassword(WebElement password) {
		this.password = password;
	}

	public WebElement getSubmitButton() {
		return submitButton;
	}

	public void setSubmitButton(WebElement submitButton) {
		this.submitButton = submitButton;
	}

	public WebElement getAddUserPage() {
		return addUserPage;
	}

	public void setAddUserPage(WebElement addUserPage) {
		this.addUserPage = addUserPage;
	}
	
	

}
