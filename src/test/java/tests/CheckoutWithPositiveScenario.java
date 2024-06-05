package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class CheckoutWithPositiveScenario extends BaseTest {
    LoginPage loginPage;
    HomePage homePage;
    ProductPage productPage;
    ShoppingCartPage shoppingCart;
    CheckOutPage checkOutPage;
    CheckOutOverviewPage checkOutOverviewPage;
    CheckoutCompletePage checkOutCompletePage;

    @Test (priority = 1)
    public void LoginWithValidValues(){
        loginPage = new LoginPage(driver);
        loginPage.setUsername("standard_user");
        loginPage.setPassword("secret_sauce");
       homePage =  loginPage.NavigateToHomePage();
        Assert.assertTrue(homePage.AssertMsgHomePage().contains("Products"), " login page don't navigate to homepage");
    }

    @Test (priority = 2)
    public void productPageTest(){
        productPage = homePage.NavigateToProductPage();

    }

    @Test (priority = 3)
    public void ShoppingCartTest (){
          shoppingCart = productPage.ClickToAddToCart()
                       .NavigateToShoppingCartPage();
    }

    @Test (priority = 4)
    public void checkOutTest (){
        checkOutPage = shoppingCart.NavigateToCheckOutPage();
        checkOutPage.setFirstname("Asmaa");
        checkOutPage.setLastname("Eissa");
        checkOutPage.setPostalCode("20003");
    }
    @Test (priority = 5)
    public void checkOutOverViewTest (){
    checkOutOverviewPage = checkOutPage.NavigateToCheckOutOverviewPage();
    }

    @Test (priority = 6)
    public void checkOutCompleteTest (){
    checkOutCompletePage = checkOutOverviewPage.NavigateToCheckoutCompletePage();
    Assert.assertTrue(checkOutCompletePage.AssertMsgComplete().contains("Thank you for your order!"), "the order not complete");

    }

    }
