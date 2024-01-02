package Xpath;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GsmArena {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Executibles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.gsmarena.com/");
		
		List<WebElement> list=driver.findElements(By.cssSelector("div.brandmenu-v2>ul>li"));
		System.out.println("listCounT: "+list.size());
		for(int i = 0;i<list.size();i++) {
			System.out.println(list.get(i).getText());
		}
		

	
	}

}
