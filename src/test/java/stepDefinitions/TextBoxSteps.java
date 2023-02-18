package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.TextBoxPage;
import util.DriverFactory;

public class TextBoxSteps {
    WebDriver driver = DriverFactory.getDriver();
    TextBoxPage TextBoxPage = new TextBoxPage(driver);

    @Given("user is on elements page")
    public void userIsOnElementsPage() {
        TextBoxPage.textBoxPage();
    }

    @And("user click text box")
    public void userClickTextBox() {
        TextBoxPage.clickTextBox();
    }

    @And("user write full name")
    public void userWriteFullName() {
        TextBoxPage.sendFullName();
    }

    @And("user write email")
    public void userWriteEmail() {
        TextBoxPage.sendEmail();
    }

    @And("user write current address")
    public void userWriteCurrentAddress() {
        TextBoxPage.sendCurrentAddress();
    }

    @When("user click submit")
    public void userClickSubmit() {
        TextBoxPage.clickSubmit();
    }
    @Then("user check information")
    public void userCheckInformation() {
        TextBoxPage.assertInfo();
    }
}
