package webPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class TC4_LeadDeletion extends SeleniumUtility{
	WebDriver driver;
	public TC4_LeadDeletion(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	} 
	
	@FindBy(css=".dropdown span input")
	private WebElement selectBox;
	
	@FindBy(css="button .fa.fa-trash")
	private WebElement deletbtn;
	
	@FindBy(xpath="//*[text()='Yes']")
	private WebElement confornmPopup;
	
	@FindBy(xpath="//a[contains(text(),'Champak')]")
	private WebElement newlyCreatedLeadName;
	
	public void deletmethod() {
		clickOnElement(selectBox);
		clickOnElement(deletbtn);
		clickOnElement(confornmPopup);
	}
	public boolean checkleaddeltion() {
		return isElementExist(newlyCreatedLeadName);
		
	}

}
