package basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Facebook2 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement day = driver.findElement(By.xpath("//*[@id=\"day\"]"));
		Select select = new Select(day);
		select.selectByValue("20");

		WebElement month = driver.findElement(By.xpath("//*[@id=\"month\"]"));
		select  = new Select(month);
		select.selectByIndex(3);

		WebElement year = driver.findElement(By.xpath("//*[@id=\"year\"]"));
		 select = new Select(year);
		select.selectByValue("1992");
        
		driver.quit();
	}

}
