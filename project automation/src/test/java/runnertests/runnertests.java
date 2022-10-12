package runnertests;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (
        features = "src/main/resources/features",
        glue = {"stepdefinitions"},
        monochrome = true,
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        dryRun = false,
        tags = "@Smoke"
)
public class testRunner extends AbstractTestNGCucumberTests
{

}
