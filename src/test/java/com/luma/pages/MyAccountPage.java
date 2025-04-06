package com.luma.pages;

import com.luma.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.swing.text.html.CSS;

public class MyAccountPage extends BasePage {

    public MyAccountPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = "[data-ui-id=\"page-title-wrapper\"]")
    private WebElement myacc;
    @FindBy(xpath = "/html/body/div[2]/header/div[2]/a/img")
    private WebElement home;

    public boolean dilsplay(){
        return myacc.isDisplayed();
    }
    public HomePage clickOnHomeIcone(){
        home.click();
        return new HomePage(driver);
    }
}
