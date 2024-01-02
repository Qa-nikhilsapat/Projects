package ColourVlidation_XYaxis;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ColourValid_Vtiger {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Executibles\\Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		
		WebElement login= driver.findElement(By.cssSelector(".button.buttonBlue"));
		String color =login.getCssValue("color");
		String font =login.getCssValue("font-size");
		System.out.println("login : "+color +" "+font);
				
		WebElement frg= driver.findElement(By.className("forgotPasswordLink"));	
		String color1= frg.getCssValue("color");
		String font1 =frg.getCssValue("font-size");
		System.out.println("forget :"+color1 +" "+font1);

	}

}
