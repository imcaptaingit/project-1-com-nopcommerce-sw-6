package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.BuildYourOwnComputerPage;
import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.DesktopsPage;
import com.nopcommerce.demo.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ComputerPageSteps {
    @When("I click on menu tab {string}")
    public void iClickOnMenuTab(String topMenu) {
        new HomePage().selectTopMenu(topMenu);
    }

    @Then("I should navigate to computers page successfully")
    public void iShouldNavigateToComputersPageSuccessfully() {
        Assert.assertEquals(new ComputerPage().verifyComputersText(), "Computers", "Unable to verify text.");
    }

    @And("I click on desktops link {string}")
    public void iClickOnDesktopsLink(String subList) {
        new ComputerPage().selectFromSublist(subList);
    }

    @Then("Verify desktops page is displayed")
    public void verifyDesktopsPageIsDisplayed() {
        Assert.assertEquals(new DesktopsPage().verifyDesktopsText(), "Desktops", "Unable to verify text.");
    }

    @And("I click on build your own computer")
    public void iClickOnBuildYourOwnComputer() {
        new DesktopsPage().clickOnBuildYourOwnComputer();
    }

    @And("I select processor {string}")
    public void iSelectProcessor(String processor) {
        new BuildYourOwnComputerPage().selectProcessorFromDropDown(processor);
    }

    @And("I select ram {string}")
    public void iSelectRam(String ram) {
        new BuildYourOwnComputerPage().selectRamFromDropDown(ram);
    }

    @And("I select HDD {string}")
    public void iSelectHDD(String hddRadio) {
        new BuildYourOwnComputerPage().selectHDDRadios(hddRadio);
    }

    @And("I select OS {string}")
    public void iSelectOS(String osRadio) {
        new BuildYourOwnComputerPage().selectOSRadioButton(osRadio);
    }

    @And("I select software {string}")
    public void iSelectSoftware(String software) {
        new BuildYourOwnComputerPage().selectSoftwareType(software);
    }

    @And("I click on add to cart button")
    public void iClickOnAddToCartButton() {
        new BuildYourOwnComputerPage().clickOnAddToCartButton();
    }

    @Then("Verify product has been added to your shopping cart text")
    public void verifyProductHasBeenAddedToYourShoppingCartText() {
        Assert.assertEquals(new BuildYourOwnComputerPage().verifyProductHasBeenAddedText(), "The product has been added to your shopping cart", "Unable to verify message.");
    }
}

