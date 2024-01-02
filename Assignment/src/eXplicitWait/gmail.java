package eXplicitWait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class gmail {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Executibles/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/");
		WebDriverWait wait =new WebDriverWait(driver,30);
		
		driver.findElement(By.xpath("//*[@name='identifier']")).sendKeys("nikhil@gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@type='password']")));
		driver.findElement(By.xpath("//*[@type='password']")).sendKeys("123");
		driver.findElement(By.xpath("//span[text()='Next']")).click();

	}

}
