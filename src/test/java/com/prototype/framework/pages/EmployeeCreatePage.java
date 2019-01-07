package com.prototype.framework.pages;

import com.prototype.framework.base.BasePage;
import com.prototype.framework.base.DriverContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class EmployeeCreatePage extends BasePage {

    public  EmployeeCreatePage() {}

    @FindBy(how = How.ID, using = "Name")
    public WebElement fieldName;

    @FindBy(how = How.ID, using = "Salary")
    public WebElement fieldSalary;

    @FindBy(how = How.ID, using = "DurationWorked")
    public WebElement fieldDuratinoWorked;

    @FindBy(how = How.ID, using = "Grade")
    public WebElement fieldGrade;

    @FindBy(how = How.ID, using = "Email")
    public WebElement fieldEmail;

    @FindBy(how = How.CLASS_NAME, using = "btn-default")
    private WebElement btnCreate;

    public void CreateEmployee(String name, String salary, String durationWorked, String grade,  String email) {
        DriverContext.waitForElementVisible(fieldName);
        fieldName.sendKeys(name);
        fieldSalary.sendKeys(salary);
        fieldDuratinoWorked.sendKeys(durationWorked);
        fieldGrade.sendKeys(grade);
        fieldEmail.sendKeys(email);
    }

    public EmployeeListPage ClickCreate() {
        DriverContext.waitForElementClickable(btnCreate);
        btnCreate.click();
        return GetInstance(EmployeeListPage.class);
    }









}
