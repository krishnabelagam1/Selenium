package autoIt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AutoITEx1 {
	@Test
	public void Auto() throws Exception {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C://Users//Dell//Desktop//uploadFile.html");
		driver.findElement(By.xpath("/html/body/input")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\Dell\\Desktop\\AutoIT\\uploadFile.exe");
		
	}

}
