package guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickImage {

	public static void main(String[] args) {
		String baseurl = "https://www.facebook.com/";
		WebDriver driver = new ChromeDriver();
		driver.get(baseurl);
		driver.manage().window().maximize();
        WebElement ele = driver.findElement(By.xpath("//*[@id=\"blueBarDOMInspector\"]/div/div/div/div[1]/h1/a/i"));
        String st = ele.getText();
        System.out.println("Title of given element :"+st);
        ele.click();
      System.out.println( driver.getTitle());

	}

}
