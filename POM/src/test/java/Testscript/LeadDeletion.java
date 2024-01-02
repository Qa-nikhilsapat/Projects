package Testscript;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;
import webPages.TC1_VTigerLoginPage;
import webPages.TC2_VTigerHomePage;
import webPages.TC3_VTigerLeadPage;
import webPages.TC4_LeadDeletion;
import webPages.TC5_Contact;

public class LeadDeletion extends SeleniumUtility {
	
	TC1_VTigerLoginPage login=null;
	TC2_VTigerHomePage homepage=null;
	TC3_VTigerLeadPage lead=null;
	TC4_LeadDeletion delet=null;
	TC5_Contact contact=null;
	@BeforeTest
	public void precondition() {
		login=new TC1_VTigerLoginPage(driver);
		homepage=new TC2_VTigerHomePage(driver);
		lead =new TC3_VTigerLeadPage(driver);
		delet =new TC4_LeadDeletion(driver);
		contact =new TC5_Contact(driver);
	}
	@Test
	public void deletion() {
		delet.deletmethod();
		delet.checkleaddeltion();
	}
	@Test
	public void createcontact() {
		
	}
	

}
