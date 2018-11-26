package com.desktopprototype.framework.steps;

import com.desktopprototype.framework.base.Base;
import com.desktopprototype.framework.config.Settings;
import com.desktopprototype.framework.pages.HomePage;
import com.desktopprototype.framework.pages.LoginPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.util.List;

public class LoginSteps extends Base{

    @Given("^I see application opened$")
    public void iSeeApplicationOpened() throws Throwable {
        CurrentPage = GetInstance(HomePage.class);
        Assert.assertTrue("The homepage is not loaded", CurrentPage.As(HomePage.class).IsLogin());
    }


    @When("^I click login link$")
    public void iClickLoginLink() throws Throwable {
        CurrentPage = CurrentPage.As(HomePage.class).ClickLogin();
    }

    @And("^I enter UserName and Password$")
    public void iEnterUserNameAndPassword(DataTable data) throws Throwable {
        List<List<String >> table = data.raw();
        CurrentPage.As(LoginPage.class).Login(table.get(1).get(0), table.get(1).get(1));
        Settings.Logs.Write("Populate username and password");
    }

    @Then("^I click login button$")
    public void iClickLoginButton() throws Throwable {
        CurrentPage = CurrentPage.As(LoginPage.class).ClickLogin();
        Settings.Logs.Write("Click login");

    }

    @And("^I should see the username with hello$")
    public void iShouldSeeTheUsernameWithHello() throws Throwable {
        Assert.assertEquals("***The user is not admin***", "Hello admin!", CurrentPage.As(HomePage.class).GetLoggedInUser());
        Settings.Logs.Write("Asserts Hello World");
    }
}
