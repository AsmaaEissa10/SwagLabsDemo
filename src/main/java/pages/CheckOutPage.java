package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutPage {
    private WebDriver driver;
    private By firstNameFeild = By.id("first-name");
    private By lastNameFeild = By.id("last-name");
    private  By PostalCodeFeild = By.id("postal-code");
    private  By continueBtn = By.id("continue");

    public CheckOutPage(WebDriver driver) { this.driver = driver;}
    public void setFirstname(String firstname) {
        driver.findElement(firstNameFeild).sendKeys(firstname);
    }
    public void setLastname(String lastname) {
        driver.findElement(lastNameFeild).sendKeys(lastname);
    }
    public void setPostalCode(String postalCode) {
        driver.findElement(PostalCodeFeild).sendKeys(postalCode);
    }
    public CheckOutOverviewPage NavigateToCheckOutOverviewPage(){
        driver.findElement(continueBtn).click();
        return new CheckOutOverviewPage(driver);
    }
}
