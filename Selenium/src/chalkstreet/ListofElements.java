package chalkstreet;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListofElements {

	public static void main(String[] args) throws Exception {
		boolean ischecked = false;
		WebDriver driver = new ChromeDriver();
		driver.get("https://learn.letskodeit.com/p/practice");
		driver.manage().window().maximize();
		/*
		 * List<WebElement> radiobutton= driver.findElements(By.
		 * xpath("//input[contains(@type,'radio') and contains(@name,'cars')]"));
		 */
		List<WebElement> radiobutton = driver.findElements(By.name("cars"));
		int size =radiobutton.size();
		System.out.println("Number of elements are:" +size);
		Thread.sleep(4000);
		for(int i =0;i<size;i++) {
			ischecked = radiobutton.get(i).isSelected();
			if(!ischecked) {
				radiobutton.get(i).click();
				Thread.sleep(2000);
				driver.quit();
			}
		}

	}

}
