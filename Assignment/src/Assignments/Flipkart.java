package Assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Executibles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		try {
			driver.findElement(By.className("._2QfC02 ._2KpZ6l._2doB4z")).click();
		}catch(NoSuchElementException i ) {
			
		}
		List<WebElement> opt=driver.findElements(By.className("xtXmba"));
		System.out.println("menu count- "+opt.size());
		
		for(int i=0;i<opt.size();i++) {
			System.out.println(opt.get(i).getText());
		}
		driver.close();
		
				
	}

}
