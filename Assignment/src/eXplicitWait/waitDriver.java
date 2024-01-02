package eXplicitWait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitDriver {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Executibles/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com");
		//explicit wait
		WebDriverWait wait = new WebDriverWait(driver,20);
		
		driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.name("pwd")));//wait condition
		driver.findElement(By.name("pwd")).sendKeys("manager",Keys.ENTER);
		
		driver.findElement(By.id("loginButton")).click();
		//wait for Logout link to be loaded in the page
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logoutLink")));
		System.out.println("Home page title: "+driver.getTitle());
		wait.until(ExpectedConditions.elementToBeClickable(By.className("logout")));
		driver.findElement(By.className("logout")).click();
		
		driver.close();
		

	}

}
