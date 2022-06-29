package com.cydeo.library.pages;

import com.cydeo.library.utulities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "inputEmail")
    public WebElement userName;

    @FindBy(id = "inputPassword")
    public WebElement password;

@FindBy(xpath = "//button[.='Sign in']")
    public WebElement signinButton;


@FindBy (xpath = "//span[.='Books']")
    public WebElement verifyBooks;

@FindBy (xpath = "//h2[.='144']")
public WebElement userCount;

@FindBy(xpath = "//span[.='Users']")
    public WebElement usersButton;

@FindBy (xpath = "//thead/tr[@role='row']/th")
    public List<WebElement> columns;




}
