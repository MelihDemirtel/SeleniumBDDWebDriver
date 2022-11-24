package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.TextBoxPage;
import util.DriverFactory;

public class TextBoxSteps {
    WebDriver driver = DriverFactory.getDriver();
    TextBoxPage textBoxPage = new TextBoxPage(driver);

    @Given("user is on elements page")
    public void userIsOnElementsPage() {
        TextBoxPage.textBoxPage();
    }

    @When("user click text box")
    public void userClickTextBox() {
        TextBoxPage.clickTextBox();
    }

    @When("user write full name")
    public void userWriteFullName() {
        TextBoxPage.sendFullName();
    }

    @When("user write email")
    public void userWriteEmail() {
        TextBoxPage.sendEmail();
    }

    @When("user write current address")
    public void userWriteCurrentAddress() {
        TextBoxPage.sendCurrentAddress();
    }

    @When("user click submit")
    public void userClickSubmit() {
        TextBoxPage.clickSubmit();
    }

    @Then("user check informations")
    public void userCheckInformations() {
        TextBoxPage.assertInfo();
    }
}
