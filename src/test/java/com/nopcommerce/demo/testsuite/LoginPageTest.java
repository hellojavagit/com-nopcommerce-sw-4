package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePageNopCom;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {
    HomePageNopCom homePage=new HomePageNopCom();
    LoginPage loginPage=new LoginPage();
    @Test
    public void verifyUserShouldNavigateToLoginPage(){
        homePage.clickOnLoginLink();
        String expectedMessage = "Welcome, Please Sign In!";
        String actualMessage=loginPage.getWelcomeText();
        Assert.assertEquals(actualMessage,expectedMessage,"Login Page is not displayed");
    }
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        homePage.clickOnLoginLink();
        loginPage.enterEmailID("prime123@gmail.com");
        loginPage.enterPassword("abcd1234");
        loginPage.clickOnLoginButton();
        String expectedLogoutText="Log out";
        String actualLogoutText=loginPage.getLogOutText();
        Assert.assertEquals(actualLogoutText, expectedLogoutText,"Text Not Found");
    }

    @Test
    public void verifyErrorMessageWithInvalidCredentials(){
        homePage.clickOnLoginLink();
        loginPage.enterEmailID("prime123@gmail.com");
        loginPage.enterPassword("abcd1234");
        loginPage.clickOnLoginButton();

        String expectedErrorMsg="Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        String actualErrorMsg=loginPage.getErrorMessage();

        Assert.assertEquals(actualErrorMsg,expectedErrorMsg, "Error Message Not Displayed");
    }

}


