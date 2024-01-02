package webPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class TC5_Contact extends SeleniumUtility{
	WebDriver driver;
	public TC5_Contact(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//span[@class='app-icon fa fa-bars'])[1]")
	private WebElement menu;
	
	@FindBy(id="MARKETING_modules_dropdownMenu")
	private WebElement marketing;
	
	@FindBy(xpath="//*[text()=' Contacts']")
	private WebElement contact;
	
	public void clickOnContact() {
		clickOnElement(menu);
		clickOnElement(marketing);
		clickOnElement(contact);
	}

}
