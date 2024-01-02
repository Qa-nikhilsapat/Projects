package Dropdown_Calender;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multipleDropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Executibles\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.get("http://omayo.blogspot.com/");
		 
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
		 
		 WebElement select=driver.findElement(By.id("multiselect1"));
		 Select cmp =new Select(select);
		 System.out.println(cmp.isMultiple());
		 
		 List<WebElement> option=cmp.getOptions();
		 System.out.println(option.size());
		 for(int i=0;i<option.size();i++) {
			 System.out.println(i +":"+ option.get(i).getText());
		 }
		 
		 cmp.selectByIndex(0);
		 cmp.selectByValue("swiftx");
		 List<WebElement> list=cmp.getAllSelectedOptions();
		 System.out.println(list.size());
		 for(int i=0;i<list.size();i++) {
			 System.out.println(list.get(i).getText());
		 }
		 cmp.deselectByIndex(1);

	}

}
