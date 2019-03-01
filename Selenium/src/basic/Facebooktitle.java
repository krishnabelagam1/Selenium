package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Facebooktitle {
     
	//public static void main(String[] args) {
	 @Test
	 public void test1() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("8247346915");
		driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys("661992");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		System.out.println("Facebook login successfully");
		System.out.println(driver.getTitle());
		//Select dropdown = new Select(driver.findElements(By.name("Logout")).click();
		
		driver.close();

	}

}
 