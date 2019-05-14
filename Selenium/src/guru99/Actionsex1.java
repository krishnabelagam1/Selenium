package guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsex1 {

	public static void main(String[] args) {
		String baseurl = "https://www.facebook.com/";
		WebDriver driver = new ChromeDriver();
		driver.get(baseurl);
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"u_0_j\"]"));
	
		System.out.println("element click");
		Actions action = new Actions(driver);
		action.keyUp(ele,Keys.SHIFT).sendKeys(ele, "sai krishna").perform();
		
		

	}

}
