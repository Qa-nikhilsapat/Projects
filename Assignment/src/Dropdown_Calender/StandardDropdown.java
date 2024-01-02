package Dropdown_Calender;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StandardDropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Executibles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
//		WebElement skillbox =driver.findElement(By.id("Skills"));
//		//instance of selsct class and passing locator in its constructor
//	Select skillselect = new Select(skillbox);
//		
//	System.out.println("is multiple or not :"+skillselect.isMultiple());
//		System.out.println(skillselect.getFirstSelectedOption().getText());
//		
//		List<WebElement> options=skillselect.getOptions();
//		System.out.println(options.size());
//		
//		for(int i=0;i<options.size();i++) {
//			System.out.println(i +options.get(i).getText());
//		}
//		
//		skillselect.selectByIndex(1);
//		System.out.println("by index: "+skillselect.getFirstSelectedOption().getText());
//		skillselect.selectByValue("APIs");
//		System.out.println("By value:"+skillselect.getFirstSelectedOption().getText());
//		skillselect.selectByVisibleText("Android");
//		System.out.println("vy visible text:"+skillselect.getFirstSelectedOption().getText());	
//		//for day
//		Select dayDrop=new Select(driver.findElement(By.id("daybox")));
//		List<Integer> days=new ArrayList<Integer>();
//		for(int i=1;i<dayDrop.getOptions().size();i++) {
//			String day=dayDrop.getOptions().get(i).getText();
//			days.add(Integer.parseInt(day));
//		}
//		List<Integer> dupDays=new ArrayList<Integer>();
//		dupDays.addAll(days);
//		Collections.sort(dupDays);
//		System.out.println(days.equals(dupDays));
	//for years
		Select yeardrop=new Select(driver.findElement(By.id("yearbox")));
		List<Integer> years= new ArrayList<Integer>();
		for(int i=1;i<yeardrop.getOptions().size();i++) {
			String year=yeardrop.getOptions().get(i).getText();
			years.add(Integer.parseInt(year));
		}
		//System.out.println(years);
		
		List<Integer> dupYears= new ArrayList<Integer>();
		dupYears.addAll(years);
	    Collections.sort(dupYears);
	    System.out.println(years.equals(dupYears));
	//for month
	    Select monthsdrop=new Select(driver.findElement(By.cssSelector("[placeholder=\"Month\"]")));
	    List<String> months=new ArrayList<String>();
	    for(int i=1;i<monthsdrop.getOptions().size();i++) {
	    	String month= monthsdrop.getOptions().get(i).getText();
	    	    	
	    }
		
		
		//TODO: perform validation on following
//				1. Year(ascending order validation)
//				2. Month(month Sequence validation)
//				3. Days(ascending order validation)
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			
	}

}
