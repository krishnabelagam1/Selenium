package basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RedbusEx {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"src\"]"));
		ele.sendKeys("vizag");
		WebElement ele2 = driver.findElement(By.xpath("//*[@id=\"dest\"]"));
		ele2.sendKeys("Tirupathi");
		driver.findElement(By.xpath("//*[@id=\"search\"]/div/div[3]/div/label")).click();
		driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[6]/td[5]")).click();
		driver.findElement(By.xpath("//*[@id=\"search\"]/div/div[4]/div/label")).click();
		driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[6]/td[5]")).click();
		driver.findElement(By.xpath("//*[@id=\"rb-calendar_return_cal\"]/table/tbody/tr[7]/td[4]")).click();
		driver.findElement(By.xpath("//*[@id=\"search_btn\"]")).click();
		
		
	
		 
	}

}
