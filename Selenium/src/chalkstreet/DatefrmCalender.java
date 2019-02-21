package chalkstreet;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DatefrmCalender {
	@Test
   public void DatePic() throws Exception {
	   WebDriver driver = new ChromeDriver();
		driver.get("https://www.expedia.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"tab-flight-tab-hp\"]")).click();
		WebElement depart = driver.findElement(By.id("flight-departing-hp-flight"));
		depart.click();
		WebElement calmonth = driver.findElement(By.xpath("//div[@class='datepicker-cal-month'][1]"));
		List<WebElement> li = calmonth.findElements(By.tagName("tr"));
		Thread.sleep(2000);
		for(WebElement date:li) {
			if(date.getText().equals("26")) {
				date.click();
				break;
			}
			
		}
   }
}
