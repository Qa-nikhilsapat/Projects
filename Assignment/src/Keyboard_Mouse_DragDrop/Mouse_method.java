package Keyboard_Mouse_DragDrop;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Mouse_method {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Executibles/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/");
		//menu tab
		List<WebElement> menu =driver.findElements(By.cssSelector("#menu>ul>li"));
		Actions act=new Actions(driver);
		
		//hover(act,menu);
		//solohover(act,menu.get(2));
		//doubleclick(act,menu.get(0));
		cordinateHover(act,menu.get(1),000,0);

	}
	static void hover(Actions act,List<WebElement> menu) throws InterruptedException {
		for(int i=0;i<menu.size();i++) {
			WebElement option=menu.get(i);
			act.moveToElement(option).perform();
			Thread.sleep(2000);
		}
	}
	static void solohover(Actions act, WebElement menu) {
		act.moveToElement(menu).perform();
	}
	static void doubleclick(Actions act,WebElement menu) {
		//act.contextClick(menu).build().perform();//solo
		act.moveToElement(menu).contextClick().build().perform();
		}
	static void cordinateHover(Actions act,WebElement menu,int x,int y) {
		act.moveToElement(menu, x, y).build().perform();
	}
}

