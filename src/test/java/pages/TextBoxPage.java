package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import util.ElementHelper;

public class TextBoxPage {
    static WebDriver driver;
    static ElementHelper elementHelper;
    WebDriverWait webDriverWait;
    static JavascriptExecutor jsx;

    static String fullName = "Test";
    static String email = "test@deneme.com";
    static String currentAddress = "Test, Test/Deneme";

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
        this.webDriverWait = new WebDriverWait(driver,10);
        this.elementHelper = new ElementHelper(driver);
    }
    public static void textBoxPage() {
        //driver.get("https://demoqa.com/elements");
    }
    public static void clickTextBox(){
        elementHelper.click(textBoxButton);
    }
    public static void sendFullName(){
        elementHelper.sendKey(fullNameLabel, fullName);
    }
    public static void sendEmail(){
        elementHelper.sendKey(emailLabel, email);
    }
    public static void sendCurrentAddress(){
        elementHelper.sendKey(currentAddressLabel, currentAddress);
    }
    public static void clickSubmit(){
        jsx.executeScript("window.scrollBy(0,350)","");//Sayfa aşağı kaydırılır
        elementHelper.click(submitButton);
    }
    public static void assertInfo(){
        Assert.assertEquals(elementHelper.getText(actualResultName), "Name:"+fullName);
        Assert.assertEquals(elementHelper.getText(actualResultEmail), "Email:"+email);
        Assert.assertEquals(elementHelper.getText(actualResultAddress), "Current Address :"+currentAddress);
    }
}
