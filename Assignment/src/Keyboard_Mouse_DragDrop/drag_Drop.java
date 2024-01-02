package Keyboard_Mouse_DragDrop;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drag_Drop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Executibles/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
		WebElement frame =driver.findElement(By.cssSelector(".demo-frame.lazyloaded"));
		driver.switchTo().frame(frame);
		
		List<WebElement> source = driver.findElements(By.cssSelector("ul#gallery>li"));
		
		WebElement target = driver.findElement(By.xpath("//div[@id='trash']"));
		
		Actions act =new Actions (driver);
		
//		act.dragAndDrop(source.get(0), target).build().perform();
//		Thread.sleep(1000);
//		act.dragAndDrop(source.get(1), target).build().perform();
//		Thread.sleep(1000);
//		act.dragAndDrop(source.get(2), target).build().perform();
		//or
		for(int i=0;i<source.size();i++){
			act.dragAndDrop(source.get(i), target).build().perform();;
			Thread.sleep(2000);
			}
		//or
		//dragdrop(act,source.get(1),target);//method call

	}
	static void dragdrop(Actions act,WebElement src,WebElement target) throws InterruptedException {
		act.dragAndDrop(src, target).build().perform();
		Thread.sleep(2000);
	}

}
