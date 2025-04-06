package com.luma.pages;

import com.luma.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    // تعريف العناصر باستخدام PageFactory
    @FindBy(css = "[id=\"option-label-size-143-item-166\"]")
    private WebElement size;

    @FindBy(css = "[id=\"option-label-color-93-item-50\"]")
    private WebElement color;

    @FindBy(xpath = "//*[@id='maincontent']/div[3]/div/div[2]/div[5]/div/div/ol/li[1]/div/div/div[4]/div/div[1]/form/button/span")
    private WebElement addtoCart;
    @FindBy(xpath = "//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[5]/div/div/ol/li[3]/div/a/span/span/img")
    private WebElement img;

    @FindBy(css = "[data-ui-id=\"message-success\"]")
    private WebElement messageDisplayedsucc;

    @FindBy(xpath = "//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[5]/div/div/ol/li[1]/div/div/div[4]/div/div[2]/a[1]")
    private WebElement addtowishlist;
    @FindBy(xpath = "/html/body/div[2]/header/div[2]/div[1]/a/span[2]")
    private WebElement opencart;


    public HomePage clickOnSize() {
        size.click();
        return this;
    }

    public HomePage clickOnColor() {
        color.click();
        return this;
    }

    public HomePage ClickOnAddCartButton() {
        addtoCart.click();
        return this;
    }

    public boolean messageDisplayed() {
        return messageDisplayedsucc.isDisplayed();
    }

    public WishPage clickOnWishListButton() {
        addtowishlist.click();
        return new WishPage(driver);
    }

    public InStockPage ClickOnImageDirect() {
        img.click();
        return new InStockPage(driver);
    }
    public CartBoxPage clickOnCartIcon(){
        opencart.click();
        return new CartBoxPage(driver);

    }



}
