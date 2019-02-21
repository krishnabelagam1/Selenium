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
public class LoginPage {
	WebDriver driver;
	By username = By.id("email");
	By password = By.id("passwd");
	By loginbut = By.id("SubmitLogin");
	
 public  LoginPage(WebDriver driver){
	 this.driver=driver;
	  }
 public void typeusername(String usn) {
	 driver.findElement(username).sendKeys(usn);
 }
 public void typepassword(String pass) {
	 driver.findElement(password).sendKeys(pass);
 }
 public void clickLogin() {
	 driver.findElement(username).click();
	 
 }

}
