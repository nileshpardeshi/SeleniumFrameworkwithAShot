
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

	

	@RunWith(Cucumber.class)
	@CucumberOptions(
			plugin = {"pretty"},
			glue = {"stepdefs"},//Your step definitions package.
			features = {"C:\\Users\\kam\\selenium_tryouts\\CucumberSelenium\\src\\test\\java\\GoogleSearch.feature"})
	
	public class JUnitRunner {}
