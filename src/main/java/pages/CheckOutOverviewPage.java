package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutOverviewPage {
    private WebDriver driver;
    public CheckOutOverviewPage(WebDriver driver) { this.driver = driver;}
    private By finishBtn = By.id("finish");
    public CheckoutCompletePage NavigateToCheckoutCompletePage(){
        driver.findElement(finishBtn).click();
        return new CheckoutCompletePage(driver);
    }
}
