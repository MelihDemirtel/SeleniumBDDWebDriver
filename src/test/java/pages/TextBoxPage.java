package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import util.ElementHelper;

import java.time.Duration;

public class TextBoxPage {
    static WebDriver driver;
    static ElementHelper elementHelper;
    public WebDriverWait webDriverWait;

    static String fullName = "Test";
    static String email = "test@deneme.com";
    static String currentAddress = "Test, Test/Deneme";

    static By elementsHeader = By.xpath("//div[@class='main-header' and contains(text(),'Elements')]");

    static By textBoxButton = By.xpath("//span[text()='Text Box']");

    static By fullNameLabel = By.id("userName");
    static By emailLabel = By.id("userEmail");
    static By currentAddressLabel = By.id("currentAddress");
    static By submitButton = By.id("submit");

    static By actualResultName = By.id("name");
    static By actualResultEmail = By.id("email");
    static By actualResultAddress = By.xpath("//p[@id='currentAddress']");

    public TextBoxPage(WebDriver driver){
        this.driver = driver;
        this.webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(5));
        this.elementHelper = new ElementHelper(driver);
    }
    public void textBoxPage() {
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(elementsHeader));
        Assert.assertTrue(elementHelper.findElement(elementsHeader).isDisplayed());
        System.out.println("User At Elements Page");
    }
    public void clickTextBox(){
        webDriverWait.until(ExpectedConditions.elementToBeClickable(textBoxButton));
        elementHelper.findElement(textBoxButton).click();
        System.out.println("User Clicked Text Box Button");
    }
    public void sendFullName(){
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(fullNameLabel));
        elementHelper.findElement(fullNameLabel).sendKeys(fullName);
        System.out.println("User Sent Full Name");
    }
    public void sendEmail(){
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(emailLabel));
        elementHelper.findElement(emailLabel).sendKeys(email);
        System.out.println("User Sent Email");
    }
    public void sendCurrentAddress(){
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(currentAddressLabel));
        elementHelper.findElement(currentAddressLabel).sendKeys(currentAddress);
        System.out.println("User Sent Current Address");
    }
    public void clickSubmit() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(submitButton));
        elementHelper.findElement(submitButton).click();
        System.out.println("User Clicked Submit Button");
    }
    public void assertInfo(){
        Assert.assertEquals(elementHelper.findElement(actualResultName).getText(), "Name:"+fullName);
        System.out.println("User Checked Full Name | " + elementHelper.findElement(actualResultName).getText());
        Assert.assertEquals(elementHelper.findElement(actualResultEmail).getText(), "Email:"+email);
        System.out.println("User Checked Email | " + elementHelper.findElement(actualResultEmail).getText());
        Assert.assertEquals(elementHelper.findElement(actualResultAddress).getText(), "Current Address :"+currentAddress);
        System.out.println("User Checked Current Address | " + elementHelper.findElement(actualResultAddress).getText());
    }
}
