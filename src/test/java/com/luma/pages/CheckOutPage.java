package com.luma.pages;

import com.luma.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CheckOutPage extends BasePage {

    @FindBy(xpath = "//*[@id=\"checkout-step-shipping\"]/div[1]/div/div/div")// هذا هو عنصر الـ "shippingAddressBox"
    private WebElement shippingAddressBox;

    public CheckOutPage(WebDriver driver) {
        super(driver);
    }

    public boolean displayedShippingAddressBox() {
        return shippingAddressBox.isDisplayed();
    }

    public void waitForShippingAddressBoxToBeVisible() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(shippingAddressBox));
    }
}


