package StepDefinitions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/",
//glue="packagename"
plugin="json:target\\jsonreport.json")
public class CucumberRunner {
	

}
