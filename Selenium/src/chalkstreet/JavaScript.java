package chalkstreet;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaScript {
    @Test
	public void Script() {
    	WebDriver driver = new ChromeDriver();
    	//driver.get("https://learn.letskodeit.com/p/practice");
    	JavascriptExecutor js = (JavascriptExecutor)driver;
    	js.executeScript("window.location ='https://learn.letskodeit.com/p/practice';");
    	WebElement textbox = (WebElement) js.executeScript("return document.getElementById('name');");
    	textbox.sendKeys("test");
    	
		
	}
}
