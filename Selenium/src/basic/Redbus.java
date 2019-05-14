package basic;

import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Redbus {
    
	@Test
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"src\"]")).sendKeys("Hyderabad");
		driver.findElement(By.xpath("//*[@id=\"dest\"]")).sendKeys("Visakhapatnam");
		driver.findElement(By.xpath("//*[@id=\"search\"]/div/div[3]/div/label")).click();
		driver.findElement(By.xpath("//div[@class='rb-calendar']//button[contains(text(),'>')]")).click();
		File src = new File("C:\\Users\\Dell\\Documents\\Testbasic.xlsx");
		FileInputStream fin = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fin);
		XSSFSheet sheet1 = wb.getSheetAt(1);
		String da = sheet1.getRow(1).getCell(0).getStringCellValue();
		System.out.println("First ledger name: "+da);
		
		Thread.sleep(2000);
		//driver.close();

	}

}
