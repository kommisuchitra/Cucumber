package testRunners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//RunWith(Cucumber.class)
@CucumberOptions(features="featurefiles/LoginOHRM.feature",glue="stepDefinitions",dryRun=false,plugin=
{"com.cucumber.listener.ExtentCucumberFormatter:Reports/loginOHRMresutl.html"})

public class AdminLoginTest extends AbstractTestNGCucumberTests{

}
