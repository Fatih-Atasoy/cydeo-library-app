package com.cydeo.library.pages;

import com.cydeo.library.utulities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CloudTablePage {
    public CloudTablePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button/span[.='New']")
    public WebElement newPerson;
    @FindBy (id = "DTE_Field_first_name")
    public WebElement firstName;
    @FindBy (id = "DTE_Field_last_name")
    public WebElement lastName;
    @FindBy (id = "DTE_Field_position")
    public WebElement position;
    @FindBy (id = "DTE_Field_office")
    public WebElement office;
    @FindBy (id = "DTE_Field_extn")
    public WebElement extension;
    @FindBy (id = "DTE_Field_start_date")
    public WebElement startDate;
    @FindBy (xpath = "//button[.='Create']")
    public WebElement createButton;

    @FindBy (xpath = "//input[@type='search']")
    public WebElement searchBox;
 @FindBy (id = "DTE_Field_salary")
    public WebElement salary;



    public  WebElement getNewPerson(String firstName, String lastName)
    {
        return Driver.getDriver().findElement(By.xpath("//td[.='"+firstName+" "+lastName+"']"));
    }





}
