package navigateEx;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ex1 {
  @Test
	public void Navig() {
WebDriver driver;
		
		driver= new ChromeDriver();

	
	driver.get("https://www.w3schools.com/sql/default.asp");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
	driver.findElement(By.xpath("//*[@id=\"topnav\"]/div/div[1]/a[7]")).click();
	driver.navigate().back();
	driver.navigate().to("http://www.mindqsystems.com/");
	
	
		/*
		 * driver.findElement(By.xpath("//*[@id=\"topnav\"]/div/div[1]/a[7]")).click();
		 * driver.navigate().refresh();
		 */
    driver.close();
	}

}
