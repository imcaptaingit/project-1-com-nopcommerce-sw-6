package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class RegisterSteps {
    @When("I click on register link")
    public void iClickOnRegisterLink() {
        new HomePage().clickOnRegisterLink();
    }

    @Then("Register text is displayed")
    public void registerTextIsDisplayed() {
        Assert.assertEquals(new RegisterPage().verifyRegisterText(),"Register", "Unable to verify text.");
    }

    @And("I click on register button")
    public void iClickOnRegisterButton() {
        new RegisterPage().clickOnRegisterButton();
    }

    @And("I should see First name is required")
    public void iShouldSeeFirstNameIsRequired() {
        Assert.assertEquals(new RegisterPage().verifyFirstNameError(), "First name is required.", "Unable to verify error.");
    }

    @And("I should see Last name is required")
    public void iShouldSeeLastNameIsRequired() {
        Assert.assertEquals(new RegisterPage().verifyLastNameError(), "Last name is required.", "Unable to verify error.");
    }

    @And("I should see Email is required")
    public void iShouldSeeEmailIsRequired() {
        Assert.assertEquals(new RegisterPage().verifyEmailError(), "Email is required.", "Unable to verify error.");
    }

    @And("I should see Password is required")
    public void iShouldSeePasswordIsRequired() {
        Assert.assertEquals(new RegisterPage().verifyPasswordError(), "Password is required.", "Unable to verify error.");
    }

    @Then("I should see Confirm password is required")
    public void iShouldSeeConfirmPasswordIsRequired() {
        Assert.assertEquals(new RegisterPage().verifyConfirmPasswordError(), "Password is required.", "Password is required.");
    }

    @And("I select gender {string}")
    public void iSelectGender(String maleOrFemale) {
        new RegisterPage().selectGender(maleOrFemale);
    }

    @And("I enter first name {string}")
    public void iEnterFirstName(String firstName) {
        new RegisterPage().enterFirstName(firstName);
    }

    @And("I enter last name {string}")
    public void iEnterLastName(String lastName) {
        new RegisterPage().enterLastName(lastName);
    }

    @And("I select day {string}")
    public void iSelectDay(String day) {
        new RegisterPage().dateOfBirthDay(day);
    }

    @And("I select month {string}")
    public void iSelectMonth(String month) {
        new RegisterPage().dateOfBirthMonth(month);
    }

    @And("I select year {string}")
    public void iSelectYear(String year) {
        new RegisterPage().dateOfBirthYear(year);
    }
    @And("I enter email in register page {string}")
    public void iEnterEmailInRegisterPage(String email) {
        new RegisterPage().enterEmail(email);
    }

    @And("I enter password in register page {string}")
    public void iEnterPasswordInRegisterPage(String password) {
        new RegisterPage().enterPassword(password);
    }

    @And("I enter confirm password {string}")
    public void iEnterConfirmPassword(String confirmPassword) {
        new RegisterPage().enterConfirmPassword(confirmPassword);
    }

    @And("I click on register button button")
    public void iClickOnRegisterButtonButton() {
        new RegisterPage().clickOnRegisterButton();
    }

    @Then("I should see registration message completed message")
    public void iShouldSeeRegistrationMessageCompletedMessage() {
        Assert.assertEquals(new RegisterPage().verifyRegistrationCompleteMessage(), "Your registration completed", "Unable to verify message.");
    }

}
