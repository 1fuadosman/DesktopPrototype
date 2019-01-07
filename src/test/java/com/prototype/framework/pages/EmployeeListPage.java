package com.prototype.framework.pages;

import com.prototype.framework.base.BasePage;
import com.prototype.framework.base.DriverContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class EmployeeListPage extends BasePage {

    public EmployeeListPage() { }

    @FindBy(how = How.LINK_TEXT, using = "Create New")
    public WebElement lnkCreateNew;

    public EmployeeCreatePage ClickEmployeeList() {
        DriverContext.waitForElementClickable(lnkCreateNew);
        lnkCreateNew.click();
        return GetInstance(EmployeeCreatePage.class);
    }

}
