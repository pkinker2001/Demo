package Runner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		dryRun = false,
		glue= {"StepDefinitions"},
		features= {"src/test/resources/Features"},
		plugin= {"pretty", "html:target/HtmlReports/Test.html",
                "json:target/JsonReports/Test.Json",
                "junit:target/JunitReports/Test.xml"},
		monochrome =true,
		tags = "@test"
)


public class RunnerTest {




}
