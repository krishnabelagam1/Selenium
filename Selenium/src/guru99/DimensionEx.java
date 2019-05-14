package guru99;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
		

public class DimensionEx {

	public static void main(String[] args) {
		  
        WebDriver driver = new ChromeDriver();
         
		     // Navigate to Google		
        driver.get("http://www.facebook.com");	
   
        Dimension d=new Dimension(480,620);
        //Resize the current window to the given dimension
        driver.manage().window().setSize(d);



     		
       
       driver.quit();			
}		

	}


