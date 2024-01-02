package Keyboard_Mouse_DragDrop;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class assignment_Flipkart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Executibles/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//body")).sendKeys(Keys.ESCAPE);
		Actions act =new Actions(driver);
		
		List<WebElement>menu =driver.findElements(By.cssSelector(".InyRMC._3Il5oO ._37M3Pb>div"));
		for(WebElement i:menu) {
			act.moveToElement(i).build().perform();
			System.out.println(i.getText());
		}
		driver.close();

	}

}
