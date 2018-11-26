package com.prototype.framework.steps;

import com.prototype.framework.base.Base;
import com.prototype.framework.pages.EmployeeCreatePage;
import com.prototype.framework.pages.EmployeeListPage;
import com.prototype.framework.pages.HomePage;
import com.prototype.framework.utilities.CucumberUtil;
import com.prototype.framework.utilities.EmailGeneratorUtil;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class EmployeeSteps extends Base {
    @And("^I click employeeLIst link$")
    public void iClickEmployeeLIstLink() throws Throwable {
        CurrentPage = CurrentPage.As(HomePage.class).ClickEmployeeList();
    }

    @Then("^I click create new button$")
    public void iClickCreatenewButton() throws Throwable {
        CurrentPage = CurrentPage.As(EmployeeListPage.class).ClickEmployeeList();
    }

    @And("^I enter following details$")
    public void iEnterFollowingDetails(DataTable table) throws Throwable {
       /* List<List<String >> table = data.raw();
        CurrentPage.As(EmployeeCreatePage.class).CreateEmployee(table.get(1).get(0), table.get(1).get(1), table.get(1).get(2), table.get(1).get(3), table.get(1).get(4));*/

        CucumberUtil.convertDataTableToDict(table);
        CurrentPage.As(EmployeeCreatePage.class).CreateEmployee(CucumberUtil.getCellValue("Name"), CucumberUtil.getCellValue("Salary"),
                CucumberUtil.getCellValue("DurationWorked"), CucumberUtil.getCellValue("Grade"), EmailGeneratorUtil.generateEmail());




    }

    @And("^I click create button$")
    public void iClickCreateButton() throws Throwable {
        CurrentPage = CurrentPage.As(EmployeeCreatePage.class).ClickCreate();
    }
}
