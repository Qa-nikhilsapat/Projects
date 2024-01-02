package Keyboard_Mouse_DragDrop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assidnment_DragDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Executibles/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/drag_and_drop");
		
		WebElement drag = driver.findElement(By.id("column-a"));
		WebElement drop = driver.findElement(By.id("column-b"));
		
		Actions act =new Actions(driver);
		act.dragAndDrop(drag, drop).build().perform();

	}

}
