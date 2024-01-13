package webPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserPage_03 {
	WebDriver driver;
	public void UserPage_03(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(css=".ng-scope .borderM>div .fontBig")
	WebElement Name;
	
	@FindBy(id="accountSelect")
	WebElement AccountNumberDropDown;
	
	@FindBy(xpath="(//div[@class='center']//following-sibling ::strong)[3]")
	WebElement currency;
	
	@FindBy(xpath="//*[@class='center'][2]//button[1]")
	WebElement Transaction;
	
	@FindBy(xpath="//*[@class='center'][2]//button[2]")
	WebElement Deposit;
	
	@FindBy(xpath="//*[@class='center'][2]//button[3]")
	WebElement Withdraw;
	
	@FindBy(css=".form-group>input")
	WebElement DepositAmount;
	

	@FindBy(className="btn home")
	WebElement HomeLogo;
	
	@FindBy(xpath ="//div[*[text()='XYZ Bank']]//strong")
	WebElement BankName;
	
	@FindBy(className="btn logout")
	WebElement Logout;



}
