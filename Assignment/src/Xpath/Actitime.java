package Xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Executibles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(22,TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		driver.findElement(By.id("container_tasks")).click();//task
		driver.findElement(By.className("addNewButton")).click();//addnew
		driver.findElement(By.cssSelector(".addNewMenu>div:nth-of-type(3)")).click();//NewTask
		//driver.findElement(By.xpath("//*[@id=\"createTasksPopup_content\"]/div[1]/div[1]/div/div[1]/div/table/tbody/tr[1]/td[1]/div/div/div[1]/div[1]")).click();
//		Thread.sleep(4000);
		driver.findElement(By.className("customerSelector")).click();
		driver.findElement(By.cssSelector(".customerSelector .searchItemList>.itemRow:nth-of-type(4)")).click();//Customer bigbang
		driver.findElement(By.cssSelector(".projectSelector.customerOrProjectSelector")).click();
    	driver.findElement(By.cssSelector(".projectSelector .searchItemList>.itemRow:nth-of-type(5)")).click();//project
		driver.findElement(By.cssSelector("div.taskTableContainer>table>tbody>tr:nth-of-type(1)>td.nameCell.first>input")).sendKeys("testing");//taskNAme
		driver.findElement(By.cssSelector(".createTasksTable>tbody>tr>td:nth-of-type(4) .x-btn-text")).click();//deadline
		
		driver.findElement(By.cssSelector("ul.x-menu-list>li>div>table>tbody>tr>td.x-date-right")).click();//nextmonth
		driver.findElement(By.cssSelector(".x-date-inner>tbody>tr:nth-of-type(2)>td:nth-of-type(2)>a>em>span")).click();//date
		//driver.findElement(By.cssSelector("ul.x-menu-list>li>div>table>tbody>tr:last-child #ext-gen134")).click();//save no need 
		//Thread.sleep(3000);
//		driver.findElement(By.cssSelector("tbody tr:nth-child(1) td:nth-child(3) input:nth-child(1)")).sendKeys("testing");//description
//		driver.findElement(By.id("scbutton")).click();//save
		driver.findElement(By.cssSelector(".addToTTCell>label .checkmark.checkMark")).click();
		driver.findElement(By.cssSelector(".commitButtonPlaceHolder .components_button_label")).click();//createtask
		driver.

	}

}
