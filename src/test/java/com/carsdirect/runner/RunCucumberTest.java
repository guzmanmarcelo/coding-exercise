package com.carsdirect.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    glue = {"com.carsdirect"},
    features = {"src/test/resources/features"},
    tags = "@Exercise")
public class RunCucumberTest extends AbstractTestNGCucumberTests {
}
