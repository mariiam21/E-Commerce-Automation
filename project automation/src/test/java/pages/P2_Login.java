package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepdefinitions.Hooks;

public class Login {

        public WebElement loginButton()
        {
            By login = By.className("icologin");
            WebElement loginBtn = Hooks.driver.findElement(login);
            return loginButton;
        }

        public WebElement Email()
        {
            By email = By.name("Email");
            WebElement Email = Hooks.driver.findElement(email);
            return Email;
        }
        public WebElement Password()
        {
            By password = By.id("Password");
            WebElement Password = Hooks.driver.findElement(password);
            return Password;

        }
        public  WebElement SignIn()
        {
            By sign_in = By.cssSelector("button[class=\"button-1 login-button\"]");
            WebElement SignIn = Hooks.driver.findElement(sign_in);
            return SignIn;
        }

    }

