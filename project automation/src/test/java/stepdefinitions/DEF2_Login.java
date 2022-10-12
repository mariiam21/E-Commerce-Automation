package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.Login;
import org.testng.Assert;

public class DEF2_Login {
    Login log = new Login();


    @Given("user navigate to log in page")
    public void navigate_login_page()
    {
        String url = "https://demo.nopcommerce.com/login?returnUrl=%2F/";
        Hooks.driver.navigate() .to(url);
    }

    @And("user click on log in link")
    public void log_in_link()
    {

              log.loginBtn().click();
    }
    @And("user fills email with valid data")
    public void Personal_Email()
    {
        log.Email().sendKeys("mariammmahran2000@gmail.com");

    }
    @And("user fills  password with valid data")
    public void Your_Password_details()

    {
        log.Password().sendKeys("P@ssw0rd");

    }

    @And("user clicks on log in button")
    public void Log_in_button()
    {
        log.SignIn().click();
    }


     @Then("user logged in successfully")
   public void successMsg () throws InterruptedException {
    Thread.sleep(2000);
         Assert.assertFalse(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/login?returnUrl=%2F/"));
}

}