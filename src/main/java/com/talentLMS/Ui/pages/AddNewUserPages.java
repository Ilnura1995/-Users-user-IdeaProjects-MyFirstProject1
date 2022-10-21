package com.talentLMS.Ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddNewUserPages extends BasePage {

    @FindBy(xpath = "//input[@name='name']")
    private WebElement firstNameInputField;

    @FindBy(xpath = "//input[@name='surname']")
    private WebElement lastNameInputField;

    @FindBy(xpath = "//input[@name='email']")
    private WebElement emailInputField;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement passwordInputField;

    @FindBy(xpath = "//input[@name='login']")
    private WebElement loginInputField;

    @FindBy(xpath = "//textarea[@name='description']")
    private WebElement bioInputField;



    public AddNewUserPages inputFirstName(String firstName){
        helper.sendKeys(firstNameInputField,firstName);
        return this;
    }
    public AddNewUserPages inputLastName(String lastName){
        helper.sendKeys(lastNameInputField,lastName);
        return this;
    }
    public AddNewUserPages inputEmailAddress(String email){
        helper.sendKeys(emailInputField,email);
        return this;
    }
    public AddNewUserPages inputPassword(String password){
        helper.sendKeys(passwordInputField,password);
        return this;
    }
    public AddNewUserPages inputLogin(String login){
        helper.sendKeys(loginInputField,login);
        return this;
    }

    public AddNewUserPages inputBio(String bio){
        helper.sendKeys(bioInputField,bio);
        return this;
    }
}

