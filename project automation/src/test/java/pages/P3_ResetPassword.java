package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import stepdefinitions.Hooks;

public class ResetPassword {

    public WebElement Forgetpass()
    {
        By Forgetpass= By.className("forgot-password");
        WebElement Forgetpass= Hooks.driver.findElement(Forgetpass);
        return Forgetpass;
    }

    public WebElement Email_details()
    {
        By EmailDetails= By.id("Email");
        WebElement Email_details= Hooks.driver.findElement(EmailDetails);
        return Email_details;
    }
    public WebElement changepassbutton()
    {
        By changePassword= By.xpath("//button[contains(@name,\"send-email\")]");
        WebElement changepassbutton= Hooks.driver.findElement(changePassword);
        return changepassbutton;
    }
}
