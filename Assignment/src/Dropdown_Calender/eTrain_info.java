package Dropdown_Calender;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class eTrain_info {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Executibles\\Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://etrain.info/in");
		WebDriverWait wait=new WebDriverWait(driver, 10);
		
		driver.findElement(By.cssSelector("#tbsfi1")).sendKeys("pune");//from
		driver.findElement(By.cssSelector("#suggest_row1>a")).click();
		driver.findElement(By.cssSelector("#tbsfi3")).sendKeys("mumbai");//to
		driver.findElement(By.cssSelector("#et_autocomplete>*:nth-child(3) .icon-train-tunneled")).click();
		driver.findElement(By.cssSelector("#tbsfi4")).click();
		driver.findElement(By.cssSelector("input.nav")).click();//nxt month button
		driver.findElement(By.cssSelector(".dptbl.noinnerborder>tbody>*:nth-child(4)>*:nth-child(3)>input")).click();
		
		WebElement dropdown= driver.findElement(By.cssSelector("#tbsfi5"));// quota dropdown
		Select sel= new Select(dropdown);
		System.out.println(sel.isMultiple());
		List<WebElement> quota=sel.getOptions();
//		System.out.println("quota : "+quota.size());
//		
//		for(int i=0;i<quota.size();i++) {
//			System.out.println(quota.get(i).getText());
//		}
		sel.selectByValue("TQ");
		driver.findElement(By.id("tbssbmtbtn")).click();//get train
		List<WebElement> train= driver.findElements(By.cssSelector(".nolrborder.bx1_brm>tbody>tr> .wd55>a"));//train number
		List<WebElement> name =driver.findElements(By.cssSelector(".nolrborder.bx1_brm>tbody>tr> .wd282.left.rel>a"));//train name
		System.out.println("trains : "+train.size()+" "+name.size());
		
		for(int i=0; i<train.size();i++) {
			System.out.println(train.get(i).getText()+" "+name.get(i).getText());
		}
	}

}
