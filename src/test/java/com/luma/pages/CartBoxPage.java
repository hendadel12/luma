package com.luma.pages;

import com.luma.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartBoxPage extends BasePage {
    public CartBoxPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"top-cart-btn-checkout\"]")
    private WebElement checkOutButton;


    public CheckOutPage ClickOnCheckOutButton() {
        checkOutButton.click();
        return new CheckOutPage(driver);

    }
}

