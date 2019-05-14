package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToEx {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("www.facebook.com");
		driver.manage().window().maximize();
        Thread.sleep(4000);
        driver.switchTo().activeElement().sendKeys("8247346915");
        driver.close();
	}

}
