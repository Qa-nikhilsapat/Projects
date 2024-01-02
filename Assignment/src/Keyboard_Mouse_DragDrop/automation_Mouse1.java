package Keyboard_Mouse_DragDrop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class automation_Mouse1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Executibles/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		WebElement name=driver.findElement(By.xpath("//*[@placeholder='First Name']"));
		name.sendKeys("nikhil");
		
    Actions act=new Actions(driver);
		act.moveToElement(name).doubleClick().keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		
		WebElement last =driver.findElement(By.cssSelector("[placeholder='Last Name']"));
		 act.moveToElement(last).click().keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();

	}

}
