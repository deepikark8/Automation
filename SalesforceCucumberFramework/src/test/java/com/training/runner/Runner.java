package com.training.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "/Users/rahade/eclipse-workspace4/SalesforceCucumberFramework/features",
glue = {"com.training.steps"},
tags="@tag1",
plugin = {"pretty","html:target/cucumber-reports/cucumber.html","json:target/cucumber-reports/cucumber.json"}

)

public class Runner {


}
