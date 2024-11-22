package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
//        features = "classpath:features", // To execute all the feature files under features folder
        features = "classpath:features/login.feature", // To execute only login feature
        glue = "stepdefinitions", // To specify step definition files
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class TestRunner {

}
