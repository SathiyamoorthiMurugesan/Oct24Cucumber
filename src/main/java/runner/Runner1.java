package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = { "src/test/resources/Features/TC_Login.feature" }
//		features = { "src/test/resources/Features/TC_Login.feature", "src/test/resources/Features/TC_Home.feature" }
//		features = { "src/test/resources/Features" }
		, tags = "@TC03"
		, glue = {"stepDefinitions" }
//		, dryRun = true
		)

public class Runner1 {

}
