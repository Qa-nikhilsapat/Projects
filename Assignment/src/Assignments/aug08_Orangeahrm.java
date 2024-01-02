package Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class aug08_Orangeahrm {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", ".\\Executibles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.className("oxd-input--active")).sendKeys("admin123");
		driver.findElement(By.className("orangehrm-login-button")).click();
		String url =driver.getCurrentUrl();
		System.out.println(url.equals("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index"));
		driver.findElement(By.className("oxd-userdropdown-name")).click();
		driver.findElement(By.linkText("Logout")).click();
		
		
		
		
		
	}

}
