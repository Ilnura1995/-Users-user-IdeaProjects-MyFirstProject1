package runnerPackegs;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
            features = "src/main/resources/feature",
            glue = "steps",
            tags = "@regression",
            dryRun = false,
            monochrome = true,
            publish = true,
            plugin = {
                    "pretty",
                    "html:target/default-cucumber-reports",
                    "json:target/cucumber.json"
            }
            )
public class SmokeRunner  {
    }

