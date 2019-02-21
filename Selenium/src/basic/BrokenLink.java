package basic;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class BrokenLink {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://hc.apache.org/");
		List<WebElement> list = driver.findElements(By.tagName("a"));
		System.out.println("Total number of links:" + list.size());
		for (int i = 0; i <= list.size(); i++) {
			WebElement ele = list.get(i);
			String url = ele.getAttribute("href");
			VerifyLinkActive(url);
		}

	}

	private static void VerifyLinkActive(String linkurl) {
		try {
			URL url = new URL(linkurl);
			HttpURLConnection httpURLconnect = (HttpURLConnection) url.openConnection();
			httpURLconnect.setConnectTimeout(5000);
			httpURLconnect.connect();
			if (httpURLconnect.getResponseCode() == 200) {
				System.out.println(linkurl + "-" + httpURLconnect.getResponseMessage());
				if (httpURLconnect.getResponseCode() == HttpURLConnection.HTTP_NOT_FOUND)
					;
				System.out.println(
						linkurl + "-" + httpURLconnect.getResponseMessage() + "-" + HttpURLConnection.HTTP_NOT_FOUND);
			}

		} catch (Exception e) {

		}

	}

}
