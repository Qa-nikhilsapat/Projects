package webPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class TC2_VTigerHomePage extends SeleniumUtility {
	WebDriver driver;
	public TC2_VTigerHomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(css=".app-icon.fa.fa-bars")
	private WebElement menu;
	
	@FindBy(id="MARKETING_modules_dropdownMenu")
	private WebElement marketing;
	
	@FindBy(xpath="//*[text()=' Leads']")
	private WebElement leads;
	
//	@FindBy(xpath="//*[text()=' Contacts']")
//	private WebElement contact;
	
	public void getlead() {
		clickOnElement(menu);
		clickOnElement(marketing);
		clickOnElement(leads);
		//clickOnElement(contact);
	}
	}
