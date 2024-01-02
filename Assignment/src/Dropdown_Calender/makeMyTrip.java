package Dropdown_Calender;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class makeMyTrip {

	private static final WebDriver UntilElementIsCLickable = null;

	public static void main(String[] args) throws Exception {
		FileInputStream fis=new FileInputStream(".\\PropertyFIles\\MakeMyTrip.properties");
		Properties prp=new Properties();
		prp.load(fis);
		String key= prp.getProperty("key");
		String path=prp.getProperty("path");
		String url=prp.getProperty("url");
		System.setProperty(key, path);
		
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
//		try {
//			driver.findElement(By.cssSelector(".autopop__wrap.autopop__wrap__new")).isDisplayed();
//	    }catch(Exception i) {
//	    	
//	       }
		
		driver.findElement(By.cssSelector("li[data-cy='account']")).click();//popup
		driver.findElement(By.cssSelector("label[for='departure']")).click();
		driver.findElement(By.cssSelector(".DayPicker-Months>div:nth-of-type(2)>.DayPicker-Body>*:nth-child(2)>*:nth-child(3)>div>p")).click();
		driver.close();

	}

}
