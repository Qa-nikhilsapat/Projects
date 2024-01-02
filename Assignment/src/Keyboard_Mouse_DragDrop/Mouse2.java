package Keyboard_Mouse_DragDrop;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Mouse2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Executibles/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/");
		//menu
		List<WebElement> menu =driver.findElements(By.cssSelector("#menu>ul>li"));
			Actions act=new Actions(driver);
			
		WebDriverWait wait=new WebDriverWait(driver,20);
		//solo option selection
		act.moveToElement(menu.get(2)).perform();
		
		for(int i=0;i<menu.size();i++) {
	  	    WebElement options = menu.get(i); 
	  	  //  wait.until(ExpectedConditions.elementToBeClickable(options));
			act.moveToElement(options).build().perform();
			options.getText();
			Thread.sleep(1500);
			
		}
		 

	}

}
