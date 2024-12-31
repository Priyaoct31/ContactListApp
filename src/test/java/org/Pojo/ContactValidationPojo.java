package org.Pojo;

import org.Java.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactValidationPojo extends BaseClass {
	
public ContactValidationPojo() {
		
		PageFactory.initElements(driver, this);
	}

	@FindBy (xpath = "//div/table/tr/td[2]")
	private WebElement editContact;
	
	@FindBy(id="edit-contact")
	private WebElement editButton;
	
	@FindBy(id="firstName")
	private WebElement editFirstName;
	
	@FindBy(id="lastName")
	private WebElement editLastName;
	
	@FindBy(id="birthdate")
	private WebElement editDOB;
	
	@FindBy(id="email")
	private WebElement editEmail;
	
	@FindBy(id="phone")
	private WebElement editPhoneNumber;
	
	@FindBy(id="street1")
	private WebElement editStreet1;
	
	@FindBy(id="street2")
	private WebElement editStreet2;
	
	@FindBy(id="city")
	private WebElement editCity;
	
	@FindBy(id="stateProvince")
	private WebElement editState;
	
	@FindBy(id="postalCode")
	private WebElement editPostCode;
	
	@FindBy(id="country")
	private WebElement editCountry;
	
	@FindBy(id="submit")
	private WebElement editSubmitButton;
	
	@FindBy(id="cancel")
	private WebElement editCancelButton;
	
	@FindBy(id="delete")
	private WebElement deleteContactButton;
	
	@FindBy(id="logout")
	private WebElement logOutButton;
	
	

	public WebElement getLogOutButton() {
		return logOutButton;
	}

	public void setLogOutButton(WebElement logOutButton) {
		this.logOutButton = logOutButton;
	}

	public WebElement getDeleteContactButton() {
		return deleteContactButton;
	}

	public void setDeleteContactButton(WebElement deleteContactButton) {
		this.deleteContactButton = deleteContactButton;
	}

	public WebElement getEditButton() {
		return editButton;
	}

	public void setEditButton(WebElement editButton) {
		this.editButton = editButton;
	}

	public WebElement getEditFirstName() {
		return editFirstName;
	}

	public void setEditFirstName(WebElement editFirstName) {
		this.editFirstName = editFirstName;
	}

	public WebElement getEditLastName() {
		return editLastName;
	}

	public void setEditLastName(WebElement editLastName) {
		this.editLastName = editLastName;
	}

	public WebElement getEditDOB() {
		return editDOB;
	}

	public void setEditDOB(WebElement editDOB) {
		this.editDOB = editDOB;
	}

	public WebElement getEditEmail() {
		return editEmail;
	}

	public void setEditEmail(WebElement editEmail) {
		this.editEmail = editEmail;
	}

	public WebElement getEditPhoneNumber() {
		return editPhoneNumber;
	}

	public void setEditPhoneNumber(WebElement editPhoneNumber) {
		this.editPhoneNumber = editPhoneNumber;
	}

	public WebElement getEditStreet1() {
		return editStreet1;
	}

	public void setEditStreet1(WebElement editStreet1) {
		this.editStreet1 = editStreet1;
	}

	public WebElement getEditStreet2() {
		return editStreet2;
	}

	public void setEditStreet2(WebElement editStreet2) {
		this.editStreet2 = editStreet2;
	}

	public WebElement getEditCity() {
		return editCity;
	}

	public void setEditCity(WebElement editCity) {
		this.editCity = editCity;
	}

	public WebElement getEditState() {
		return editState;
	}

	public void setEditState(WebElement editState) {
		this.editState = editState;
	}

	public WebElement getEditPostCode() {
		return editPostCode;
	}

	public void setEditPostCode(WebElement editPostCode) {
		this.editPostCode = editPostCode;
	}

	public WebElement getEditCountry() {
		return editCountry;
	}

	public void setEditCountry(WebElement editCountry) {
		this.editCountry = editCountry;
	}

	public WebElement getEditSubmitButton() {
		return editSubmitButton;
	}

	public void setEditSubmitButton(WebElement editSubmitButton) {
		this.editSubmitButton = editSubmitButton;
	}

	public WebElement getEditCancelButton() {
		return editCancelButton;
	}

	public void setEditCancelButton(WebElement editCancelButton) {
		this.editCancelButton = editCancelButton;
	}

	public WebElement getEditContact() {
		return editContact;
	}

	public void setEditContact(WebElement editContact) {
		this.editContact = editContact;
	}


}


