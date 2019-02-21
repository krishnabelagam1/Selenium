package basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Redbus {

	@Test
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"src\"]")).sendKeys("Hyderabad");
		driver.findElement(By.xpath("//*[@id=\"dest\"]")).sendKeys("Visakhapatnam");
		driver.findElement(By.xpath("//*[@id=\"search\"]/div/div[3]/div/label")).click();
		driver.findElement(By.xpath("//div[@class='rb-calendar']//button[contains(text(),'>')]")).click();
		
		Thread.sleep(2000);
		//driver.close();

	}

}
