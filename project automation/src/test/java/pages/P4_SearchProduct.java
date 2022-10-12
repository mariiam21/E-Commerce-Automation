package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepdefinitions.Hooks;

public class SearchProduct {

    public WebElement search()
    {
        By Search= By.id("smallsearchterms");
        WebElement search= Hooks.driver.findElement(Search);
        return search;
    }
    public WebElement search_product() {
        By SearchProduct = By.id("smallsearchterms");
        WebElement search_product = Hooks.driver.findElement(SearchProduct);
        return search_product;

    }
        public WebElement search_product()
        {
        By SearchProduct1 = By.cssSelector("button[class=\"button-1 search-box-button\"]");
        WebElement search_product= Hooks.driver.findElement(SearchProduct);
        return search_product;
    }
}
