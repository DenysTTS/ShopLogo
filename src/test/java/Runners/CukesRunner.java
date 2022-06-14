package Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)

@CucumberOptions(plugin = {
        "html:target/cucumber-reports.html",
        "rerun:target/rerun.txt",
        "me.jvt.cucumber.report.PrettyReports:target/cucumber"
        },
        glue = "src/test/java/StepDefinitions",
        features = "src/test/resources/FeatureFiles",
        dryRun=false,
        tags = ""

)
public class CukesRunner {
}
