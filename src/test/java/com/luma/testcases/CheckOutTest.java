package com.luma.testcases;

import com.luma.base.BaseTest;
import com.luma.pages.*;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.Assert;
import org.testng.annotations.Test;
@Feature("Check out ")
public class CheckOutTest extends BaseTest {
@Story("check out ")
    @Test(description = "Test the function of check out ")
    public void ShouldBeCheckoutSuccessfully() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.load();
        loginPage.login("hendadelmoner@gmail.com", "Hendadel123");

        MyAccountPage myAccountPage = new MyAccountPage(driver);
        myAccountPage.clickOnHomeIcone();

        HomePage homePage = new HomePage(driver);
        homePage.clickOnSize();
        homePage.clickOnColor();
        homePage.ClickOnAddCartButton();
        homePage.clickOnCartIcon();
        CartBoxPage cartBoxPage = new CartBoxPage(driver);
        cartBoxPage.ClickOnCheckOutButton();


        CheckOutPage checkOutPage = new CheckOutPage(driver);
        checkOutPage.waitForShippingAddressBoxToBeVisible();

        boolean shippingAddressBox = checkOutPage.displayedShippingAddressBox();
        Assert.assertTrue(shippingAddressBox, "Shipping Address Box is not displayed.");
    }
}


