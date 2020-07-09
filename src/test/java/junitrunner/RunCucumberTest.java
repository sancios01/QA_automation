package junitrunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",
        plugin = {"html:target/cucumber-report",
                "json:target/cucumber.json"},
        glue = {"com.endava.qa_automation.stepDefinitions"},
//                "com.endava.qa_automation.step"},
//        tags = {"@Run"},
        stepNotifications = true
)
public class RunCucumberTest {


}


