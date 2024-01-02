package webPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class TC6_ContactCreate extends SeleniumUtility{
	WebDriver driver;
	public TC6_ContactCreate(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="Contacts_listView_basicAction_LBL_ADD_RECORD")
	private WebElement addbutton;
	
	@FindBy(id="select2-chosen-2")
	private WebElement gender;
	
	@FindBy(css=".select2-results li:nth-child(2) div")
	private WebElement genderselection;
	
	@FindBy(css="[name='firstname']")
	private WebElement name;
	
	@FindBy(css="[name='lastname']")
	private WebElement lastname;
	
	@FindBy(xpath="//i[@class='fa fa-calendar ']")
	private WebElement calender;
	
	@FindBy(css="th[class='prev']")
	private WebElement month;
	
	@FindBy(css=".datepicker-days tbody tr:nth-child(2) td:nth-child(3)")
	private WebElement date;
	
	@FindBy(xpath="//*[text()='Save']")
	private WebElement save;
	
	@FindBy(xpath="//h4[contains(text(),' Contacts ')]")
	private WebElement leadHeaderLink;
	
	@FindBy(xpath="//a[contains(text(),'sapat')]")
	private WebElement newlyCreatedcontact;
	
	public void contactcreation(String firstname,String surname) {
		clickOnElement(addbutton);
		clickOnElement(gender);
		clickOnElement(genderselection);
		typeInput(name, firstname);
		typeInput(lastname, surname);
		clickOnElement(calender);
		clickOnElement(month);
		clickOnElement(date);
		clickOnElement(save);
		clickOnElement(leadHeaderLink);
	}
	public boolean checkContact() {
		return isElementExist(newlyCreatedcontact);
		}

}
