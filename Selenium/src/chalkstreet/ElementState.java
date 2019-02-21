package chalkstreet;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementState {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		String baseUrl;
			driver = new ChromeDriver();
			baseUrl = "https://www.google.com";
			driver.manage().timeouts().implicitlyWait(10,  TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get(baseUrl);
		

	
			WebElement e1 = driver.findElement(By.id("gs_htif0"));
			System.out.println("E1 is Enabled? " + e1.isEnabled());
			
			WebElement e2 = driver.findElement(By.id("gs_taif0"));
			System.out.println("E2 is Enabled? " + e2.isEnabled());
			
			WebElement e3 = driver.findElement(By.id("lst-ib"));
			System.out.println("E3 is Enabled? " + e3.isEnabled());
			
			e3.sendKeys("letskodeit");
		

		
			Thread.sleep(2000);
			driver.quit();
		


	}

}
