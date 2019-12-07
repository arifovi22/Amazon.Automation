package amazonPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MasterPage {
	
WebDriver driver;
	
	public MasterPage(WebDriver driver) {
		this.driver = driver; 	
	}
	
	public void getUrl(String url) {
		driver.get(url);
	}
	
	
	
	
	public void clickOnElement(String locator) {
		try {
			driver.findElement(By.xpath(locator)).click();
		} catch (Exception e) {
			try {
				driver.findElement(By.id(locator)).click();	
			} catch (Exception e2) {
				try {
					driver.findElement(By.name(locator)).click();
				} catch (Exception e3) {
				try {
					driver.findElement(By.linkText(locator)).click();
				} catch (Exception e4) {

				}	
				}
			}
		}
	}
	
	public void typeOnElement(String locator, String value) {
		try {
			driver.findElement(By.xpath(locator)).sendKeys(value);
		} catch (Exception e) {
			try {
				driver.findElement(By.id(locator)).sendKeys(value);	
			} catch (Exception e2) {
				try {
					driver.findElement(By.name(locator)).sendKeys(value);
				} catch (Exception e3) {
				try {
					driver.findElement(By.linkText(locator)).sendKeys(value);
				} catch (Exception e4) {

				}	
				}
			}
		}
	}
	

	public String getElement(String locator) {
		try {
			if (locator.contains("Xpath")) {
				return	driver.findElement(By.xpath(locator.split(":")[1])).getText();
			} else if (locator.contains("Id")) {
				return	driver.findElement(By.id(locator.split(":")[1])).getText();
			} else if (locator.contains("Name")) {
				return driver.findElement(By.name(locator.split(":")[1])).getText();
			} else if (locator.contains("CssSelector")) {
				return	driver.findElement(By.cssSelector(locator.split(":")[1])).getText();
			} 	
		} catch (Exception e) {
			return "NULL";
		}
		return "NULL";
	}

		
		
		
		
		
	}
	
	
	


