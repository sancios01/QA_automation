package junitrunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/**
 * Feature tag repesents the feature file path
 * de.monochromata.cucumber.report.PrettyReports:target/cucumbe -- this is for reporting.
 *
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "json:target/cucumber-report.json",
                "de.monochromata.cucumber.report.PrettyReports:target/cucumber"
        },
        features = {"src/test/resources/features"},
        glue = {"stepdefs"},
        strict = false,
        tags ={"@regression"}

)


public class RunCucumberTest {

}
