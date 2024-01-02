package Dropdown_Calender;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class customDropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Executibles\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://thompsonsj.com/bootstrap-select-dropdown/");
		WebDriverWait wait=new WebDriverWait(driver, 10);
		
		WebElement drop= driver.findElement(By.cssSelector("#bsd3-button"));
		drop.click();
		wait.until(ExpectedConditions.elementToBeClickable(drop));
		//wait.until(ExpectedConditions.elementToBeClickable(drop));
		List<WebElement> list =driver.findElements(By.cssSelector(".dropdown-menu-right.show>div>a"));
		
		System.out.println(list.size());
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getText());
		}

	}

}
