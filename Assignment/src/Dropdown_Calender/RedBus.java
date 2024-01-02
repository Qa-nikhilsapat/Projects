package Dropdown_Calender;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Executibles\\Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.cssSelector(".fl.search-box.clearfix #src")).sendKeys("amravati");//from
		Thread.sleep(9000);
		driver.findElement(By.cssSelector(".homeSearch>*:nth-child(2)")).click();
		driver.findElement(By.cssSelector("#dest")).sendKeys("pune");//to
		driver.findElement(By.cssSelector(".homeSearch>*:nth-child(2)")).click();
		driver.findElement(By.cssSelector("#onward_cal")).click();//date
		driver.findElement(By.cssSelector(".rb-monthTable .next")).click();//next month
		driver.findElement(By.cssSelector(".rb-monthTable>tbody>*:nth-child(4)>*:nth-child(3)")).click();//date
		driver.findElement(By.id("search_btn")).click();
		driver.findElement(By.cssSelector(".dt-time-filter>*:last-child .custom-checkbox")).click();//bus time
//		Thread.sleep(9000);
//		driver.findElement(By.cssSelector("#filter-block .list-chkbox>*:nth-child(3) .custom-checkbox")).click();//bus type ac
		
		List<WebElement> list= driver.findElements(By.cssSelector("#result-section>div .travels"));
		System.out.println("Buses: "+list.size());
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getText());
			Thread.sleep(5000);
		}
		

	}

}
