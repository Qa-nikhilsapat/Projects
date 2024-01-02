package Rahul_Shetty;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import Utility.SeleniumUtility;

public class RS_OptionCopyPaste {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Executibles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		String Copy = driver.findElement(By.xpath("//*[contains(text(),'Option2')]")).getText().trim();
		WebElement dropdown =driver.findElement(By.cssSelector("[id*='dropdown']"));
		Select select=new Select(dropdown);
		select.selectByVisibleText(Copy);

		driver.findElement(By.cssSelector("#name")).sendKeys(Copy);
		driver.findElement(By.xpath("//*[@class='pull-right']//following-sibling::input[3]")).click();
		String name=driver.switchTo().alert().getText();
		if(name.contains(Copy)) {
			driver.switchTo().alert().accept();
		}
		else {
			driver.switchTo().alert().dismiss();
			
		}
		

	}

}
