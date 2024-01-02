
package webPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.SeleniumUtility;

public class TC1_VTigerLoginPage extends SeleniumUtility {
	WebDriver driver;
	public TC1_VTigerLoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//or
//	VTigerLoginPage page=PageFactory.initElements(driver, VTigerLoginPage.class);

	@FindBy(id="username")
	private WebElement usernamefield;
	
	@FindBy(id="password")
	private WebElement passwordfield;
	
	@FindBy(className="buttonBlue")
	private WebElement loginbtn;
	
	public void loginOps(String username,String pwd) {
		typeInput(usernamefield, username);
		typeInput(passwordfield, pwd);
		clickOnElement(loginbtn);
	}
}
