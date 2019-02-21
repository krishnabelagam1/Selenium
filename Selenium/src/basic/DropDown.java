package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.facebook.com/");
	 driver.manage().window().maximize();
	 WebElement drp = driver.findElement(By.xpath("//*[@id=\"year\"]"));
	 Select sc = new Select(drp); 
//	 WebElement first_value = sc.getFirstSelectedOption();
//	 String value = first_value.getText();
//	 System.out.println(value);
	 List<WebElement> li = sc.getOptions();
	 for(int i=0;i<li.size();i++){
		 String drpvalue =li.get(i).getText();
		 System.out.println("Total number of years :" +drpvalue);
	 }
	 driver.close();
	 

	}

}
