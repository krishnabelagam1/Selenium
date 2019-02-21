package TestNgEx;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InvocationCountEx {
	   @BeforeMethod
       public void before()
       {
                System.out.println("Before test running");
       }
       @AfterMethod
       public void after()
       {
                System.out.println("After test running");
       }
      
       @Test(invocationCount=2,invocationTimeOut=30)
       public void execute() throws InterruptedException
       {
                
                WebDriver driver=new ChromeDriver();
                driver.manage().window().maximize();   
                driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);                  
                driver.get("https://www.gmail.com");                         
                driver.findElement(By.id("Email")).sendKeys("rameshsoft.selenium");                  
                driver.findElement(By.id("next")).click();
                Thread.sleep(2000);
                driver.findElement(By.id("Passwd")).sendKeys("12345");
                driver.findElement(By.id("signIn")).click();                  
                driver.quit();
       }

}
