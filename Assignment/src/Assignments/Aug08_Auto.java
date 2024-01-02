package Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Aug08_Auto {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Executibles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		
		String url =driver.getCurrentUrl();
		System.out.println(url.equals("https://demo.automationtesting.in/Register.html"));
		driver.findElement(By.tagName("input")).sendKeys("nikhil");
		driver.findElement(By.name("radiooptions")).click();
		driver.findElement(By.id("checkbox1")).click();
		driver.findElement(By.id("Skills")).click();
		driver.findElement(By.id("Skills")).click();
	}

}
