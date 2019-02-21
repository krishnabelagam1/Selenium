package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Explicit {

	@Test
	public void Test1() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"post-body-7708391096228750161\"]/button")).click();
		WebElement we = driver.findElement(By.xpath("//p[text()='Selenium']"));
		boolean status = we.isDisplayed();
		if(status) {
			System.out.println("Element has displayed");
		}
		else {
			System.out.println("Element is not displayed");
		}
		driver.close();
	}
	
}
