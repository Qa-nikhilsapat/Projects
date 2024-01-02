package Xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Amazon_paren_child {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", ".\\Executibles\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.xpath("//*[text()='Mobiles']")).click();//mobile
		driver.findElement(By.cssSelector(".a-unordered-list>*:nth-child(6)>span>a>span")).click();//smart phones
		System.out.println(driver.findElement(By.xpath("//span[contains(text(),'Redmi 9 Activ')]")).getText());
   
	}

}
