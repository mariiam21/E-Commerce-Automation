package stepdefinitions;
import pages.Registration;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;



public class DEF1_Registration {
Registration register = new Registration();


    @And("User navigate to home page")
    public void navigate_home()
    {
        String url = "https://demo.nopcommerce.com/";
        Hooks.driver.navigate() .to(url);
    }

    @And("User click on register link")
    public void register_link()
    {

        register.register_Link().click();    }


    @And("User fills your personal details with valid data")
    public void Personal_details()
    {
        register.First_Name().sendKeys("Mariam");
        register.Last_Name().sendKeys("Mahrann");
        register.Email().sendKeys("mariammmahran2000@gmail.com");



    }
    @And("user fills your password with valid data")
    public void Your_Password_details()

    {
        register.Password().sendKeys("P@ssw0rd");
        register.Confirm_Password().sendKeys("P@ssw0rd");

    }

   @And("user clicks on register button")
           public void register_button() {
       register.RegisterBtn().click();
   }

   @Then("success message is displayed")
   public void success_Message()
   {
      // Assert.assertTrue(driver.findElement(By.partialLinkText("Your registration completed")).isDisplayed());
       Assert.assertTrue(Hooks.driver.findElement(By.cssSelector("div[class=\"result\"]")).isDisplayed());

       SoftAssert soft = new SoftAssert();
       soft.assertTrue(Hooks.driver.findElement(By.cssSelector("div[class=\"result\"]")).isDisplayed());
       soft.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/registerresult/1?returnUrl=/"));
       soft.assertTrue(Hooks.driver.findElement(By.cssSelector("a[href=\"/customer/info\"][class=\"ico-account\"]")).isDisplayed());

       soft.assertAll();

   }


}

