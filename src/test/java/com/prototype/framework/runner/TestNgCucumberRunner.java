package com.prototype.framework.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.TestNGCucumberRunner;
import org.testng.annotations.Test;


@CucumberOptions(features = {"src/test/java/com/prototype/framework/features/"}, glue = {"com/prototype/framework/steps"}, format = {"pretty"})
public class TestNgCucumberRunner {

    @Test
    public void runTests() {

        new TestNGCucumberRunner(getClass()).runCukes();

    }


}
