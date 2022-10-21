package com.talentLMS.Ui.driverFactory;

import com.talentLMS.Ui.dataProvider.ConfigReader;
import org.openqa.selenium.WebDriver;

public class Driver {

    private Driver() {
        // Singleton pattern(konstruktor private)
   }

   private static WebDriver driver;

    public  static WebDriver getDriver(){
        if (driver == null){
            switch (ConfigReader.getProperty("browser").toLowerCase()){
                case "chrome":
                    driver = ChromeWebDriver.loadChromeDriver();
                    break;
                case "firefox":
                    driver = FirefoxWebDriver.loadFireFoxDriver();
                    break;
                case "safari":
                    driver = SafariWebDriver.loadSafariDriver();
                default:
                    driver = ChromeWebDriver.loadChromeDriver();
            }
        }
        return  driver;
    }

    public static void closeDriver(){
        try{
            if(driver != null){
                driver.close();
                driver.quit();
                driver = null;
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
