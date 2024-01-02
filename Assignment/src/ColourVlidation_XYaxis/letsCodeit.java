package ColourVlidation_XYaxis;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class letsCodeit {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Executibles\\Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://courses.letskodeit.com/practice");
		WebElement radio=driver.findElement(By.cssSelector("#radio-btn-example>*>legend"));
		radio.getCssValue("");
		radio.getCssValue("");
		
		WebElement clas=driver.findElement(By.cssSelector("#select-class-example>*>legend"));
		String color1=clas.getCssValue("background-color");
		String font1=clas.getCssValue("font-size");
		System.out.println(color1+" "+font1);
		
		WebElement window=driver.findElement(By.cssSelector("#openwindow"));
		String color2=window.getCssValue("background-color");
		String font2=window.getCssValue("font-size");
		System.out.println(color2+" "+font2);
		
		WebElement alert=driver.findElement(By.name("enter-name"));
		String color3=alert.getCssValue("background-color");
		String font3=alert.getCssValue("font-size");
		System.out.println(color3+" "+font3);
//		WebElement radio=driver.findElement(By.cssSelector(""));
//		String color4=radio.getCssValue("");
//		String font4=radio.getCssValue("");
//		System.out.println(color4+" "+font4);
//		WebElement radio=driver.findElement(By.cssSelector(""));
//		String color5=radio.getCssValue("");
//		String font5=radio.getCssValue("");
//		System.out.println(color5+" "+font5);
	}

}
