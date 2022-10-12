package stepdefinitions;

import ages.FilterWColor;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class DEF7_FilterWColor {
    FilterWColor Filter = new FilterWColor();

    @Given("logged user navigate to the home page")
    public void navigate_to_home() {
        String url = "https://demo.nopcommerce.com/";
        Hooks.driver.navigate().to(url);
    }
    @When("user select a Apparel category then hover to Shoes subcategory")
            public void Apparel_subcategory() {
        Filter.Apparel_subcategory();
    }
    @And ("user select shoes subCategory")
    public void shoesCategory() {
            Filter.shoesCategory().click();
    }
        @Then("filter by Red color")
                public void Filter_Color() {
          Filter.Filter_Color().click();
        }

    }


