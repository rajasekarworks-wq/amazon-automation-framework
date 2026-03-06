package com.amazon.automation.api.tests;

import com.amazon.automation.api.base.BaseTest;
import com.amazon.automation.api.pages.HomePage;
import org.testng.annotations.Test;

public class AmazonSearchTest extends BaseTest {

    @Test
    public void searchProductTest() {

        HomePage homePage = new HomePage(driver);
        homePage.searchProduct("Laptop");
    }
}