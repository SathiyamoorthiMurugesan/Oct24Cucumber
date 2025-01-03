package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = { "src/test/resources/Features/TC_Login.feature" }
		, tags = "@TC01"
		, glue = {"stepDefinitions" }
		)

public class Runner1 {

}
