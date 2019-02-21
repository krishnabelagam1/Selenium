package basic.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import highlight.Helper;

public class Fb {
public static void main(String[] args) {
	 
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
		WebElement username =	driver.findElement(By.xpath("//input[@id=\"email\"]"));
		Helper.highLightElement(driver, username);
		username.sendKeys("8247346915");
		
		WebElement password =	driver.findElement(By.xpath("//input[@id=\"pass\"]"));
		Helper.highLightElement(driver, password);
		password.sendKeys("saikrish");
		
//		WebElement Signup = driver.findElement(By.xpath("//input[@id=\"u_0_2\"]"));
//		Helper.highLightElement(driver, Signup);
//		Signup.click();
		
		System.out.println("Facebook login successfully");
		//driver.findElement(By.xpath("//div[@id=\"userNavigationLabel\"]")).click();
			//Select dropdown = new Select(driver.findElements(By.name("Logout")).click();
		driver.manage().window().maximize();
		driver.close();

		}
}
