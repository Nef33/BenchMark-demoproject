package com.benchmark.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "json:target/cucumber.json",
                "html:target/cucumber/report.html",
                "junit:target/junit/junit-report.xml",
                "rerun:target/rerun.txt"
        },
        features = "src/test/resources/features",
        glue = "com/benchmark/step_definitions",
        dryRun = false,
        tags ="@ui",
        publish = true //generating a report with public link
)
public class CukesRunner {}
