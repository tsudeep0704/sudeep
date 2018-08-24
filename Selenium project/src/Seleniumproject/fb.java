package Seleniumproject;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class fb {

	public static void main(String[] args) throws InterruptedException {
         
		//Retrieve browser Driver into the code (In this case Chrome Driver)  
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\mamah\\Desktop\\Job\\chromedriver.exe");
		
    	WebDriver driver = new ChromeDriver(); // Instantiate the object
		WebDriverWait wait = new WebDriverWait(driver,20); //Applying Explicit wait for the object to load
		driver.manage().window().maximize();
		
		//Declaring the variable
        String baseUrl = "https://www.facebook.com";
        driver.get(baseUrl);
        String expectedTitle = "Facebook - Log In or Sign Up"; //Title to be expected for the page  
        String actualTitle = driver.getTitle();     //Get the actual value of the title of the page
       
        //Comparing if the actual title is equals to expected title
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }

        //Finding all the Web Elements using Xpath
        
        // Enter your First name in text box
        WebElement first_name = driver.findElement(By.xpath("//input[@name = 'firstname']"));

        //Enter your Last name in text box
        WebElement last_name = driver.findElement(By.xpath("//input[@name = 'lastname']"));
              
        //Enter Email or Phone Number in text box
        WebElement email_or_phone_number = driver.findElement(By.xpath("//input[@name = 'reg_email__']"));
                
        //Re enter the Email or Phone Number in the text box
        WebElement email_confirmation = driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
        
        //Enter the password in the text box
		WebElement new_password = driver.findElement(By.xpath("//input[@name = 'reg_passwd__']"));
        
		//Select the month from the dropdown
        Select dropdown_month = new Select(driver.findElement(By.xpath("//select[@name = 'birthday_month']")));
        
        //Select the date from the dropdown
        Select dropdown_date = new Select(driver.findElement(By.xpath("//select[@name = 'birthday_day']")));
        
        //Select the year from the dropdown
        Select dropdown_year = new Select(driver.findElement(By.xpath("//select[@name = 'birthday_year']")));
        
        //Select the female radio button for female
        WebElement radio_female = driver.findElement(By.xpath("//input[@type= 'radio' and @value = '1']"));
        
        //Select the male radio button for male 
        WebElement radio_male = driver.findElement(By.xpath("//input[@type= 'radio' and @value = '2']"));
        
        //Click on Sign Up
        WebElement sign_up_button = driver.findElement(By.xpath("//button[contains(text() ,  'Sign Up') and @name ='websubmit']"));
        
        
        
        //Generating random data using Random class 
        Random r = new Random();
        
        String firstName = "sudeep";
        String lastName = "talpallikar";
        String email = firstName + lastName + r.nextInt()+"@gmail.com";
        
        
        //Feeding the data to the page of the application 
        first_name.sendKeys(firstName);
        last_name.sendKeys(lastName);
        email_or_phone_number.sendKeys(email);
		wait.until(ExpectedConditions.visibilityOf(email_confirmation));
		email_confirmation.sendKeys(email);
		new_password.sendKeys("07041994");
		dropdown_month.selectByVisibleText("Apr");
		dropdown_date.selectByVisibleText("7");
		dropdown_year.selectByVisibleText("1994");
		radio_female.click();
		radio_male.click();
		sign_up_button.click();
		
        
        driver.quit(); //Closing the Browser
       
    }

}