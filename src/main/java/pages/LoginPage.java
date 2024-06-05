package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By userNameFeild = By.id("user-name");
    private By passWordFeild = By.id("password");
    private  By loginButton = By.id("login-button");
    public LoginPage(WebDriver driver) { this.driver = driver;}

    public void setUsername(String username) {
        driver.findElement(userNameFeild).sendKeys(username);
    }
    public void setPassword(String password) {
        driver.findElement(passWordFeild).sendKeys(password);
    }
    public HomePage NavigateToHomePage(){
        driver.findElement(loginButton).click();
        return new HomePage(driver);
    }
}
