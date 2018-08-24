package Seleniumproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class s1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mamah\\Desktop\\Job\\chromedriver.Exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://www.youtube.com");
		 
		 System.out.println(driver.getCurrentUrl());
		 System.out.println(driver.getTitle());
		 driver.close();
	}
}
