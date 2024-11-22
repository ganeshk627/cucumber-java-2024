package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
//        features = "classpath:features", // To execute all the feature files under features folder
        features = "classpath:features/regression", // To execute only login feature
        glue = "stepdefinitions", // To specify step definition files
        dryRun = true, // checks whether all the steps have step definitions

        publish = false,
        plugin = {
              "pretty", // logs the steps in the console
                "html:reports/regression-report.html",
        },


        snippets = CucumberOptions.SnippetType.CAMELCASE



)
public class RegressionRunner {

}
