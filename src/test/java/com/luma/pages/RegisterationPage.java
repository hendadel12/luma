package com.luma.pages;

import com.luma.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterationPage extends BasePage {
    public RegisterationPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = "[name=\"firstname\"]")
    private WebElement firstNameInput;
    @FindBy(css = "[name=\"lastname\"]")
    private WebElement lastNameInput;
    @FindBy(css = "[type=\"email\"]")
    private WebElement emailForRegInput;
    @FindBy(xpath = "//*[@id=\"password\"]")
    private WebElement passForRegInput;
    @FindBy(xpath = "//*[@id=\"password-confirmation\"]")
    private WebElement conPassForRegInput;
    @FindBy(xpath = "//*[@id=\"form-validate\"]/div/div[1]/button/span")
    private WebElement creatAcountButton;
    @FindBy(xpath = "//*[@id=\"firstname-error\"]")
    private WebElement messOfFiledReqForFirstName;
    @FindBy(xpath = "//*[@id=\"lastname-error\"]")
    private WebElement messOfFiledReqForLastName;
    @FindBy(xpath = "//*[@id=\"email_address-error\"]")
    private  WebElement messOfFiledReqForEmail;
    @FindBy(xpath = "//*[@id=\"password-confirmation-error\"]")
    private WebElement enterThesamePassword;


    public void setRegData(String firstName,String lastName,String email,String password,String confirmPassword){
        firstNameInput.sendKeys(firstName);
        lastNameInput.sendKeys(lastName);
        emailForRegInput.sendKeys(email);
        passForRegInput.sendKeys(password);
        conPassForRegInput.sendKeys(confirmPassword);
    }
    public MyAccountPage clickOnCreateAccountButton(){
        creatAcountButton.click();
        return new MyAccountPage(driver);
    }
    public boolean displayMessOfFieldrequiredOfFirstName(){
        return messOfFiledReqForFirstName.isDisplayed();
    }
    public boolean displayMessOfFieldrequiredOfLastName(){
        return messOfFiledReqForLastName.isDisplayed();
    }

    public boolean displayMessOfFieldrequiredOfEmail(){
        return messOfFiledReqForEmail.isDisplayed();
    }
    public boolean pleaseEnterTheSamePassword(){
        return enterThesamePassword.isDisplayed();
    }


}


