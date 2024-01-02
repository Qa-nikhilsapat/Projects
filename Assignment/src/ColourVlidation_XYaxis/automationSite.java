package ColourVlidation_XYaxis;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class automationSite {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Executibles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		WebElement name=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		int nameX =name.getLocation().getX();
		int namey =name.getLocation().getY();
		
		WebElement surname=driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		int surnameX =surname.getLocation().getX();
		int surnamey =surname.getLocation().getY();
		System.out.println("parallel or not: "+(nameX<surnameX));
		
		int address=driver.findElement(By.xpath("//*[@ng-model='Adress']")).getLocation().getY();
		System.out.println("address is below username: "+(address<namey));
		
		int mail=driver.findElement(By.xpath("//*[@*='eid']/input")).getLocation().getY();
		System.out.println("mail adress comp: "+(mail<address));
		
		WebElement gender=driver.findElement(By.xpath("//input[@name=\"radiooptions\"]"));
		int gx =gender.getLocation().getX();
		int gy =gender.getLocation().getY();
		System.out.println("gender<mail: "+(gx<mail));
		System.out.println(gx<gy);
		
		int year=driver.findElement(By.cssSelector("#yearbox")).getLocation().getX();
		int month=driver.findElement(By.xpath("//*[@*='Month']")).getLocation().getX();
		int day=driver.findElement(By.xpath("//*[@*='Day']")).getLocation().getX();
		System.out.println(year<month);
		
		
		
	}

}
