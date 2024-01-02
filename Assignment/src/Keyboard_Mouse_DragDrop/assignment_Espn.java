package Keyboard_Mouse_DragDrop;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class assignment_Espn {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Executibles/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.espncricinfo.com/");
		
		try {//popup
			driver.findElement(By.id("wzrk-cancel")).click();//popup
		}catch(NoSuchElementException i){
			}
		Actions act = new Actions(driver);
		
		List<WebElement> menu = driver.findElements(By.xpath("//*[@class='ds-bg-fill-navbar']//div[2]/div[1]/div"));
		
		for(WebElement i: menu) {
			act.moveToElement(i).build().perform();
			System.out.println(i.getText());
		}
		driver.close();
		

	}

}
