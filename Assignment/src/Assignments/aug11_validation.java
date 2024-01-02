package Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class aug11_validation {
	
	public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", ".\\Executibles\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://demo.actitime.com");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			//Thread.sleep(3000);
			WebElement user=driver.findElement(By.id("username"));
			user.sendKeys("admin");
			System.out.println("username "+user.isDisplayed());
			System.out.println(user.isEnabled());
			System.out.println(user.getAttribute("placeholder"));
			
			WebElement pwd = driver.findElement(By.name("pwd"));
			pwd.sendKeys("manager");
			System.out.println("password "+pwd.isDisplayed());
			System.out.println(pwd.isEnabled());
			System.out.println(pwd.getAttribute("placeholder"));
			
			WebElement keeplogin =driver.findElement(By.id("keepLoggedInCheckBox"));
			System.out.println("button "+keeplogin.isSelected());
			
			WebElement login=driver.findElement(By.id("loginButton"));
			login.click();
			System.out.println(login.isEnabled());
			
			driver.findElement(By.id("logoutLink")).click();
			driver.close();
			System.out.println("check");
											
		}
}
