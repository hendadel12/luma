package com.luma.pages;

import com.luma.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InStockPage extends BasePage {
    // الباني يقوم بتمرير الـ WebDriver إلى الكلاس الأب (BasePage)
    public InStockPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = "[class=\"data switch\"]")
    private WebElement detailedDisplayed;


    public boolean detailedOfitemDisplayed(){
        return detailedDisplayed.isDisplayed();
    }

}
