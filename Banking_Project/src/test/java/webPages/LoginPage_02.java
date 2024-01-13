package webPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_02 {
	WebDriver driver;
	public void LoginPage_02(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="userSelect")
	WebElement Namesdropdown;
	
	@FindBy(css="[class$='btn-default']")
	WebElement LoginLogo;
	
	@FindBy(className="btn home")
	WebElement HomeLogo;
	
	@FindBy(xpath ="//div[*[text()='XYZ Bank']]//strong")
	WebElement BankName;

}
