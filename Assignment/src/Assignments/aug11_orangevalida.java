package Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class aug11_orangevalida {
	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", ".\\Executibles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		WebElement user=driver.findElement(By.name("username"));
		user.sendKeys("Admin");
		user.click();
		
		WebElement pass=driver.findElement(By.className("oxd-input--active"));
		pass.sendKeys("admin123");
		pass.click();
		
		WebElement forget =driver.findElement(By.className("orangehrm-login-forgot-header"));
		System.out.println("forget text "+forget.getText());
		WebElement login=driver.findElement(By.className("orangehrm-login-button"));
	    login.click();
		String url =driver.getCurrentUrl();
		System.out.println(url.equals("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index"));
		driver.findElement(By.className("oxd-userdropdown-name")).click();
		driver.findElement(By.linkText("Logout")).click();
	}
}
