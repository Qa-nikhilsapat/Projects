package Assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Aug12_Vtiger {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Executibles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		WebElement lgn=driver.findElement(By.cssSelector("input[class='used']"));//username
//		lgn.clear();
//		lgn.sendKeys("admin");
		WebElement psw=driver.findElement(By.id("password"));//password
//		psw.clear();
//		psw.sendKeys("Test@123");
		driver.findElement(By.cssSelector("[type='submit']")).click();//login
		String url=driver.getCurrentUrl();
		//Thread.sleep(3000);
	    System.out.println("URl validation "+url.equals("https://demo.vtiger.com/vtigercrm/index.php"));
	    
//	    List<WebElement> list =driver.findElements(By.cssSelector(".widgetsList>li>a"));
//	    System.out.println(list.size());
//	    for(int i=0;i<list.size();i++) {
//	    	System.out.println(list.get(i).getText());
//	    }
	    driver.findElement(By.cssSelector(".addButton.dropdown-toggle")).click();//widget
        driver.findElement(By.cssSelector("[data-name='History']")).click();//history
        driver.findElement(By.cssSelector(".addButton.dropdown-toggle")).click();//widget again
        driver.findElement(By.cssSelector("[data-name='CalendarActivities']")).click();//activity
        driver.findElement(By.cssSelector(".addButton.dropdown-toggle")).click();//widget again
        driver.findElement(By.cssSelector("[data-name='TagCloud']")).click();//tagcloud
	      
	    driver.findElement(By.cssSelector("[class='fa fa-user']")).click();
	    driver.findElement(By.linkText("Sign Out")).click();
	    driver.close();

	}

}
