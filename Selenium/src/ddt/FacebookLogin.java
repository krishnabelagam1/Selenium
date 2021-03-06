package ddt;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FacebookLogin {
	WebDriver driver;
	@Test(dataProvider="FacebookData")
	public void loginfb(String username,String password) throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(username);
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		
		//Assert.assertEquals(driver.getTitle().contains("(2) Facebook"),"User is not able to login with valid credientials" );
		//Assert.assertTrue(true);
		Assert.assertTrue(driver.getTitle().contains("(2) Facebook"));
		System.out.println("Page verified - user is able to login successfully");
		}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	@DataProvider(name ="FacebookData")
	public Object[][] passdata(){
		Object[][] data = new Object[3][2];
		 data[0][0] = "8247346915";
		 data[0][1] = "666666";
		 data[1][0] = "8247346915";
		 data[1][1] = "999999";
		 data[2][0] = "8247346915";
		 data[2][1] = "661992";
		
		
		
		return data;
		
	}

}
