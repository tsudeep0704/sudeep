package Seleniumproject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class fb2 {

	public static void main(String[] args) throws InterruptedException {
		 
		//Retrieve the driver into the code 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mamah\\Desktop\\Job\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); // Instantiate the object
		WebDriverWait wait = new WebDriverWait(driver,20); 
		
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		System.out.println("maximized");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@name = 'firstname']")).sendKeys("sudeep");
		driver.findElement(By.xpath("//input[@name = 'lastname']")).sendKeys("talpallikar");
		driver.findElement(By.xpath("//input[@name = 'reg_email__']")).sendKeys("sudeep717@gmail.com");
		WebElement email_confirmation = driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
		wait.until(ExpectedConditions.visibilityOf(email_confirmation));
		email_confirmation.sendKeys("sudeep717@gmail.com");
		driver.findElement(By.xpath("//input[@name = 'reg_passwd__']")).sendKeys("07041994rG");
		Select dropdown_month = new Select(driver.findElement(By.xpath("//select[@name = 'birthday_month']")));
		dropdown_month.selectByVisibleText("Apr");
		Select dropdown_date = new Select(driver.findElement(By.xpath("//select[@name = 'birthday_day']")));
		dropdown_date.selectByVisibleText("7");
		Select dropdown_year = new Select(driver.findElement(By.xpath("//select[@name = 'birthday_year']")));
		dropdown_year.selectByVisibleText("1994");
		driver.findElement(By.xpath("//input[@type= 'radio' and @value = '1']")).click();
		driver.findElement(By.xpath("//input[@type= 'radio' and @value = '2']")).click();
		driver.findElement(By.xpath("//button[contains(text() ,  'Sign Up') and @name ='websubmit']")).click();
		
		
		driver.quit(); //Closing the browser
	   
	}

}