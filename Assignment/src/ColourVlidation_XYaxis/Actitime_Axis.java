package ColourVlidation_XYaxis;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime_Axis {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Executibles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(22,TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com");
		
		driver.findElement(By.id("loginButton")).click();
		WebElement errormsg = driver.findElement(By.className("errormsg"));
		System.out.println(errormsg.getText());
		System.out.println(errormsg.getCssValue("color"));

	    Point location=errormsg.getLocation();
	    int y=location.getY();
	    System.out.println("error axis: "+y);
	    
	    int user=driver.findElement(By.cssSelector(".textField")).getLocation().getY();
	    System.out.println("username axis"+user);
	    System.out.println(y<user);
	}

}
