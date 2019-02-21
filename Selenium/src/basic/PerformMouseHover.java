package basic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class PerformMouseHover {
	@Test
	public void mousehover() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-perform-mouse-hover-in-selenium.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement ele = driver.findElement(By.xpath("//button[@class='dropbtn']"));
		Actions act = new Actions(driver);
		act.moveToElement(ele).click().perform();
		List<WebElement> links =driver.findElements(By.xpath("//div[@class='dropdown-content']//a"));
		int total_count = links.size();
		boolean status = ele.isEnabled();
		for(int i =0;i<=links.size();i++) {
			WebElement element = links.get(i);
			String text = element.getAttribute("innerHTML");
			System.out.println("Links of given elements :"+text +" and status is "+status);
			
		}
		
	}

}
