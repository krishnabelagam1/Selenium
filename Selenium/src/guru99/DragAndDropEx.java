package guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropEx {

	public static void main(String[] args) {
		 WebDriver driver;								
		    driver = new ChromeDriver();					
		    driver.get("http://demo.guru99.com/test/drag_drop.html");					
		    driver.manage().window().maximize();
		    WebElement from = driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
		    WebElement to = driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
		    Actions act = new Actions(driver);
		    act.dragAndDrop(from, to).build().perform();

	}

}
