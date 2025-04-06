package com.luma.testcases;

import com.luma.base.BaseTest;
import com.luma.pages.LoginPage;
import com.luma.pages.MyAccountPage;
import com.luma.pages.RegisterationPage;
import com.github.javafaker.Faker;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.Assert;
import org.testng.annotations.Test;
@Feature("Registration function")
public class RegistrationTest extends BaseTest {

    private Faker faker = new Faker();
@Story("verify registration without first name")
    @Test(description = "Test the function of registration without writing first name and valid data")
    public void VerifyRegWithoutWritingFirsrtName() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.load();
        loginPage.clickOnRegIcon();
        RegisterationPage registerationPage = new RegisterationPage(driver);

        String email = faker.internet().emailAddress();

        registerationPage.setRegData("", "ahmed", email, "Yamenahmed123", "Yamenahmed123");
        registerationPage.clickOnCreateAccountButton();
        boolean messOfFiledReqForFirstName = registerationPage.displayMessOfFieldrequiredOfFirstName();
    }
    @Story("verify registration without last name")
    @Test (description = "Test the function of registration without writing last name")
    public void VerifyRegWithoutWritingLasttName() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.load();
        loginPage.clickOnRegIcon();
        RegisterationPage registerationPage = new RegisterationPage(driver);

        String email = faker.internet().emailAddress();

        registerationPage.setRegData("yamen", "", email, "Yamenahmed123", "Yamenahmed123");
        registerationPage.clickOnCreateAccountButton();
        boolean messOfFiledReqForLaststName = registerationPage.displayMessOfFieldrequiredOfLastName();
    }
    @Story("verify registration without email")
    @Test(description = "Test the function of registration without writing email")
    public void VerifyRegWithoutWritingEmail() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.load();
        loginPage.clickOnRegIcon();
        RegisterationPage registerationPage = new RegisterationPage(driver);

        String email = "";
        registerationPage.setRegData("yamen", "ahmed", email, "Yamenahmed123", "Yamenahmed123");
        registerationPage.clickOnCreateAccountButton();

        boolean messOfFiledReqForEmail = registerationPage.displayMessOfFieldrequiredOfEmail();

        Assert.assertTrue(messOfFiledReqForEmail, "Email is required, but no message is displayed.");
    }
    @Story("verify registration without writing the same password")
    @Test(description = "Test the function of registration without writing the same password")
    public void VerifyRegwithoutWritingTheSamePassword() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.load();
        loginPage.clickOnRegIcon();
        RegisterationPage registerationPage = new RegisterationPage(driver);

        String email = faker.internet().emailAddress();

        registerationPage.setRegData("yamen", "ahmed", email, "Yamenahmed12", "Yamenahmed123");
        registerationPage.clickOnCreateAccountButton();
        boolean enterThesamePassword = registerationPage.pleaseEnterTheSamePassword();
    }
    @Story("verify registration with valid data")
    @Test(description = "Test the function of registration with valid data")
    public void VerifyRegWithValidData(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.load();
        loginPage.clickOnRegIcon();
        RegisterationPage registerationPage = new RegisterationPage(driver);

        String email = faker.internet().emailAddress();

        registerationPage.setRegData("yamen", "ahmed", email, "Yamenahmed123", "Yamenahmed123");
        registerationPage.clickOnCreateAccountButton();
        MyAccountPage myAccountPage = new MyAccountPage(driver);
        boolean myacc = myAccountPage.dilsplay();
        Assert.assertTrue(myacc);
    }
}
