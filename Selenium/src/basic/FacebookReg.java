package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class FacebookReg {
	@Test

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("krishna");
		driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("sai");
		driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("krishnabelagam2@gmail.com");
		driver.findElement(By.xpath("//input[@name =\"reg_email_confirmation__\"]"))
				.sendKeys("krishnabelagam2@gmail.com");
		driver.findElement(By.xpath("//input[@name=\"reg_passwd__\"]")).sendKeys("sai6692");
		// driver.findElement(By.xpath("//select[@id=\"day\"]")).click();
		Select drpDay = new Select(driver.findElement(By.name("birthday_day")));
		drpDay.selectByValue("2");
		Select drpDay1 = new Select(driver.findElement(By.name("birthday_month")));
		drpDay1.selectByVisibleText("Aug");
		Select drpDay2 = new Select(driver.findElement(By.name("birthday_year")));
		drpDay2.selectByValue("1992");
		WebElement radio1 = driver.findElement(By.xpath("//input[@id=\"u_0_a\"]"));
		radio1.click();
		driver.findElement(By.xpath("//button[@name=\"websubmit\"]")).click();
		System.out.println("facebook id registered");
		Thread.sleep(6000);
		driver.close();

	}

}
