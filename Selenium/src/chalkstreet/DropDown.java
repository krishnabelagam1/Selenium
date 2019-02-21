package chalkstreet;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://learn.letskodeit.com/p/practice");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement ele = driver.findElement(By.id("carselect"));
		Select sel = new Select(ele);
		System.out.println("Select by index");
		sel.selectByIndex(2);
		System.out.println("Select by value");
		sel.selectByValue("benz");
		System.out.println("Select by visibleText");
		sel.selectByVisibleText("BMW");
		Thread.sleep(2000);
		System.out.println("print list of  elements");
		List<WebElement> li = sel.getOptions();
		int size = li.size();
		for (int i = 0; i < size; i++) {
			String st = li.get(i).getText();
			System.out.println(st);
			Thread.sleep(2000);
			driver.quit();

		}

	}

}
