package com.wowcher.framework.pages;

import com.wowcher.framework.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class EmployeeListPage extends BasePage {

    public EmployeeListPage() { }

    @FindBy(how = How.LINK_TEXT, using = "Create New")
    public WebElement lnkCreateNew;

    public EmployeeCreatePage ClickEmployeeList() {
        lnkCreateNew.click();
        return GetInstance(EmployeeCreatePage.class);
    }

}
