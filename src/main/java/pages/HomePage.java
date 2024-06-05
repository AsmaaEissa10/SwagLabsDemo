package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private By productName = By.className("inventory_item_name");
    private By Assertproducts = By.className("title");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public ProductPage NavigateToProductPage() {
        driver.findElement(productName).click();
        return new ProductPage(driver);
    }

    public String AssertMsgHomePage() {
        return driver.findElement(Assertproducts).getText();
    }
}
