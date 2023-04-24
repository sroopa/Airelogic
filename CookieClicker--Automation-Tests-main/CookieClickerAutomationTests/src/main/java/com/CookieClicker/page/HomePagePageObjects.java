 package com.CookieClicker.page;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

 public class HomePagePageObjects extends BasePage {
     WebDriver driver;


    String baseUrl = "https://roopa-s-20223-04-18.cookieclickertechtest.airelogic.com/";

     String your_name = ("//input[@name='name']");
     String startButton = ("//button[normalize-space()='Start!']");
    String playerTina = ("//a[contains(@href,'/game/tina')]");
    String playerScoresTable = ("//table");

    public HomePagePageObjects(WebDriver driver) { this.driver =driver;}



    public void clickStartButton() {

    driver.findElement(By.xpath(your_name)).sendKeys("Tina1");
    driver.findElement(By.xpath(startButton)).click();


    }

    public void selectPlayer() {
        List<WebElement> players = driver.findElements(By.xpath((playerTina)));
        if(players.stream().count() !=0)
         driver.findElement(By.xpath(playerTina)).click();

     }


    }