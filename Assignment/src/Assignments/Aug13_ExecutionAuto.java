package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Aug13_ExecutionAuto {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Executibles\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demosite.executeautomation.com/Login.html");
		String ttl =driver.getTitle();
		System.out.println("Title n length -"+ttl + "."+ttl.length());
		driver.findElement(By.name("UserName")).sendKeys("execution");
		driver.findElement(By.name("Password")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[name='Login']")).click();
		Thread.sleep(3000);
		String title=driver.getTitle();
		String url =driver.getCurrentUrl();
		System.out.println("Title- "+title +" "+url);
		driver.findElement(By.cssSelector("#cssmenu>ul>li:first-child> a>span")).click();
		driver.close();
		

	}

}
