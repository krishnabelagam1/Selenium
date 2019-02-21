package softwareTestingMaterial;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.navigate().to("https://www.facebook.com/j");
driver.manage().window().maximize();
driver.findElement(By.xpath("//*[@id=\"u_0_8\"]")).sendKeys(Keys.ENTER);
	}

}
