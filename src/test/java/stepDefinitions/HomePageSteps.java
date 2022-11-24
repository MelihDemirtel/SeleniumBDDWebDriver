package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import util.DriverFactory;

public class HomePageSteps {
    WebDriver driver = DriverFactory.getDriver();
    HomePage homePage = new HomePage(driver);

    @Given("user is on home page")
    public void userIsOnHomePage() {
        HomePage.homePage();
    }

    @When("user click elements")
    public void userClickElements() {
        HomePage.clickElements();
    }

    @Then("user check page")
    public void userCheckPage() {
        HomePage.assertElementsPage();
    }
}
