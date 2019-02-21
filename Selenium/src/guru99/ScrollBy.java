package guru99;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollBy {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = ( JavascriptExecutor)driver;
		driver.get("https://www.guru99.com/scroll-up-down-selenium-webdriver.html");
		driver.manage().window().maximize();
         //js.executeScript("window.scrollBy(0,1000)");
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");	
		System.out.println("Successfully  scrolled");
         Thread.sleep(2000);
         driver.close();
	}

}
