package TestNgEx;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(TestNgEx.ListenerTest.class)
public class MyfirstLiseners {

	@Test
	public void googletitleverify() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		driver.quit();
	}
	/*
	 * @Test public void Testmatch() { System.out.println("Test 2 dummy");
	 * Assert.assertTrue(false); }
	 */}
