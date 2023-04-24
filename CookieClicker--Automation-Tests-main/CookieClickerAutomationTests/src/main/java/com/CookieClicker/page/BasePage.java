package com.CookieClicker.page;

import com.CookieClicker.utils.TestBase;
import org.openqa.selenium.support.PageFactory;

public class BasePage extends TestBase {


    public HomePagePageObjects homePagePageObjects(){
        PageFactory.initElements(getDriver(), HomePagePageObjects.class);
        return new HomePagePageObjects(getDriver());
    }
    public GamePagePageObjects gamePagePageObjects(){
        PageFactory.initElements(getDriver(), GamePagePageObjects.class);
        return  new GamePagePageObjects(getDriver());
    }


}
