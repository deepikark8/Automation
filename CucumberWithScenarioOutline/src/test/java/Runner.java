import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="/Users/rahade/InterviewPreparation/Cucumber/login.feature",
glue={"com.training.steps"},
plugin={"pretty","html:target/cucumber-reports/cucumber.html","json:target/cucumber-reports/cucumber.json"},
tags = " @tag1"
	
		)

public class Runner {
	
}
