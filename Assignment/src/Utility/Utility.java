package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Utility {
	public static WebDriver driver=null;
	public static Actions act=null;
	public WebDriverWait wait;

	public WebDriver setup(String browser, String url) {
		if(browser.equalsIgnoreCase("chrome")){
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
		}else if(browser.equalsIgnoreCase("firefox")){
			WebDriverManager.chromedriver().setup();
			driver= new FirefoxDriver();
		}else if(browser.equalsIgnoreCase("edge")){
			WebDriverManager.chromedriver().setup();
			driver= new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
		act = new Actions(driver);
		return driver;
	}
	
	public void click(WebElement element ) {
		element.click();   	}
	
	public void input(WebElement element, String text) {
		element.clear();
		element.sendKeys(text);
	}
	
	public void doubleclick(WebElement element) {
		act.moveToElement(element).doubleClick().perform();  	}
	
	public void copyText(WebElement element) {
		act.doubleClick(element).perform();
		element.sendKeys(Keys.chord(Keys.CONTROL,"c"));	   }
	
	public void pasteText(WebElement element) {
		element.sendKeys(Keys.chord(Keys.CONTROL,"v"));  	}
	
	public void wait(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));	} 
	
	public String workingDirectory() {
		String currentDir=System.getProperty("user.dir");
		return currentDir;		}
	
	public String getValueFromPropertyFile(String filename, String key) {
		Properties prop = getPropertyFile(filename);
		return prop.getProperty(key);
		
	}

	public Properties getPropertyFile(String filename) {
		String filepath = workingDirectory() + filename;
		FileInputStream fis = null;
		try { 
			fis=new FileInputStream(filepath);
		}catch(FileNotFoundException i){
			i.printStackTrace();		}
		
		Properties prop =new Properties();
	    try {
	    	prop.load(fis);
	    }catch(IOException e) {
	    	e.printStackTrace();
	    }
		return prop;
	}
	
	public void screenshot(String filelocation) {
	TakesScreenshot ts= (TakesScreenshot) driver;
	File screenshot = ts.getScreenshotAs(OutputType.FILE);
	try {
	     FileUtils.copyFile(screenshot, new File(filelocation));
	}catch(IOException i) {
		i.printStackTrace();
	}
	}
	
	public void dragandDrop(WebElement src,WebElement target) {
		act.moveToElement(src).dragAndDrop(src, target).build().perform();	}
	
	public void mouseHover(WebElement element) {
		act.moveToElement(element).perform();	}
	
	public void mouseHoverCordinates(WebElement element,int x,int y) {
		act.moveToElement(element, x, y).perform();	}
	
	public void dropdown(WebElement element) {
		Select select =new Select(element);
		System.out.println(select.isMultiple());   }
	
	
	
	
	
	
}
