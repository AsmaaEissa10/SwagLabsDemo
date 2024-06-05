package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
    private WebDriver driver;
    private By addToCartBtn = By.id("add-to-cart");
    private By shoppingCartBadge = By.className("shopping_cart_badge");
    public ProductPage(WebDriver driver) { this.driver = driver;}

    public ProductPage ClickToAddToCart() {
        driver.findElement(addToCartBtn).click();
        return this;
    }
    public ShoppingCartPage NavigateToShoppingCartPage() {
        driver.findElement(shoppingCartBadge).click();
        return new ShoppingCartPage(driver);}
}
