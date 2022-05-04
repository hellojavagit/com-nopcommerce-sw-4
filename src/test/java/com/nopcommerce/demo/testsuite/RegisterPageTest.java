package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePageNopCom;
import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterPageTest extends TestBase {
    HomePageNopCom homepage=new HomePageNopCom();
    RegisterPage registerPage=new RegisterPage();
    @Test
    public void userShouldNavigateToRegisterPageSuccessfully() {
        homepage.clickOnRegisterLink();
        String expectedText = "Register";
        String actualText=registerPage.getWelcomeText();
        Assert.assertEquals(actualText, expectedText, "Register Page Is Not Found");
    }
    @Test
    public void userShouldRegisterAccountSuccessfully() {
        homepage.clickOnRegisterLink();
        registerPage.clickOnFemaleRadioButton();
        registerPage.enterFirstName("hi");
        registerPage.enterLastName("hello");
        registerPage.enterDay("10");
        registerPage.enterMonth("August");
        registerPage.enterYear("1990");
        registerPage.enterEmailId("prime1234@gmail.com");
        registerPage.enterPassword("abcd1234");
        registerPage.enterConfirmPassword("abcd1234");
        registerPage.clickRegisterButton();
        String expectedResult="Your registration completed";
        String actualResult=registerPage.getRegistrationText();
        Assert.assertEquals(actualResult,expectedResult,"Registration is not successful");

    }

}


