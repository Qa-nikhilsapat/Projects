package Xpath;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pagination {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Executibles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		driver.get("https://www.gsmarena.com/");
		
		List<WebElement> pgn=driver.findElements(By.cssSelector(".nav-pages>a"));
		//System.out.println(pgn.size()); 
		if(pgn.size()>0) {
		for(int i=0;i<pgn.size();i++) {
		System.out.println(driver.getCurrentUrl());	
		pgn.get(i).click();
		Thread.sleep(2000); 
		pgn=driver.findElements(By.cssSelector(".nav-pages>a"));//to avoid staleElements
		}
		}else {
			System.out.println("pagination not exist");
		}
		driver.close();
		//pagination.isDisplayed();
//		if(pagination>0) {
//			driver.findElements(By.cssSelector(".review-nav>div>strong")).click();
//		}else {
//			
//		}

	}

}
