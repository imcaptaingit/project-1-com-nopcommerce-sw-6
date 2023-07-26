package com.nopcommerce.demo.steps;


import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginSteps {
    @Given("I am on home page")
    public void iAmOnHomePage() {
    }

    @When("I click on login link")
    public void iClickOnLoginLink() {
        new HomePage().clickOnLoginLink();
    }

    @Then("Welcome message is displayed")
    public void welcomeMessageIsDisplayed() {
        Assert.assertEquals(new LoginPage().verifyWelcomeText(), "Welcome, Please Sign In!", "Unable to verify message");
    }


    @And("I enter email {string}")
    public void iEnterEmail(String email) {
        new LoginPage().enterEmail(email);
    }

    @And("I enter password {string}")
    public void iEnterPassword(String password) {
        new LoginPage().enterPassword(password);
    }

    @And("I click on login button")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @Then("I should see the error message")
    public void iShouldSeeTheErrorMessage() {
        Assert.assertEquals(new LoginPage().verifyErrorMessage(), "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found", "Unable to verify message");
    }


    @Then("I should see the logout link displayed")
    public void iShouldSeeTheLogoutLinkDisplayed() {
        Assert.assertEquals(new LoginPage().verifyLogoutLinkIsDisplayed(), "Log out", "Unable to verify link.");
    }

    @And("I click on logout link")
    public void iClickOnLogoutLink() {
        new LoginPage().clickOnLogoutLink();
    }

    @Then("I should see the login link displayed")
    public void iShouldSeeTheLoginLinkDisplayed() {
        Assert.assertEquals(new HomePage().verifyLoginLinkIsDisplayed(), "Log in", "Unable to verify link.");
    }
}
