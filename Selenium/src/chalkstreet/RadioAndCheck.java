package chalkstreet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioAndCheck {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://learn.letskodeit.com/p/practice");
		driver.manage().window().maximize();
		WebElement BMWO = driver.findElement(By.xpath("//*[@id=\"bmwradio\"]"));
		BMWO.click();
		Thread.sleep(2000);
		WebElement benzo = driver.findElement(By.xpath("//*[@id=\"benzradio\"]"));
		benzo.click();
		Thread.sleep(2000);
		WebElement hondao = driver.findElement(By.xpath("//*[@id=\"hondaradio\"]"));
		hondao.click();
		Thread.sleep(2000);
		WebElement bmwc = driver.findElement(By.xpath("//*[@id=\"bmwcheck\"]"));
		bmwc.click();
		Thread.sleep(2000);
		WebElement benzc = driver.findElement(By.xpath("//*[@id=\"benzcheck\"]"));
		benzc.click();
		Thread.sleep(2000);
		WebElement hondac = driver.findElement(By.xpath("//*[@id=\"hondacheck\"]"));
		hondac.click();
		Thread.sleep(2000);
		System.out.println("Enter BMW Radio button is slected? " + BMWO.isSelected());
		System.out.println("Enter benz Radio button is slected? " + benzo.isSelected());
		System.out.println("Enter honda Radio button is slected? " + hondao.isSelected());
		System.out.println("Enter BMW checkbox is slected? " + bmwc.isSelected());
		System.out.println("Enter benz checkbox is slected? " + benzc.isSelected());
		System.out.println("Enter honda checkbox is slected? " + hondac.isSelected());
		System.out.println("Enter BMW Radio button is slected? " + BMWO.isEnabled());
		System.out.println("Enter BMW Radio button is slected? " + BMWO.isDisplayed());
		driver.quit();

	}

}
