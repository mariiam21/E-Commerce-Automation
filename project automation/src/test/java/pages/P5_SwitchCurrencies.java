package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import stepdefinitions.Hooks;

public class SwitchCurrencies{

    public WebElement selectEuro()
    {
        By Euro= By.id("cusCurrency");
        WebElement selectEuro= Hooks.driver.findElement(Euro);
        Select selectObj = new Select(selectEuro);
        selectObject.selectByVisibleText("Euro");
        return selectEuro;
    }


    public WebElement sselectUS()
    {
        By US= By.id("custCurrency");
        WebElement selectUS= Hooks.driver.findElement(US);
        Select selectObj2 = new Select(selectUS);
        selectObj2.selectByVisibleText("US ");
        return selectUS;
    }


}
