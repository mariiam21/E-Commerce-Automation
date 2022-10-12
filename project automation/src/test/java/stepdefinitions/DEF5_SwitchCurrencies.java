package stepdefinitions;

import pages.SwitchCurrencies;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.testng.Assert;

public class DEF5_SwitchCurrencies {
   SwitchCurrencies switchCurrencies = new SwitchCurrencies();

    @Given("user navigate to home")
    public void navigate_home()
    {
        String url = "https://demo.nopcommerce.com/";
        Hooks.driver.navigate() .to(url);
    }
@And("logged user choose Euro from dropdown menu")
        public void choose_Euro() {
    switchCurrencies.choose_Euro();
}
    @Then ("user choose Euro successfully")
public void success_Euro() {
        String ExpectedResult = "Euro";
        String ActualResult = Hooks.driver.findElement(By.cssSelector("select[onchange=\"setLocation(this.value)\"]")).getText();
        Assert.assertTrue(ActualResult.contains(ExpectedResult));
    }

    @And ("user choose US Dollar from dropdown menu")
    public void choose_US(){
        switchCurrencies.choose_US();

    }
       @Then("user choose US Dollar successfully")
               public void success_US() {
           String ExpectedResult = "US Dollar";
           String ActualResult = Hooks.driver.findElement(By.cssSelector("select[onchange=\"setLocation(this.value)\"]")).getText();
           Assert.assertTrue(ActualResult.contains(ExpectedResult));
       }

        }




