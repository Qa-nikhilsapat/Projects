package webPages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class TC3_VTigerLeadPage extends SeleniumUtility{
	
		WebDriver driver;
		public TC3_VTigerLeadPage(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		@FindBy(css="button[id*='Leads']")
		private WebElement addButton;
		
		@FindBy(id="select2-chosen-2")
		private WebElement gender;
		
		@FindBy(id="select2-result-label-26")
		private WebElement genderselection;
		
		@FindBy(css="[name='firstname']")
		private WebElement name;
		
		@FindBy(css="[name='lastname']")
		private WebElement lastname;
		
		@FindBy(id="select2-chosen-6")
		private WebElement industry;
		
		@FindBy(id="s2id_autogen6_search")
		private WebElement industryselection;
		
		@FindBy(xpath="//*[text()='Save']")
		private WebElement save;
		
		@FindBy(xpath="//h4[contains(text(),'Leads')]")
		private WebElement leadHeaderLink;
		
		public void leadcreation(String firstname,String surname,String Banking) {
			clickOnElement(addButton);
			clickOnElement(gender);
			clickOnElement(genderselection);
			typeInput(name, firstname);
			typeInput(lastname, surname);
			clickOnElement(industry);
			typeInput(industryselection, Banking);
			industryselection.sendKeys(Keys.ENTER);
			clickOnElement(save);
			clickOnElement(leadHeaderLink);
		}	
}
