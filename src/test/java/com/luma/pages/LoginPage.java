package com.luma.pages;

import com.luma.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver){
        super(driver);
    }
    @FindBy(css="[id=\"email\"]")
    private WebElement emailInput;

    @FindBy(css="[id=\"pass\"]")
    private WebElement passwordInput;

    @FindBy(xpath = "//*[@id=\"send2\"]/span")
    private WebElement submit;
    @FindBy(css = "[data-ui-id=\"page-title-wrapper\"]")
    private WebElement myaccDispalyed;
    @FindBy(css = "[class=\"mage-error\"]")
    private WebElement messageOfRequiredField;
    @FindBy(css = "[class=\"mage-error\"]")
    private WebElement messageErrorOfPasswordDisplayed;
    @FindBy(css = "[for=\"email\"]")
    private WebElement errorMessageOfEmailFormate;
    @FindBy(xpath = "/html/body/div[2]/header/div[1]/div/ul/li[3]/a")
    private WebElement regPageButton;

    public LoginPage load(){
        driver.get("https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS9jdXN0b21lci9hY2NvdW50L2xvZ291dFN1Y2Nlc3Mv/");
        return this;
    }

    public MyAccountPage login(String email,String password){
        emailInput.sendKeys(email);
        passwordInput.sendKeys(password);
        submit.click();
        return new MyAccountPage(driver);
    }
    public boolean errorMessageOfRequiredFieldDisplayed(){
        return messageOfRequiredField.isDisplayed();
    }
    public boolean errorMessageOfPasswordFieldDisplayed(){
        return  messageErrorOfPasswordDisplayed.isDisplayed();
    }
    public boolean errorMessageOfFormateEmail(){
        return errorMessageOfEmailFormate.isDisplayed();
    }
    public RegisterationPage clickOnRegIcon(){
        regPageButton.click();
        return new RegisterationPage(driver);
    }
}
