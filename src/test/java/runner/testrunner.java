package runner;
 
import org.testng.annotations.DataProvider;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
 
//@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features",glue= {"stepdefinition","hooks"},
plugin={"pretty",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
		"html:target/cucumber-reports/dsalgo.html",
		"json:target/MyReports/report.json",
		"html:target/MyReports/report2.json",
		"junit:target/MyReports/report1.json",
		"timeline:test-output-thread/"}
//tags= "@TS_register_12"
		)

public class testrunner extends AbstractTestNGCucumberTests{
	@DataProvider(parallel=true)
	public Object[][]scenario() {
		return super.scenarios();
	}
}
