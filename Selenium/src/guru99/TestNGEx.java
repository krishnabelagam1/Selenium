package guru99;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGEx {
	
	WebDriver driver;
	String baseurl = "http://demo.guru99.com/test/newtours/";
	@Test
	public void basic () {
		driver = new  ChromeDriver();
		driver.get(baseurl);
		driver.manage().window().maximize();
		String Expected = "Welcome: Mercury Tours";
		String Actual = driver.getTitle();
		Assert.assertEquals(Actual, Expected);
		driver.close();
		
		
	}

}
