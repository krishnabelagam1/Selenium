package LatestProgram;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RoboClass {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://spreadsheetpage.com/index.php/file/gantt_chart_demo/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div/section/div/div[1]/ul/li[3]/a")).click();

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_ENTER);
		driver.close();

	}

}
