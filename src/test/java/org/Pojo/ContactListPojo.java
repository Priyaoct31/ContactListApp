package org.Pojo;

import org.Java.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactListPojo extends BaseClass {
	
	
public ContactListPojo() {
		
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h1[text()='Contact List']")
	private WebElement contactListText;
	
	@FindBy(id = "add-contact")
	private WebElement AddNewButton;
	
	@FindBy(id = "firstName")
	private WebElement addFirstName;
	
	@FindBy(id = "lastName")
	private WebElement addLastName;
	
	@FindBy(xpath = "//input[@placeholder='yyyy-MM-dd']")
	private WebElement addDateOfBirth;
	
	@FindBy(id = "email")
	private WebElement addEmail;
	
	@FindBy(id = "phone")
	private WebElement addPhoneNumber;
	
	@FindBy(id = "street1")
	private WebElement addStreet1;
	
	@FindBy(id = "street2")
	private WebElement addStreet2;
	
	@FindBy(id = "city")
	private WebElement addCity;
	
	@FindBy(id = "stateProvince")
	private WebElement addStateProvince;
	
	@FindBy(id = "postalCode")
	private WebElement addPostalCode;
	
	@FindBy(id = "country")
	private WebElement addCountry;
	
	@FindBy (id = "submit")
	private WebElement submitContactButton;

	public WebElement getContactListText() {
		return contactListText;
	}

	public void setContactListText(WebElement contactListText) {
		this.contactListText = contactListText;
	}

	public WebElement getAddNewButton() {
		return AddNewButton;
	}

	public void setAddNewButton(WebElement addNewButton) {
		AddNewButton = addNewButton;
	}

	public WebElement getAddFirstName() {
		return addFirstName;
	}

	public void setAddFirstName(WebElement addFirstName) {
		this.addFirstName = addFirstName;
	}

	public WebElement getAddLastName() {
		return addLastName;
	}

	public void setAddLastName(WebElement addLastName) {
		this.addLastName = addLastName;
	}

	public WebElement getAddDateOfBirth() {
		return addDateOfBirth;
	}

	public void setAddDateOfBirth(WebElement addDateOfBirth) {
		this.addDateOfBirth = addDateOfBirth;
	}

	public WebElement getAddEmail() {
		return addEmail;
	}

	public void setAddEmail(WebElement addEmail) {
		this.addEmail = addEmail;
	}

	public WebElement getAddPhoneNumber() {
		return addPhoneNumber;
	}

	public void setAddPhoneNumber(WebElement addPhoneNumber) {
		this.addPhoneNumber = addPhoneNumber;
	}

	public WebElement getAddStreet1() {
		return addStreet1;
	}

	public void setAddStreet1(WebElement addStreet1) {
		this.addStreet1 = addStreet1;
	}

	public WebElement getAddStreet2() {
		return addStreet2;
	}

	public void setAddStreet2(WebElement addStreet2) {
		this.addStreet2 = addStreet2;
	}

	public WebElement getAddCity() {
		return addCity;
	}

	public void setAddCity(WebElement addCity) {
		this.addCity = addCity;
	}

	public WebElement getAddStateProvince() {
		return addStateProvince;
	}

	public void setAddStateProvince(WebElement addStateProvince) {
		this.addStateProvince = addStateProvince;
	}

	public WebElement getAddPostalCode() {
		return addPostalCode;
	}

	public void setAddPostalCode(WebElement addPostalCode) {
		this.addPostalCode = addPostalCode;
	}

	public WebElement getAddCountry() {
		return addCountry;
	}

	public void setAddCountry(WebElement addCountry) {
		this.addCountry = addCountry;
	}

	public WebElement getSubmitContactButton() {
		return submitContactButton;
	}

	public void setSubmitContactButton(WebElement submitContactButton) {
		this.submitContactButton = submitContactButton;
	}
	
	
	
	

}
