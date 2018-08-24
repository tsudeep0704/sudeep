package Seleniumproject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class travel {

	public static void main(String[] args) throws InterruptedException {
         
		//Retrieve Chrome Driver into the code 
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\mamah\\Desktop\\Job\\chromedriver.exe");
		
    	WebDriver driver = new ChromeDriver(); // Instantiate the object
		 
		//Declaring the variables
        String baseUrl = "https://www.facebook.com";
        String expectedTitle = "Facebook - Log In or Sign Up";
        String actualTitle = "";
        
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }

        //Launching Chrome and storing it to Base URL
        driver.get(baseUrl);
        Thread.sleep(5000);
        WebElement first_name = driver.findElement(By.xpath("//input[@id='u_0_n']"));
        first_name.sendKeys("sudeep");
        
        WebElement last_name = driver.findElement(By.xpath("//input[@id='u_0_p']"));
        last_name.sendKeys("talpallikar");
        
        WebElement email_or_phone_number = driver.findElement(By.xpath("//input[@id='u_0_s']"));
        email_or_phone_number.sendKeys("sudeep717@gmail.com");
        
        WebElement new_password = driver.findElement(By.xpath("//input[@id='u_0_z']"));
        new_password.sendKeys("07041994rG");
        
        Select dropdown_month = new Select(driver.findElement(By.xpath("//select[@id='month']")));
        dropdown_month.selectByVisibleText("Apr");
        
        Select dropdown_date = new Select(driver.findElement(By.xpath("//select[@id='day']")));
        dropdown_date.selectByVisibleText("7");
        
        Select dropdown_year = new Select(driver.findElement(By.xpath("//select[@id='year']")));
        dropdown_year.selectByVisibleText("1994");
        
        WebElement radio_female = driver.findElement(By.xpath("//input[@type= 'radio' and @value = '1']"));
        radio_female.click();
        
        WebElement radio_male = driver.findElement(By.xpath("//input[@type= 'radio' and @value = '2']"));
        radio_male.click();
        
        WebElement sign_up_button = driver.findElement(By.xpath("//button[contains(text() ,  'Sign Up') and @id = 'u_0_15']"));
        sign_up_button.click();
        
        //Get the actual value of the title
        actualTitle = driver.getTitle();

        //Comparing the actual and expected Title
        
       
        driver.quit(); //Closing the Google Chrome
       
    }

}

