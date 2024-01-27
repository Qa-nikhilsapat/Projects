package testScripts;

import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import collection.Arraylist;

public class All {
	static Select select;
	public static void main(String[] args) throws FileNotFoundException, InterruptedException {

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("(//button[contains(@class,'btn-primary')])[1]")).click();
		wait.until(ExpectedConditions.urlContains("customer"));
		
		WebElement skill=driver.findElement(By.id("userSelect"));
		
		select=new Select(skill);
		//LoginUser AS Harry Potter
		List<WebElement> names=select.getOptions();
		 select.selectByVisibleText("Harry Potter");
		//System.out.println(select.getOptions().size());
//		for( int i=0;i<names.size();i++) {
//			System.out.println(names.get(i).getText());
//		}
		 //logi button
		WebElement login = driver.findElement(By.xpath("//*[text()='Login']"));
		wait.until(ExpectedConditions.visibilityOf(login)).click();
		//account Number
		select=new Select(driver.findElement(By.id("accountSelect")));
		List<WebElement> dropdown= select.getOptions();
		select.selectByIndex(2);
		//deposit Button
		driver.findElement(By.xpath("//*[@class='center'][2]//button[2]")).click();
		
		//driver.findElement(By.cssSelector(".form-group>input")).sendKeys("10000",Keys.ENTER);
		WebElement AmountDeposit = driver.findElement(By.cssSelector(".form-group>input"));
		WebElement DepositButton= driver.findElement(By.xpath("//*[@type='submit' and text()='Deposit']"));
		
		
//		FileInputStream file= new FileInputStream(".\\src\\test\\resources\\Property.properties");
//		Properties prop=new Properties();
//		prop.load(file);
//		prop.getProperty("amount1");
		
		for(int i=0;i<=3;i++) {
			AmountDeposit.sendKeys("1000");
			DepositButton.click();
		}
		WebElement Expected =driver.findElement(By.xpath("//*[text()='Deposit Successful']"));
		System.out.println("Succesfull Deposit Message"+Expected.getText());
		Assert.assertEquals(Expected.getText(),"Deposit Successful");
		//transaction button
		driver.findElement(By.xpath("//*[@class='center'][2]//button[1]")).click();
		//converting transaction values into int
		List<Integer> List = new ArrayList<Integer>();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".table-bordered>tbody>tr :nth-of-type(2)")));
		List<WebElement> transaction = driver.findElements(By.cssSelector(".table-bordered>tbody>tr :nth-of-type(2)"));
		
		int value = 0;
		int total= 4000;
		for(WebElement amounts: transaction) {
			
			  value =Integer.parseInt(amounts.getText());
			System.out.println(amounts.getText());
		}
		
		//List.addAll(value);
		System.out.println(value);
		Assert.assertTrue(total==4000);
		//Assert.assertEquals(4000, total);
		//List.add(value);
		System.out.println("end");
		Thread.sleep(4000);
		driver.close();
		 
		
		
		
		
	}
}
