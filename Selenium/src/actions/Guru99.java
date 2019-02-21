package actions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99 {

	public static void main(String[] args) throws Exception {
		//String baseUrl = "http://demo.guru99.com/test/delete_customer.php";
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("83929");
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
		Alert alert = driver.switchTo().alert();
		String alertmessage = driver.switchTo().alert().getText();
		System.out.println("Coming alert message " + alertmessage);
		Thread.sleep(4000);
		//alert.accept();
		//driver.switchTo().alert().sendKeys("Text");
          alert.dismiss();
		//driver.close();
	}

}
