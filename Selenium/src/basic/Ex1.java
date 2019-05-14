package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://ibpsonline.ibps.in/sbiposmar19/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='txtregno']")).sendKeys("1710263662");
		driver.findElement(By.xpath("//input[@id='txtpass']")).sendKeys("GPKW4H24");
		driver.findElement(By.xpath("//input[@id='txtCode']")).sendKeys("zv7dn");
		driver.findElement(By.xpath("//input[@id='Submit']")).click();

	}

}
