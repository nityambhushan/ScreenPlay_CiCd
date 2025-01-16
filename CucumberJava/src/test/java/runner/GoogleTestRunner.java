package runner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = {"src/test/resources/Features/GoogleSearch.feature"}, 
    glue = {"StepDefinitions"},
    plugin = {"pretty"}

)
public class GoogleTestRunner {
 
    
}
