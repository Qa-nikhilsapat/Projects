package Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Aug13_Vtiger {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\Executibles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebElement lgn=driver.findElement(By.cssSelector("input[class='used']"));//username
		lgn.clear();
		lgn.sendKeys("admin");
		WebElement psw=driver.findElement(By.id("password"));//password
		psw.clear();
		psw.sendKeys("Test@123");
		driver.findElement(By.cssSelector("[type='submit']")).click();//login
		
		driver.findElement(By.cssSelector(".addButton.dropdown-toggle")).click();//widget btn
		
		WebElement w1=driver.findElement(By.cssSelector("[data-name='History']"));
		w1.click();//history
		driver.findElement(By.cssSelector(".addButton.dropdown-toggle")).click();//widget btn
		
		WebElement w2=driver.findElement(By.cssSelector("[data-name='CalendarActivities']"));
		w2.click();
		
		WebElement hst=driver.findElement(By.id("56"));//hst sts
		//System.out.println("display hst "+hst.isDisplayed());
		WebElement actv=driver.findElement(By.id("57"));//actv sts
		System.out.println("display hst: "+hst.isDisplayed()+ "\ndisplay actv: "+actv.isDisplayed());
		
		WebElement d1=driver.findElement(By.xpath("//*[@id=\"56\"]/div[3]/div[2]/a[3]/i"));
		d1.click();//hst delet
		
		driver.findElement(By.cssSelector("[data-bb-handler='confirm']")).click();//delet
		
		WebElement d2=driver.findElement(By.xpath("//*[@id=\"57\"]/div[3]/div/a[2]/i"));
		d2.click();
		driver.findElement(By.cssSelector("[data-bb-handler='confirm']")).click();//delet
		//System.out.println("delete sts "+d1.is() + "d2 sts/n"+d2.isDisplayed());
		
		driver.findElement(By.id("appnavigator")).click();
		driver.findElement(By.id("MARKETING_modules_dropdownMenu")).click();//marketing
		driver.findElement(By.cssSelector("#mCSB_1_container>li:nth-of-type(3)>a>span:last-child")).click();;//contact
		
		driver.findElement(By.id("createFilter")).click();
		driver.findElement(By.cssSelector(".col-lg-5 .form-control")).sendKeys("Sapat");
		driver.findElement(By.id("customViewSubmit")).click();
		
		driver.findElement(By.cssSelector("[class='fa fa-user']")).click();
//	    driver.findElement(By.linkText("Sign Out")).click();
//	    driver.close();
	}

}
