package Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Aug13_Amazon {

	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver", ".\\Executibles\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		String ttl=driver.getTitle();//title validation
		System.out.println("title-"+ttl);
		
		driver.findElement(By.cssSelector(".nav-sprite .nav-left")).click();//menu
		driver.findElement(By.cssSelector("div#hmenu-content>ul>li:nth-of-type(8) div")).click();//subMenu1 alexa
		driver.findElement(By.cssSelector("ul.hmenu-translateX>li:nth-of-type(3) a")).click();//echo4
		driver.navigate().back();
		driver.findElement(By.cssSelector(".nav-sprite .nav-left")).click();//menu
		//driver.findElement(By.cssSelector(".nav-sprite .nav-left")).click();//menu back
		driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[3]/a")).click();//new release
		driver.navigate().back();
		driver.findElement(By.cssSelector(".nav-sprite .nav-left")).click();//menu
		driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[20]/a[1]/div")).click();//SeeAll
		driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[20]/a[2]")).click();//SeeLess
		driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[30]/a")).click();//signIn
		driver.findElement(By.cssSelector("#ap_email")).isEnabled();
		driver.navigate().back();
		String ttl1=driver.getTitle();
		System.out.println("url validation- "+ttl1.equals(ttl));
		driver.navigate().forward();
		driver.close();

	}

}
