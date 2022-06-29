package com.cydeo.library.step_definitions;

import com.cydeo.library.pages.LoginPage;
import com.cydeo.library.utulities.ConfigurationReader;
import com.cydeo.library.utulities.Driver;
import com.sun.jdi.request.ExceptionRequest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class login_StepDefinition {
LoginPage loginPage = new LoginPage();
WebDriverWait wait =new WebDriverWait(Driver.getDriver(),10);
    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("loginUrl"));
        Assert.assertTrue(Driver.getDriver().getTitle().equals(ConfigurationReader.getProperty("loginTitle")));
     }
    @When("user enters librarian username")
    public void user_enters_librarian_username() {
        loginPage.userName.sendKeys(ConfigurationReader.getProperty("librarianUserName"));
    }
    @When("user enters librarian password")
    public void user_enters_librarian_password() {
        loginPage.password.sendKeys(ConfigurationReader.getProperty("librarianPassword"));
        loginPage.signinButton.click();
    }
    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {
        wait.until(ExpectedConditions.titleIs(ConfigurationReader.getProperty("dashboardTitle")));
        Assert.assertTrue(Driver.getDriver().getTitle().equals(ConfigurationReader.getProperty("dashboardTitle")));
    }



    @When("user enters student username")
    public void user_enters_student_username() {
        loginPage.userName.sendKeys(ConfigurationReader.getProperty("studentUserName"));
      }
    @When("user enters student password")
    public void user_enters_student_password() {
        loginPage.password.sendKeys(ConfigurationReader.getProperty("studentPassword"));
        loginPage.signinButton.click();
        }





    @When("I enter password {string}")
    public void ı_enter_password(String string) {
        loginPage.password.sendKeys(string);
    }
    @When("there should be {int} users")
    public void there_should_be_users(Integer int1) {
        //System.out.println(Integer.parseInt(loginPage.userCount.getText())+1);
       Assert.assertTrue(Integer.parseInt(loginPage.userCount.getText())==int1);
    }
    @When("I enter username {string}")
    public void ı_enter_username(String string) {
        loginPage.userName.sendKeys(string);
    }

    @When("click the sign in button")
    public void click_the_sign_in_button() {
        loginPage.signinButton.click();
      }
    @Then("books should be displayed")
    public void books_should_be_displayed() {
        wait.until(ExpectedConditions.titleIs(ConfigurationReader.getProperty("dashboardTitle")));
        Assert.assertTrue(loginPage.verifyBooks.isDisplayed());
    }

    @Given("I am on the login page")
    public void ı_am_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("loginUrl"));
        Assert.assertTrue(Driver.getDriver().getTitle().equals(ConfigurationReader.getProperty("loginTitle")));
    }
    @When("I login using {string} and {string}")
    public void ı_login_using_and(String string, String string2) {
        loginPage.userName.sendKeys(string);
        loginPage.password.sendKeys(string2+ Keys.ENTER);

    }
    @Then("dashboard should be displayed")
    public void dashboard_should_be_displayed() {
        wait.until(ExpectedConditions.titleIs(ConfigurationReader.getProperty("dashboardTitle")));
        Assert.assertTrue(Driver.getDriver().getTitle().equals(ConfigurationReader.getProperty("dashboardTitle")));
    }

    @When("I go to Users page,")
    public void ıGoToUsersPage() {
loginPage.usersButton.click();
    }



    @Then("table should have following columns")
    public void tableShouldHaveFollowingColumns(List<String> colmns) {

       List<String> result =new ArrayList<>();
        for (WebElement column : loginPage.columns) {
          result.add(column.getText());
        }
        Assert.assertEquals(colmns,result);
    }

    @Then("account holder name should be {string}")
    public void accountHolderNameShouldBe(String arg0) {

    }




}




