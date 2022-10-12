package stepdefinitions;
import pages.SelectiffTags;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;


public class DEF8_SelectiffTags {
    SelectiffTags Tags = new SelectiffTags();

    @Given("user navigate to computer category page")
    public void navigate_to_home() {
        String url = "https://demo.nopcommerce.com/computers";
        Hooks.driver.navigate().to(url);
    }

    @When("user select cool from  tags")
    public void Cool_Tags() {
  Tags.Cool_Tags();
    }

    @And("user select digital from tags")

    public void Digital_Tags() {
    Tags.Digital_Tags();
    }

    @And("user select game from  tags")

    public void Game_Tags() {
        Tags.Game_Tags();
    }

    @And("user select computer from tags")
    public void Computer_Tags() {
       Tags.Computer_Tags();
    }
}
