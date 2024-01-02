package JSexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import utilities.SeleniumUtility;

public class JS2_scrolling extends SeleniumUtility{
	@Test
	public void scrolling() throws InterruptedException {
		WebDriver driver=setUp("chrome", "https://www.flipkart.com/");
		driver.findElement(By.xpath("//body")).sendKeys(Keys.ESCAPE);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,2500)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-2500)");
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}
	
	@Test(enabled=false)
	public void fullScrolling() throws InterruptedException {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
	}

}
