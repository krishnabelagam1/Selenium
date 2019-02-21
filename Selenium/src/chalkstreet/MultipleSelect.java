package chalkstreet;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelect {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://learn.letskodeit.com/p/practice");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement ele = driver.findElement(By.id("multiple-select-example"));
		Select sel = new Select(ele);
		Thread.sleep(2000);
		System.out.println("Select orange by value");
		sel.selectByValue("orange");
		/*
		 * Thread.sleep(2000); System.out.println("deSelect orange by value");
		 * sel.deselectByValue("orange");
		 */
		Thread.sleep(2000);
		System.out.println("Select peach by index");
		sel.selectByIndex(2);
		Thread.sleep(2000);
		System.out.println("Select Apple by visibleText");
		sel.selectByVisibleText("Apple");
		System.out.println("Print all selected options");
		List<WebElement> li = sel.getAllSelectedOptions();
		for (WebElement opt : li) {
			System.out.println(opt.getText());
		}
		Thread.sleep(2000);
		sel.deselectAll();
		driver.close();
	}

}
