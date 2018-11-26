package com.desktopprototype.framework.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/com/desktopprototype/framework/features/"}, glue = {"com/desktopprototype/framework/steps"}, format = {"pretty"})
public class JUnitTestRunner {

}
