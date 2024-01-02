package Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart_order {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Executibles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//body")).sendKeys(Keys.ESCAPE);
		
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//a[text()='Login']"))).perform();
				
		driver.findElement(By.cssSelector(".pO9syL._1s9xSv>*:nth-child(1)")).click();

	}

}
