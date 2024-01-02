package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class aug07_actitime {
    public static WebDriver driver=null;
	public static void setup(String browser, String url) throws InterruptedException {
		
		if(browser.equalsIgnoreCase("Chrome")){
		System.setProperty("webdriver.chrome.driver", ".\\Executibles\\chromedriver.exe");
		driver=new ChromeDriver();
		
		}else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", ".\\Executibles\\geckodriver.exe");
		driver=new FirefoxDriver();
		}
		driver.get(url);
		Thread.sleep(3000);
		String title=driver.getTitle();
		System.out.println(title);
		System.out.println(title);
		System.out.println(title);
		System.out.println(title.length());
	
		String URL=driver.getCurrentUrl();
		System.out.println(URL);
		System.out.println(URL.length());
		String sourcelength=driver.getPageSource();
		System.out.println(sourcelength.length());
				//return driver;
		
		
	}
	
	public static void main(String[] args) throws Exception  {
		setup("Chrome","https://demo.actitime.com");
		//WebDriver driver =setup("firefox","https://demo.actitime.com");
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		driver.findElement(By.linkText("Logout")).click();
		driver.close();

		
		
		

	}

}
