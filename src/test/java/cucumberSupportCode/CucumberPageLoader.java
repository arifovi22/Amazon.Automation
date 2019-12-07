package cucumberSupportCode;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import amazonPages.HomePage;

public class CucumberPageLoader {
	public CucumberPageLoader instance;
	public WebDriver driver;
public HomePage homePage;
	/*
	 * public WebDriver getDriver() { if (driver == null) {
	 * System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")
	 * +"\\BrowserFile\\chromedriver.exe"); driver = new ChromeDriver(); } return
	 * driver; }
	 */
public CucumberPageLoader getInstance() {
	if (instance == null) 
		instance = new CucumberPageLoader();
	return instance;	
	
}



	public WebDriver getDriver(String browser) { 
		if (driver == null) {
			if(System.getProperty("user.dir").contains("/users")) {
				if(browser.contains("chrome")) {
					System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")
							+"\\BrowserFile\\chromedriver");
					driver = new ChromeDriver();
				} else if (browser.contains("firefox")) {
					System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")
							+"\\BrowserFile\\geckodriver-v0.26.0-macos.tar.gz"); 
					driver = new FirefoxDriver();
					
					} } else if
			(System.getProperty("user.dir").contains("C:")) { if
								(browser.contains("chrome")) {
				System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")
						+"\\BrowserFile\\chromedriver.exe");
				driver = new ChromeDriver();
				}else if (browser.contains("firefox")) {
							System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")
									+"\\BrowserFile\\geckodriver.exe"); 
							driver = new FirefoxDriver();
							}

							}} return driver;

	}
	

	public HomePage getHomePage() {
		if(homePage == null)
		homePage = new HomePage(driver);
		return homePage;
		
	}









}
