package Assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cricInfo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Executibles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.espncricinfo.com/");
		String ttl = driver.getTitle();
		System.out.println(ttl);
		try {
			driver.findElement(By.id("#wzrk-cancel")).click();
		}catch(NoSuchElementException i) {
			}
		List<WebElement> list= driver.findElements(By.cssSelector(".ds-flex-1 .ds-flex.ds-flex-row"));
		System.out.println(list.size());
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getText());
		}
	}	
}
