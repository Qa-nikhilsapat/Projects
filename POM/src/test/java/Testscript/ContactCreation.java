package Testscript;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;
import webPages.TC1_VTigerLoginPage;
import webPages.TC2_VTigerHomePage;
import webPages.TC3_VTigerLeadPage;
import webPages.TC4_LeadDeletion;
import webPages.TC5_Contact;
import webPages.TC6_ContactCreate;

public class ContactCreation extends SeleniumUtility{
	TC1_VTigerLoginPage login=null;
	TC2_VTigerHomePage homepage=null;
	TC3_VTigerLeadPage lead=null;
	TC4_LeadDeletion delet=null;
	TC5_Contact contact=null;
	TC6_ContactCreate contactcreate=null;
	@BeforeTest
	public void precondition() {
		WebDriver driver =setUp("chrome", "https://demo.vtiger.com/vtigercrm/index.php");
		login=new TC1_VTigerLoginPage(driver);
		login.loginOps("admin", "admin");
		homepage=new TC2_VTigerHomePage(driver);
		lead =new TC3_VTigerLeadPage(driver);
    	delet =new TC4_LeadDeletion(driver);
		contact =new TC5_Contact(driver);
		contact.clickOnContact();
		contactcreate=new TC6_ContactCreate(driver);
	}
	@Test
	public void newcontact() {
		contactcreate.contactcreation("Nikhil", "sapat");
		Assert.assertTrue(contactcreate.checkContact());
	}

}
