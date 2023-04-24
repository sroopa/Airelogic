package com.CookieClicker.tests;
import com.CookieClicker.page.BasePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GamePageTests extends BasePage {

    @Test
    public void addCookies() {

        homePagePageObjects().clickStartButton();
        gamePagePageObjects().initialValuesOfObjects();
        String no_of_cookies = gamePagePageObjects().addCookies();
        System.out.println(no_of_cookies);
        Assert.assertEquals(no_of_cookies, "19");

    }

    @Test

    public void sellCookies() {
        homePagePageObjects().clickStartButton();
        gamePagePageObjects().initialValuesOfObjects();
        gamePagePageObjects().addCookies();
        double cookie_cost = gamePagePageObjects().sellCookies();
        String money = driver.findElement(By.xpath("//span[@id='money']")).getText();
        double money_available = Double.parseDouble(money);
       // System.out.println(money_available);


        Assert.assertEquals(money_available, cookie_cost,  0.00);

    }

    @Test
    public void buyFactories() {
        homePagePageObjects().clickStartButton();
        gamePagePageObjects().initialValuesOfObjects();
        gamePagePageObjects().addCookies();
        gamePagePageObjects().sellCookies();
        int factories_brought = (int) (int) gamePagePageObjects().buyFactories();
        String no_of_factories = driver.findElement((By.xpath(gamePagePageObjects().factories_value))).getText();
        double factories_available = Double.parseDouble(no_of_factories);
       // Thread.sleep(5000);
        System.out.println(factories_available);

        Assert.assertEquals(factories_available, factories_brought, 0);
    }
}





