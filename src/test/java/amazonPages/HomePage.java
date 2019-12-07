package amazonPages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;


public class HomePage extends MasterPage {
	String logoVisibility = "Xpath://div[@id='nav-logo']";
	String searchBox = "//input[@id='twotabsearchtextbox']";
	String searchBotton ="//div[@class='nav-right']//input[@class='nav-input']";
	

	public HomePage(WebDriver driver) {
		super(driver);
	}
	 
	public void logoValidate() {
	String actual= getElement(logoVisibility);
		Assert.assertEquals(actual, "Try Prime","Not Found.....");
		
	}
	
	public void typeOnSearch() {
		typeOnElement(searchBox, "pen");
	}
	
	public void clickOnSearch() {
		clickOnElement(searchBotton);
	}
	
	
	

}
