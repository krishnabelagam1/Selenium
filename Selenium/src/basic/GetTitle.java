package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class GetTitle {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/identify?ctx=recover");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"blueBarDOMInspector\"]/div/div/div/div[1]/h1/a/i")).click();
		if(driver.getTitle().equals("Facebook - log in or sign up") ) {
			System.out.println("we are successfully login in fb");
		}
		else 
			System.out.println("We are unsuccessfully login in fb");
		driver.close();

	}
	

}
