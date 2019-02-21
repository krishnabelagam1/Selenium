package basic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
		driver.manage().window().maximize();
		List <WebElement> radio = driver.findElements(By.xpath("//input[@id='java']"));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		for(int i =0;i<radio.size();i++) {
			WebElement lradio = radio.get(i);
			String value = lradio.getAttribute("value");
			System.out.println("Value of each elements :" +value);
		}
	}

}
