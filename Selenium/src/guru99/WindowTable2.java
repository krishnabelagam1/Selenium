package guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowTable2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		WebElement ele =driver.findElement(By.xpath("xpath(\"//table/tbody/tr[2]/td[2]/table/tbody/tr/td[2]\")).getText();"));
         System.out.println("Complete output :"+ele.getText());
         driver.close();
	}

}
