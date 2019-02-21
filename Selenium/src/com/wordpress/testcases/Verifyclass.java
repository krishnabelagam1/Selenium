/**
 * 
 */
package com.wordpress.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.wordpress.pages.LoginPage;

/**
 * @author 
 *
 */
public class Verifyclass {
	@Test
	public void verifypage() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/login.html");
		
		LoginPage login = new LoginPage(driver);
		login.typeusername("krishnabelagam1@gmail.com");
		login.typepassword("sai@6692");
		login.clickLogin();
		driver.close();
		
		
		
	}

}
