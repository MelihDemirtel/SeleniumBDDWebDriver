package util;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ElementHelper {

    WebDriver driver;
    WebDriverWait webDriverWait;
    Actions actions;

    public ElementHelper(WebDriver driver){
        this.driver = driver;
        this.webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(5));
        this.actions = new Actions(driver);

    }
    public WebElement presenceElement(By key){
        return webDriverWait.until(ExpectedConditions.presenceOfElementLocated(key));

    }
    public WebElement findElement(By key){
        WebElement element = presenceElement(key);
        return element;
    }
}
