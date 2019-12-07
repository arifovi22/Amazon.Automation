package cucumberSupportCode;




import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class CucumberHooks {
	CucumberPageLoader instance;


	WebDriver driver; 


	// Constructor 
	public CucumberHooks(CucumberPageLoader instance) {
		this.instance = instance; 
	}

	@Before
	public void getDriver() {
		instance.getDriver("chrome");
		instance.driver.get("https://www.amazon.com/");
	}

	@After
	public void closeDriver() {
		instance.driver.close();
	}





}
