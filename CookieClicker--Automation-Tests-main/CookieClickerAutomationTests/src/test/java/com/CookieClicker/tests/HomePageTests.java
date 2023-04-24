package com.CookieClicker.tests;

import com.CookieClicker.page.BasePage;
import com.CookieClicker.page.HomePagePageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTests extends BasePage {

    @Test
    public void startGame() {


      homePagePageObjects().clickStartButton();

        /*homePagePageObjects().selectPlayerTina();
        String expectedText = "Hello";
        WebElement actualText = driver.findElement(By.xpath("(//p)[1]"));
        Assert.assertTrue(actualText.isDisplayed());*/


    }
    }