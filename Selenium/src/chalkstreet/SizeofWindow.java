package chalkstreet;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SizeofWindow {
    @Test
	public void windows() throws Exception {
    	WebDriver driver = new ChromeDriver();
    	//driver.get("https://learn.letskodeit.com/p/practice");
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    	JavascriptExecutor js = (JavascriptExecutor)driver;
    	js.executeScript("window.location ='https://learn.letskodeit.com/p/practice';");
    	long height = (Long) js.executeScript("return window.innerHeight;");
    	long width = (Long) js.executeScript("return window.innerWidth;");
    	System.out.println("Height is :" +height);
    	System.out.println("Width is :" +width);
    	Thread.sleep(2000);
    	driver.quit();
		
	}
}
