package Dropdown_Calender;

import java.io.FileInputStream;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multy {

	public static void main(String[] args) throws Exception {
		FileInputStream fis=new FileInputStream(".\\PropertyFIles\\omayo.properties");
		Properties prp=new Properties();
		prp.load(fis);
		String key=prp.getProperty("key");
		String path=prp.getProperty("path");
		String id=prp.getProperty("element");
		String url=prp.getProperty("url");
				
		System.setProperty(key, path);
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
		
		WebElement loc=driver.findElement(By.id(id));
		Select car=new Select(loc);
		System.out.println(car.isMultiple());
		
		List<WebElement> drop=car.getOptions();
		System.out.println("size:"+drop.size());
		
		for(WebElement i:drop) {
			System.out.println(i.getText());
			}
		car.selectByIndex(0);
		car.selectByValue("Hyundaix");
		car.selectByVisibleText("Audi");
		
		List<WebElement> selected= car.getAllSelectedOptions();
		for(WebElement l: selected) {
			System.out.println(l.getText());
		}
		car.deselectAll();
		driver.close();

	}

}
