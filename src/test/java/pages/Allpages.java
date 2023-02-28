package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumElementLocatorFactory;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.time.Duration;

public class Allpages {

    public Allpages(){

        PageFactory.initElements(Driver.getAppiumDriver(),this);

    }
    @FindBy(xpath = "//button[@id='didomi-notice-agree-button']")
    public WebElement cookie;
    @FindBy(xpath = "//*[@class='allfont allfont-perso']")
    public WebElement singIn;











}
