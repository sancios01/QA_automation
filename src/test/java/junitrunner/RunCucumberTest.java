package junitrunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/featureszap",
        plugin = {
                "json:target/cucumber-report.json",
                "de.monochromata.cucumber.report.PrettyReports:target/cucumber"
        },
        glue = {"stepdefs"},
                "com.endava.qa_automation.step"},
        tags = {"@Run"},
        stepNotifications = true
)
public class RunCucumberTest {


}


