package stepdefinitions;

import pages.Search;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.util.ArrayList;

public class DEF4_SearchProduct {
Search search = new Search();

        @When("user clicks on search field")
        public void search()
        {
            search.search().click();
        }

        @And("user search with name of product")
    public void search_product()
        {
            search.search_product().sendKeys("Apple MacBook");
            search.search_product1().click();
        }

        @Then("user could find relative results")
    public void relative_result()
        {
            int count = Hooks.driver.findElements(By.cssSelector("h2[class=\"product-title\"]")).size();
            System.out.println(count);
            Assert.assertTrue(count>0);
            ArrayList <String>products = null;
            products = new ArrayList<String>();
            for (int x = 0 ; x < count ; x++ ){
               System.out.println(Hooks.driver.findElements(By.cssSelector("h2[class=\"product-title\"]")).get(x).getText());
                products.add(Hooks.driver.findElements(By.cssSelector("h2[class=\"product-title\"]")).get(x).getText());
               // Assert.assertTrue(Hooks.driver.findElements(By.cssSelector("h2[class=\"product-title\"]")).get(x).getText().toLowerCase().contains("Apple MacBooK"));
            }
            System.out.println(products);
        }



}

