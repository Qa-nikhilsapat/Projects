package testScripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class All {
	static Select select;
	public static void main(String[] args) throws FileNotFoundException {

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("(//button[contains(@class,'btn-primary')])[1]")).click();
		wait.until(ExpectedConditions.urlContains("customer"));
		
		WebElement skill=driver.findElement(By.id("userSelect"));
		
		select=new Select(skill);
		List<WebElement> names=select.getOptions();
		 select.selectByVisibleText("Harry Potter");
		//System.out.println(select.getOptions().size());
//		for( int i=0;i<names.size();i++) {
//			System.out.println(names.get(i).getText());
//		}
		 
		WebElement login = driver.findElement(By.xpath("//*[text()='Login']"));
		wait.until(ExpectedConditions.visibilityOf(login)).click();
		
		select=new Select(driver.findElement(By.id("accountSelect")));
		List<WebElement> dropdown= select.getOptions();
		select.selectByIndex(2);
		
		driver.findElement(By.xpath("//*[@class='center'][2]//button[2]")).click();
		
		//driver.findElement(By.cssSelector(".form-group>input")).sendKeys("10000",Keys.ENTER);
		WebElement deposit = driver.findElement(By.cssSelector(".form-group>input"));
		
		FileInputStream file= new FileInputStream(".\\src\\test\\resources\\Property.properties");
		
		for(int i=0;i<=3;i++) {
			deposit.sendKeys();
		}
		
		WebElement Expected =driver.findElement(By.xpath("//*[text()='Deposit Successful']"));
		Assert.assertEquals(Expected.getText(),"Deposit Successful");
		
		
		
		 
		driver.close();
		
		
		
	}
}
