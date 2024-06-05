package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingCartPage {
    private WebDriver driver;
    private By cartQuantity = By.className("cart_quantity");
    private By checkOutBtn = By.id("checkout");
    public ShoppingCartPage(WebDriver driver) { this.driver = driver;}

    public CheckOutPage NavigateToCheckOutPage() {
        driver.findElement(checkOutBtn).click();
        return new CheckOutPage(driver);}
}
