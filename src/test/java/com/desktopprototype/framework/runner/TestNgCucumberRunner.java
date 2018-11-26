package com.desktopprototype.framework.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.TestNGCucumberRunner;
import org.testng.annotations.Test;


@CucumberOptions(features = {"src/test/java/com/desktopprototype/framework/features/"}, glue = {"com/desktopprototype/framework/steps"}, format = {"pretty"})
public class TestNgCucumberRunner {

    @Test
    public void runTests() {

        new TestNGCucumberRunner(getClass()).runCukes();

    }


}
