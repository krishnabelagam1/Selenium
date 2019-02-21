package guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLink {

	public static void main(String[] args) {
		String baseurl = "https://www.facebook.com/";
		WebDriver driver = new ChromeDriver();
		driver.get(baseurl);
		driver.manage().window().maximize();
		/*
		 * WebElement ele = driver.findElement(By.xpath(
		 * "//*[@id=\"content\"]/div/div/div/div/div[2]/div[1]/div[1]/span"));
		 */
				String st = driver.findElement(By.partialLinkText("eate")).getText();
		System.out.println(st);
		driver.close();
	}

}
