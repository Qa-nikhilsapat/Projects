import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

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

public class Utility {

	public static WebDriver driver=null;
	public static Actions action=null;
	public static WebDriverWait wait;

	public WebDriver setUp(String browser, String Url) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			 driver= new ChromeDriver();
		} else if(browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}else if(browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get(Url);
		action = new Actions(driver);
		return driver;
	}
	
	public void click(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
		element.click();
	}
	
	public void typeInput(WebElement element, String input) {
		element.clear();
		element.sendKeys(input);		
	}
	
	public void copyText(WebElement element) {
		action.doubleClick().build().perform();
		element.sendKeys(Keys.chord(Keys.CONTROL, "c"));
	}
	 public void pasteText(WebElement element) {
		 element.sendKeys(Keys.chord(Keys.CONTROL,"v"));
	 }
	 
	 public void waitTillElementIsClickable(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
	 }
	 
	 public String currentWorkingDir() {
			String currentDir = System.getProperty("usesr,dir");
			return currentDir;
		}
		
	 public Properties PropertyFile(String fileName) {
		 
		 String filePath = currentWorkingDir() + fileName;
		 FileInputStream file= null;
		try {
			file = new FileInputStream(filePath);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		 Properties prop = new Properties();
		 try {
			prop.load(file);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return prop;
				 
	 }
	 
	 public String getPropertyFileValue(String fileName, String key){
		 
		Properties prop =PropertyFile(fileName);
		return prop.getProperty(key);
		
	 }
	 
	 public void takeScreenshot(String fileLocation) {
		 TakesScreenshot ts= (TakesScreenshot)driver; 
		 File screenshot =ts.getScreenshotAs(OutputType.FILE);
		 
		 try {
			FileUtils.copyFile(screenshot, new File(fileLocation));
		} catch (IOException e) {
			e.printStackTrace();
		}
	 }
		 
	 public void performDragAndDrop(WebElement src, WebElement target) {
		 action.moveToElement(src).dragAndDrop(src, target).build().perform();
	 }
	 
	 public void performDragDropWithCordinates (WebElement src,int x, int y) {
		 action.moveToElement(src).dragAndDropBy(src, x, y).build().perform();
	 }
	 
	 public void rightClick(WebElement element) {
		 action.moveToElement(element).contextClick().build().perform();
	 }
	 
	 public void mouseHover(WebElement element) {
		 action.moveToElement(element).perform();
	 }
	 
	 public void mouseHoverWithCordinates(WebElement element, int x, int y) {
		action.moveToElement(element, x, y).perform(); 
	 }
	 public void doudbleClick(WebElement element) {
		 action.moveToElement(element).doubleClick().perform();
	 }
	 
	 public void switchToFrameByIndex(int index) {
		 driver.switchTo().frame(index);
	 }
	 
	 public void swtichToFrameByName(String name) {
		 driver.switchTo().frame(name);
	 }
	 
	 public void SwitchToFrameByElement(WebElement element) {
		 driver.switchTo().frame(element);
	 }
	 
	 public void SwitchBackToMainPage() {
		 driver.switchTo().defaultContent();
	 }
	 
	 public WebElement activeElement() {
		 return driver.switchTo().activeElement();
	 }
	 
	 public String getPageTitle() {
		 return driver.getTitle();
	 }
	 
	 public String getPageURl() {
		 return driver.getCurrentUrl();
	 }
	 
//	 public String innerText(WebElement element) {
//		 return ;
//	 }
	 
	 public boolean isElementVisible(WebElement element) {
		 return element.isDisplayed();
	 }
	 
	 public boolean isElementSelected(WebElement element) {
		 return element.isSelected();
	 }
	 
	 public void dropdownWiwthVisibleText(WebElement element, String text) {
		 Select select =new Select(element);
		 select.selectByVisibleText(text);
	 }
	 
	 public List<WebElement> dropDownList(WebElement element) {
		 Select select =new Select(element);
		 return select.getOptions();
	 }
//	 
	 public void elementDisplay(WebElement element) {
		 wait.until(ExpectedConditions.visibilityOf(element));
	 }
	 
	 public void close() {
		 driver.close();
	 }
	 
	 
	 
}
