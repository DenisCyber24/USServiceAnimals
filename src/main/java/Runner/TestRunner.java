package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/resources/Features", // Path to your feature files
        glue = "StepDefinitions", // Package where your step definitions are located
        dryRun = false, // Set to false to execute tests, true to check step definition mapping
        tags = "@validateRegService", // Tags to filter scenarios
        plugin = {
                "pretty", // Prints Gherkin steps in the console
                "html:target/cucumber-reports.html", // Generates HTML report
                "json:target/cucumber-reports.json", // Generates JSON report
                "rerun:target/failed.txt" // Generates a file with failed scenarios for re-running
        },
        monochrome = true // Improves console output readability
)

public class TestRunner {
}
