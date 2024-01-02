package Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Aug13_techlist {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Executibles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.techlistic.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.getTitle();
		
		driver.findElement(By.xpath("//*[@id=\"PageList2\"]/div/div[1]/div[1]/div/ul/li[1]/a")).click();
		driver.navigate().back();
		String t1=driver.getTitle();
		System.out.println("title 1-"+t1);
		driver.findElement(By.xpath("//*[@id=\"PageList2\"]/div/div[1]/div[1]/div/ul/li[2]/div/a")).click();
		driver.navigate().back();
		String t2=driver.getTitle();
		System.out.println("title 2-"+t2);
		driver.findElement(By.xpath("//*[@id=\"PageList2\"]/div/div[1]/div[1]/div/ul/li[7]/div/a")).click();
		driver.navigate().back();
		String t3=driver.getTitle();
		System.out.println("title 3-"+t3);
		

	}

}
