package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import util.ElementHelper;

public class HomePage {
    static WebDriver driver;
    static ElementHelper elementHelper;
    WebDriverWait webDriverWait;

    static By elementsButton = By.xpath("//h5[contains(text(),'Elements')]");
    static By actualElementsPageMessage = By.xpath("//div[text()='Please select an item from left to start practice.']");

    static String expectedMessage = "Please select an item from left to start practice.";

    public HomePage(WebDriver driver){
        this.driver = driver;
        this.webDriverWait = new WebDriverWait(driver,10);
        this.elementHelper = new ElementHelper(driver);
    }
    public static void homePage() {
    }
    public static void clickElements(){
        elementHelper.click(elementsButton);
    }
    public static void assertElementsPage(){
        Assert.assertEquals(actualElementsPageMessage, expectedMessage);
    }
}