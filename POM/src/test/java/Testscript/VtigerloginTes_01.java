package Testscript;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
//import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;
import webPages.TC1_VTigerLoginPage;

public class VtigerloginTes_01 extends SeleniumUtility{
	
	@Test
	public void VTigerLogin() {
		WebDriver driver =setUp("chrome", "https://demo.vtiger.com/vtigercrm/index.php");
		TC1_VTigerLoginPage loginmethod=new TC1_VTigerLoginPage(driver);
		loginmethod.loginOps("admin", "admin");
		Assert.assertEquals(getCurrentTitleOfApplication("Dashboard"),"Dashboard");
	}
	
	@Test
	public void closing() {
		cleanUp();
	}
	

}
