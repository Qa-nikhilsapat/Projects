package properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class acti_properties {
	public static void main(String[] args) throws IOException {
		
	
		FileInputStream fis= new FileInputStream(".\\PropertyFIles\\ActiTime.properties");
		Properties prp = new Properties();
		prp.load(fis);
		
		String driverkey=prp.getProperty("driverkey");
		String path=prp.getProperty("path");
		String url=prp.getProperty("url");
		String username=prp.getProperty("username");
		String pwd=prp.getProperty("pwd");
		
		System.setProperty(driverkey,path);
		WebDriver driver= new ChromeDriver();
		driver.get(url);
		
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(pwd);
		driver.findElement(By.id("loginButton")).click();
		
		driver.findElement(By.id("logoutLink")).click();
		driver.close();

		
	}
}
