package com.talentLMS.Ui.pages;

import com.talentLMS.Ui.dataProvider.ConfigReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(xpath = "//input[@name='login']")
    public WebElement userNameOrEmailInput;

    @FindBy(xpath = "//input[@name='password']")
    public  WebElement passwordInput;

    @FindBy(xpath = "//input[@name='submit']")
    public WebElement loginButton;

    @FindBy(xpath = "(//a[@href=\"https://ilnura.talentlms.com/user/create\"])[2]")
    private WebElement addNewUserButton;

    public LoginPage login(String url){
        driver.get(url);
        inputUserNameOrEmail(ConfigReader.getProperty("userName"))
                .inputPassword(ConfigReader.getProperty("password"))
                .clickLoginButton();
        return this;
    }

    public LoginPage inputUserNameOrEmail(String usernameOrEmail){
        helper.sendKeys(userNameOrEmailInput,usernameOrEmail);
        return this;
    }

    public LoginPage inputPassword(String password){
        helper.sendKeys(passwordInput,password);
        return this;
    }

    public  LoginPage clickLoginButton(){
        helper.click(loginButton);
        return this;
    }

    public LoginPage goToAddNewUserPage(){
        helper.click(addNewUserButton);
        return this;
    }
}
