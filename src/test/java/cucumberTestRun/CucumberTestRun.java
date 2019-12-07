package cucumberTestRun;



import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		features = {"src/test/resources/allResources"}, 
		glue={"amazonPages","cucumberStepsDefinition","cucumberSupportCode"},
		plugin = {"pretty", "json:target/cucumber-reports/cucumber.json", "html:target/cucumber-reports"}, 
		monochrome=true,
		tags={"@Test1,@Test2"})
		
		

public class CucumberTestRun extends AbstractTestNGCucumberTests {
	
}
