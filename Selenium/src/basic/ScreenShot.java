package basic;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenShot {
public void screnn() {
	//public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("mikael");
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//try {
		//FileUtils.copyFile(src, new File("./Selenium/Screenshot/facebook.png"));
		

	

}
}