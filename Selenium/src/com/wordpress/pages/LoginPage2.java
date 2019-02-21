/**
 * 
 */
package com.wordpress.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author 
 * This class will store all locators and methods of login page
 *
 */
public class LoginPage2 {
	WebDriver driver;
	By username = By.id("email");
	By password = By.id("passwd");
	By loginbut = By.id("SubmitLogin");
	
 public  LoginPage2(WebDriver driver){
	 this.driver=driver;
	  }
 public void Logintowordpress(String userid,String pass) {
	 driver.findElement(username).sendKeys(userid);
	 driver.findElement(password).sendKeys(pass);
	 driver.findElement(username).click();
 }


}
