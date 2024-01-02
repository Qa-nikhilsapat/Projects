package Testscript;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;
import webPages.TC1_VTigerLoginPage;
import webPages.TC2_VTigerHomePage;
import webPages.TC3_VTigerLeadPage;

public class VtigerLeadTest_02 extends SeleniumUtility{
	TC1_VTigerLoginPage loginpage=null;
	TC2_VTigerHomePage  homepage=null;
	TC3_VTigerLeadPage leadpage =null;
	
	@BeforeTest
	public void preconditions() {
		WebDriver driver=setUp("chrome", "https://demo.vtiger.com/vtigercrm/index.php");
		loginpage=new TC1_VTigerLoginPage(driver);
		homepage=new TC2_VTigerHomePage(driver);
		leadpage =new TC3_VTigerLeadPage(driver);
		loginpage.loginOps("admin", "admin");
		homepage.getlead();
		
	}
	@Test
	public void vtigerOPs() {
		leadpage.leadcreation("nikhil", "sapat", "Banking");
		
	}

}
