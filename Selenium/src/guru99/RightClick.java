package guru99;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
		WebElement link = driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		act.contextClick(link).perform();
		driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[5]/span")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println("Alert text is :" + alert.getText());
		alert.accept();

	}

}
