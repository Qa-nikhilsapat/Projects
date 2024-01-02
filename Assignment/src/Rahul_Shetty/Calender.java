package Rahul_Shetty;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import Keyboard_Mouse_DragDrop.drag_Drop;

public class Calender {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Executibles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		driver.get("https://www.path2usa.com/travel-companion/");
//		Actions act =new Actions(driver);
//		WebElement body =driver.findElement(By.xpath("//body"));
//		act.dragAndDropBy(body, 0, 450).build().perform();
		JavascriptExecutor js= (JavascriptExecutor)driver;	
		js.executeScript("scrollBy(0,900)");
		Thread.sleep(1000);
		//js.executeScript("document.getElementById('form-field-travel_comp_date').click()");
		driver.findElement(By.xpath("//*[@id='form-field-travel_comp_date']")).click();;
				
//		boolean ContainMonth =driver.findElement(By.cssSelector("[class='cur-month")).getText().contains("April");
		
		while(!driver.findElement(By.cssSelector("[class='cur-month")).getText().contains("April")) {
			//driver.findElement(By.cssSelector("[class='numInput cur-year']")).getText().contains("2023");
			driver.findElement(By.cssSelector("[class='flatpickr-next-month'] svg")).click();
			
		}
	
		List<WebElement> days=driver.findElements(By.cssSelector(".flatpickr-day"));
		for(int i=0;i<days.size();i++) {
			String text=driver.findElements(By.cssSelector(".flatpickr-day")).get(i).getText();
			if(text.equalsIgnoreCase("25")) {
				driver.findElements(By.cssSelector(".flatpickr-day")).get(i).click();
				break;
			}
		}
	}

}
