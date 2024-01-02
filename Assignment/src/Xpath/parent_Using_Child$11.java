package Xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class parent_Using_Child$11 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Executibles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/nokia-mobile-phones-store");
		/*
		 * flipkart->mobiles
		 * if price changes its will works still
		 * duu to parent child element
		 */
		System.out.println(driver.findElement(By.xpath("//div[div[a[@class='s1Q9rs']]]/div[3]/div/div")).getText());//nokia g21
		//System.out.println();
		

	}

}
