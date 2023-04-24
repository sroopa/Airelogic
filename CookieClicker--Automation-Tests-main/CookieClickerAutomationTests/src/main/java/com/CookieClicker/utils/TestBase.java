package com.CookieClicker.utils;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBase
{
    public WebDriver getDriver() {
        return driver;
    }

    public WebDriver driver;
    @BeforeClass
    public void startWebDriver()
    {
        driver = DriverFactory.InitialiseWebdriver();

        driver.get("https://roopa-s-20223-04-18.cookieclickertechtest.airelogic.com/");
        driver.manage().window().maximize();
    }

    @AfterClass
    public void tearDown()
    {
        driver.quit();
    }
}
