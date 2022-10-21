package com.talentLMS.Ui.pages;

import com.talentLMS.Ui.helpers.Helper;
import com.talentLMS.Ui.driverFactory.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {


  protected BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    protected Helper helper = new Helper();
    protected WebDriver driver = Driver.getDriver();
}
