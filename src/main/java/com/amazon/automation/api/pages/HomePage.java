package com.amazon.automation.api.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {

    WebDriver driver;
    WebDriverWait wait;

    By searchBox = By.id("twotabsearchtextbox");
    By searchButton = By.id("nav-search-submit-button");

    //Constructor
    public HomePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    //Method to search an item
    public void searchProduct(String product) {

        wait.until(ExpectedConditions.visibilityOfElementLocated(searchBox));
        driver.findElement(searchBox).sendKeys(product);
        driver.findElement(searchButton).click();
    }
}