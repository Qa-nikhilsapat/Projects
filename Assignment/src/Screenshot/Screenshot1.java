package Screenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utility.SeleniumUtility;

public class Screenshot1 {

	public static void main(String[] args) throws InterruptedException {
		SeleniumUtility s1 = new SeleniumUtility();
		
		WebDriver driver=s1.setUp("chrome", "https://www.facebook.com/");

		driver.findElement(By.xpath("//*[@id='u_0_0_0O']")).click();
			
		 s1.takeScreenshot(".\\Screenshots\\fb.png");

	}

}
