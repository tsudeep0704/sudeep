package Seleniumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class tutorial1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mamah\\Desktop\\Job\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://google.com");
		driver.findElement(By.cssSelector("#lst-ib")).sendKeys("www.yahoo.com");
		driver.findElement(By.cssSelector("#tsf > div.tsf-p > div.jsb > center > input[type=\"submit\"]:nth-child(1)")).submit();
		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/h3/a")).click();
		driver.navigate().back();
		driver.findElement(By.id("u_0_2")).click();
		Select dropdown = new Select(driver.findElement(By.xpath("//*[@id='divpaxinfo']")));
		dropdown.selectByIndex(2); 
		
		driver.quit();
		
	}
}
