import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Utility {

	public static WebDriver driver=null;
	public static Actions action=null;

	public void click(WebElement click) {
		click.click();
	}
	
	public void dragAndDrop(WebElement src,WebElement target) {
		action.moveToElement(src).dragAndDrop(src, target).build().perform();;
	}
}
