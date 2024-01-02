package JSexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class JS_1 extends SeleniumUtility {
	@Test
	public void TC1() {
	WebDriver driver=setUp("chrome", "https://demo.vtiger.com/vtigercrm/index.php");
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("document.getElementsByClassName('button buttonBlue')[0].click();");
	
	}
	@Test 
	public void TC2() {
		WebDriver driver=setUp("chrome", "https://demo.vtiger.com/vtigercrm/index.php");
		WebElement element=driver.findElement(By.cssSelector(".button.buttonBlue"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].click();",element);
		 
	}
}
