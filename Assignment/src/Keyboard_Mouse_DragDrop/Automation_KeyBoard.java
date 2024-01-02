package Keyboard_Mouse_DragDrop;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Automation_KeyBoard {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Executibles/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		WebDriverWait wait=new WebDriverWait(driver, 30);
		
		WebElement name=driver.findElement(By.xpath("//*[@placeholder='First Name']"));
		 name.sendKeys("nikhil",(Keys.chord(Keys.CONTROL,"a")));//select text
		 name.sendKeys((Keys.chord(Keys.CONTROL,"c")));//copy
		    Point location =name.getLocation();
		System.out.println("x: "+location.getX()+"\nV: "+location.getY());
		
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[placeholder='Last Name']")));
		WebElement last=driver.findElement(By.cssSelector("[placeholder='Last Name']"));
		 last.sendKeys(Keys.chord(Keys.CONTROL,"v"));//paste text
    Point loc=last.getLocation();
		System.out.println("x: "+loc.getX()+"\nV: "+loc.getY());  
		System.out.println("comparisson: "+(location.getX()<loc.getX()));
		//gender
		WebElement gender=driver.findElement(By.xpath("//*[text()=' Male ']/input"));
		gender.click();
		System.out.println("male selected or not: "+gender.isSelected());
		//skill section
		WebElement skill=driver.findElement(By.id("Skills"));
	Select dropdown=new Select(skill);
		System.out.println("skills: "+dropdown.isMultiple());
		List<WebElement> list=dropdown.getOptions();
		
		for(WebElement i: list) {
			System.out.println(i.getText());
		}
		dropdown.selectByIndex(2);
		System.out.println("by index: "+dropdown.getFirstSelectedOption().getText());
		//bottom scrolling
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body")).sendKeys(Keys.chord(Keys.CONTROL,Keys.END));
		//gender.sendKeys(Keys.chord(Keys.CONTROL,Keys.PAGE_DOWN));
		//submit button
		Thread.sleep(2000);
		WebElement submit=driver.findElement(By.id("submitbtn"));
		//String font=submit.getCssValue("font-size");
		System.out.println("fontsize"+submit.getCssValue("font-size"));
//		String font=submit.getCssValue("font-size");
//		System.out.println(font);
		submit.click();
		
		
		
		
		

	}

	private static Select Select(WebElement skill) {
		// TODO Auto-generated method stub
		return null;
	}

}
