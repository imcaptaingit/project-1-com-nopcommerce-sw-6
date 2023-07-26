package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class RegisterPage extends Utility {

    private static final Logger log = LogManager.getLogger(RegisterPage.class.getName());

    public RegisterPage() {
        PageFactory.initElements(driver, this);
    }


    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Register')]")
    WebElement registerText;
    @CacheLookup
    @FindBy(id = "gender-male")
    WebElement genderMale;
    @CacheLookup
    @FindBy(id = "gender-female")
    WebElement genderFemale;
    @CacheLookup
    @FindBy(id = "FirstName")
    WebElement firstNameField;
    @CacheLookup
    @FindBy(id = "LastName")
    WebElement lastNameField;
    @CacheLookup
    @FindBy(name = "DateOfBirthDay")
    WebElement dateOfBirthDay;
    @CacheLookup
    @FindBy(name = "DateOfBirthMonth")
    WebElement dateOfBirthMonth;
    @CacheLookup
    @FindBy(name = "DateOfBirthYear")
    WebElement dateOfBirthYear;
    @CacheLookup
    @FindBy(id = "Email")
    WebElement emailField;
    @CacheLookup
    @FindBy(id = "Password")
    WebElement passwordField;
    @CacheLookup
    @FindBy(id = "ConfirmPassword")
    WebElement confirmPasswordField;
    @CacheLookup
    @FindBy(id = "register-button")
    WebElement registerButton;
    @CacheLookup
    @FindBy(id = "FirstName-error")
    WebElement firstNameError;
    @CacheLookup
    @FindBy(id = "LastName-error")
    WebElement lastNameError;
    @CacheLookup
    @FindBy(id = "Email-error")
    WebElement emailError;
    @CacheLookup
    @FindBy(id = "Password-error")
    WebElement passwordError;
    @CacheLookup
    @FindBy(id = "ConfirmPassword-error")
    WebElement confirmPasswordError;
    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Your registration completed')]")
    WebElement verifyRegistration;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement continueTab;
    @CacheLookup
    @FindBy(className = "field-validation-error")
    List<WebElement> fieldValidationErrors;


    public String verifyRegisterText() {
        log.info("Verify register text" + registerText.toString());
        return getTextFromElement(registerText);
    }

    public void selectGender(String maleOrFemale) {
        log.info("Select gender." + maleOrFemale + "radio button");
        switch (maleOrFemale) {
            case "Male":
                clickOnElement(genderMale);
                break;
            case "Female":
                clickOnElement(genderFemale);
                break;
            default:
                break;
        }
    }

    public String getValidationErrorMessageForField(String fieldName) {
        String validationMessage = null;
        for (WebElement message : fieldValidationErrors) {
            if (message.getAttribute("data-valmsg-for").equals(fieldName)) {
                validationMessage = message.getText();
                break;
            }
        }
        return validationMessage;
    }

    public void enterFirstName(String firstName) {
        log.info("Enter first name." + firstName + "in first name field" + firstNameField.toString());
        sendTextToElement(firstNameField, firstName);
    }

    public void enterLastName(String lastName) {
        log.info("Enter last name." + lastName + "in last name field" + lastNameField.toString());
        sendTextToElement(lastNameField, lastName);
    }

    public void dateOfBirthDay(String day) {
        log.info("Enter day for date of birth." + day + "in day field" + dateOfBirthDay.toString());
        selectByVisibleTextFromDropDown(dateOfBirthDay, day);
    }

    public void dateOfBirthMonth(String month) {
        log.info("Enter month for date of birth." + month + "in month field" + dateOfBirthMonth.toString());
        selectByVisibleTextFromDropDown(dateOfBirthMonth, month);
    }

    public void dateOfBirthYear(String year) {
        log.info("Enter year for date of birth." + year + "in year field" + dateOfBirthYear.toString());
        selectByVisibleTextFromDropDown(dateOfBirthYear, year);
    }


    public void enterEmail(String email) {
        log.info("Enter email." + email + "in email field" + emailField.toString());
        sendTextToElement(emailField, email);
    }

    public void enterPassword(String password) {
        log.info("Enter password." + password + "in password field" + passwordField.toString());
        sendTextToElement(passwordField, password);
    }

    public void enterConfirmPassword(String confirmPassword) {
        log.info("Enter confirm password." + confirmPassword + "in confirm password field" + confirmPasswordField.toString());
        sendTextToElement(confirmPasswordField, confirmPassword);
    }

    public void clickOnRegisterButton() {
        log.info("Click on register button" + registerButton.toString());
        clickOnElement(registerButton);
    }

    public String verifyFirstNameError() {
        log.info("Verify first name error" + firstNameError.toString());
        return getTextFromElement(firstNameError);
    }

    public String verifyLastNameError() {
        log.info("Verify last name error" + lastNameError.toString());
        return getTextFromElement(lastNameError);
    }

    public String verifyPasswordError() {
        log.info("Verify password error" + passwordError.toString());
        return getTextFromElement(passwordError);
    }

    public String verifyConfirmPasswordError() {
        log.info("Verify confirm password error" + confirmPasswordError.toString());
        return getTextFromElement(confirmPasswordError);
    }

    public String verifyEmailError() {
        log.info("Verify email error" + emailError.toString());
        return getTextFromElement(emailError);
    }

    public String verifyRegistrationCompleteMessage() {
        log.info("Verify registration complete message" + verifyRegistration.toString());
        return getTextFromElement(verifyRegistration);
    }

    public void clickOnContinueTab() {
        log.info("Click on continue tab" + continueTab.toString());
        clickOnElement(continueTab);
    }


}
