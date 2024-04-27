package com.cts.eCuke;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@CucumberOptions(
		features = {"src/test/resources/com/cts/demo/features/"},
		//tags = {"@web","~@wip"},  
		glue = { "com.cts.demo","com.cts.util" },
		plugin = {"pretty","html:target/cucumber-html-report/","json:target/cucumber-json-report/cucumberReport.json"}
		)
@RunWith(Cucumber.class)
public class ECukeRunner{}
