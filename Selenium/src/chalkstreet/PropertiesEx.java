package chalkstreet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesEx {

	public static void main(String[] args) throws IOException {
		String path ="C:\\Users\\Dell\\eclipse-workspace\\Selenium\\test.properties";
		Properties pro = new Properties();
		FileInputStream fin = new FileInputStream(path);
		pro.load(fin);
		System.out.println(pro.getProperty("city"));
		System.out.println(pro.getProperty("mobile"));
		

	}

}
