package chalkstreet;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HiddenElement {
	@Test
	public void Letsdoit() throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://learn.letskodeit.com/p/practice");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement ele = driver.findElement(By.id("displayed-text"));
		String str = ele.getText();
		System.out.println(str);
		System.out.println("Text box is " + ele.isDisplayed());
		Thread.sleep(2000);

		WebElement hidebut = driver.findElement(By.id("hide-textbox"));
		hidebut.click();
		String str1 = hidebut.getText();
		System.out.println(str1);
		System.out.println("Text box is " + ele.isDisplayed());
		Thread.sleep(2000);
		WebElement showbut = driver.findElement(By.id("show-textbox"));
		showbut.click();
		String str2 = showbut.getText();
		System.out.println(str2);
		System.out.println("Text box is " + ele.isDisplayed());
	}

	@Test
	public void expedia() throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.expedia.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(2000);
		WebElement childb = driver.findElement(By.xpath(
				"//*[@id=\"traveler-selector-hp-hotel\"]/div/ul/li/div/div/div[1]/div[3]/div[2]/label[1]/select"));
		String str3 = childb.getText();
		System.out.println(str3);
		System.out.println("Text box is " + childb.isDisplayed());
		driver.close();

	}

}
