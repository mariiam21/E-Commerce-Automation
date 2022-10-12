package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepdefinitions.Hooks;

public class RegistrationPage {

    public WebElement registerLink()
    {
        By register= By.className("ico-register");
        WebElement registerLink= Hooks.driver.findElement(register);
        return registerLink;
    }
    public WebElement FirstName() {
        By FirstName = By.cssSelector("input[id^=\"FirstName\"]");
        WebElement FirstName = Hooks.driver.findElement(FirstName);
        return FirstName;
    }
    public WebElement LastName() {
        By LastName = By.cssSelector("input[id^=\"LastName\"]");
        WebElement LastName = Hooks.driver.findElement(LastName);
        return LastName;
    }
    public WebElement Email() {
        By email = By.name("Email");
        WebElement Email = Hooks.driver.findElement(email);
        return Email;
    }
        public WebElement Password() {
        By password = By.id("Password");
        WebElement Password = Hooks.driver.findElement(password);
        return Password;

    }
    public WebElement ConfirmPass() {
        By password = By.id("ConfirmPassword");
        WebElement ConfirmPass = Hooks.driver.findElement(password);
        return ConfirmPass;
    }
    public  WebElement RegisterButton()
    {
        By register1 = By.xpath("//button[contains(@name,\"register-butt\")]");
        WebElement RegisterButton = Hooks.driver.findElement(register1);
        return RegisterButton;
    }
}