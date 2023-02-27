MainPage.java
        package pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import pages.component.LogoComponent;

public class MainPage {

    private final WebDriver driver;

    private final By btnOrderStatus = By.className("Header_Link__1TAG7");

    private final By inputOrderNum = By.xpath("//input[@class='Input_Input__1iN_Z Header_Input__xIoUq']");

    private final By btnSearch = By.xpath("//button[@class='Button_Button__ra12g Header_Button__28dPO']");

    private final LogoComponent logo;

    public MainPage(WebDriver driver) {

        this.driver = driver;

        logo = new LogoComponent(driver);

    }

    public MainPage clickOrderStatusButton() {

        driver.findElement(btnOrderStatus).click();

        return this;

    }

    public MainPage setOrderNumber(String orderNum) {

        driver.findElement(inputOrderNum).sendKeys(orderNum);

        return this;

    }

    public TrackOrderPage clickSearchButton() {

        driver.findElement(btnSearch).click();

        return new TrackOrderPage(driver);

    }

}