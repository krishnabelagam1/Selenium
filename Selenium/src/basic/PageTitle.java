package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PageTitle {
 
	@Test
  public void verifyTitle() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	String St = driver.getTitle();
		Assert.assertEquals(St, "Facebook – log in or sign up");
	Assert.assertTrue(St.contains("Facebook – log in or sign up"));
	System.out.println("Title verified");
	
	  
		/*
		 * String St = driver.getPageSource(); System.out.println(St);
		 */
  }
}
