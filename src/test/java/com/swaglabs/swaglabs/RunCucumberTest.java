package com.swaglabs.swaglabs;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
        plugin = {"pretty", "html:target/cucumber"},
        glue = {"com.swaglabs.swaglabs","classpath/steps"}
       )
public class RunCucumberTest {
}
