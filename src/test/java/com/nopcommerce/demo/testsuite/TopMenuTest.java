package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePageNopCom;
import com.nopcommerce.demo.pages.TopMenuPages;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends TestBase {
    HomePageNopCom homePageNopCom = new HomePageNopCom();
    TopMenuPages topMenuPages = new TopMenuPages();

    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {
        homePageNopCom.clickOnComputers();
        String expectedText = "Computers";
        String actualText = topMenuPages.getComputersText();
        Assert.assertEquals(actualText, expectedText, "Computers Page is not Found");
    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully() {
        homePageNopCom.clickOnElectronics();
        String expectedText = "Electronics";
        String actualText = topMenuPages.getElectronicsText();
        Assert.assertEquals(actualText, expectedText, "Electronics Page is  not Found");
    }

    @Test
    public void userShouldNavigateToApparelPageSuccessfully() {
        homePageNopCom.clickOnApparel();
        String expectedText = "Apparel";
        String actualText = topMenuPages.getApparelText();
        Assert.assertEquals(actualText, expectedText, "Apparel Page is not Found");
    }
    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully() {
        homePageNopCom.clickOnDigitalDownloads();
        String expectedText = "Digital downloads";
        String actualText = topMenuPages.getDigitalDownloadsText();
        Assert.assertEquals(actualText, expectedText, "Digital downloads Page is not Found");
    }
    @Test
    public void userShouldNavigateToBooksPageSuccessfully() {
        homePageNopCom.clickOnBooks();
        String expectedText = "Books";
        String actualText = topMenuPages.getBooksText();
        Assert.assertEquals(actualText, expectedText, "Books Page is not Found");
    }
    @Test
    public void userShouldNavigateToJewelryPageSuccessfully(){
        homePageNopCom.clickOnJewelry();
        String expectedText = "Jewelry";
        String actualText = topMenuPages.getJewelryText();
        Assert.assertEquals(actualText, expectedText, "Jewelry Page is not Found");
    }
    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully(){
        homePageNopCom.clickOnGiftCards();
        String expectedText = "Gift Cards";
        String actualText = topMenuPages.getGiftCardsText();
        Assert.assertEquals(actualText, expectedText, " Gift Cards Page is not Found");
    }

}
