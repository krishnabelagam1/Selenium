package guru99;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 WebDriver driver; 
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/web-table-element.php#");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		List<WebElement> col = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
		
		
		  for(int i =0;i<=4;i++) { String str = col.get(i).getText();
		  System.out.println("Index of elements "+i+" coloum is "+str); }
		 
		System.out.println("Total colomns :"+col.size());
		System.out.println("Index"+col.indexOf(1));
		Thread.sleep(5000);
		List<WebElement> row = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr/td[1]"));
		for(int j=0;j<=26;j++) {
			String st = row.get(j).getText();
			System.out.println("Index of every elements "+j+" Row is "+st);
		}
		System.out.println("Total rows :"+row.size());
		driver.close();
	

	}

}
