package com.CookieClicker.page;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Arrays;
import java.util.Objects;

import static java.lang.Integer.parseInt;
import static org.junit.Assert.assertEquals;

public class GamePagePageObjects extends BasePage {
     WebDriver driver;
// objects or elements nad their locators
    String userName =  ("(//p)[1]");
    public String cookies_value = ("//span[@id='cookies']");
    public String factories_value = ("//span[@id='factories']");
    public String money_value = ("//span[@id='money']");
    String clickCookies_Button = ("//button[@id='click']");
    public String sellCookies_text = ("//input[@id='cookies-to-sell']");
    String sellCookies_button = ("//button[@id='sell-cookies']");
    String buyFactories_text = ("//input[@id='factories-to-buy']");
    String buyFactories_button= ("//button[@id='buy-factories']");


    public GamePagePageObjects(WebDriver driver) { this.driver =driver;}

    public  void initialValuesOfObjects()
    {
         String cookies = driver.findElement(By.xpath(cookies_value)).getText();
         System.out.println(cookies);
         String factories = driver.findElement(By.xpath(factories_value)).getText();
         System.out.println(factories);
         String money = driver.findElement(By.xpath(money_value)).getText();
         System.out.println(money);

    }
    //Test to add cookies and return the no of cookies available
    public String addCookies()
    {
        for( int i=0; i<=20; i++)
        driver.findElement(By.xpath(clickCookies_Button)).click();
       WebElement cookies_added =driver.findElement(By.xpath(cookies_value));
       String cookies_available= cookies_added.getText();
       return cookies_available;


    }
    //Test to sell cookie and calculate the amount earned by selling cookies and total amount available
      public double sellCookies()
      {
          driver.findElement(By.xpath(sellCookies_text)).sendKeys("15");
          driver.findElement(By.xpath(sellCookies_button)).click();
        //  String money = driver.findElement(By.xpath(money_value)).getText();
        //  double money_available = Double.parseDouble(money);
        //  System.out.println(money_available);
          String cookies =  driver.findElement(By.xpath(sellCookies_text)).getAttribute("value");
          System.out.println(cookies);
          int no_of_cookies = parseInt(cookies);
          double  cookie_cost = (double) ((no_of_cookies) * 0.25);
          System.out.println(cookie_cost);
          return cookie_cost;

      }
// Test to buy a  factory, validate no of factories available and balance of amount available
      public int buyFactories()
      {
          driver.findElement(By.xpath(buyFactories_text)).sendKeys("1");
          driver.findElement(By.xpath(buyFactories_button)).click();
          String factories = driver.findElement(By.xpath(buyFactories_text)).getAttribute("value");
           int factories_brought = parseInt(factories);
          System.out.println(factories);
          return factories_brought;

      }
}