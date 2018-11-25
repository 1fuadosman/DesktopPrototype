package com.wowcher.framework.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/com/wowcher/framework/features/"}, glue = {"com/wowcher/framework/steps"}, format = {"pretty"})
public class JUnitTestRunner {

}
