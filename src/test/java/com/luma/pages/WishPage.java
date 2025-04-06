package com.luma.pages;

import com.luma.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WishPage extends BasePage {
    public WishPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"maincontent\"]/div[1]/div[2]/div/div/div")
    private WebElement messageOFAddedItem;

    public boolean displayMessOfAddItemToWishList() {
        return messageOFAddedItem.isDisplayed();

    }

}