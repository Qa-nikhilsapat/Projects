package webPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_01 {
	WebDriver driver;
	public void HomePage_01(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="(//button[contains(@class,'btn-primary')])[1]")
	WebElement  customerLogin;
	
	@FindBy(css=".ng-scope .padT20>div:last-child>button")
	WebElement BankManagerLogin;
	
	@FindBy(className="btn home")
	WebElement HomeLogo;
	
	@FindBy(xpath ="//div[*[text()='XYZ Bank']]//strong")
	WebElement BankName;

	

}
