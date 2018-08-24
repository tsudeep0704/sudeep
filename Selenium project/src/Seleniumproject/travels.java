package Seleniumproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class travels {

	public static void main(String[] args) {
         
		//Retrieve Chrome Driver into the code 
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\mamah\\Desktop\\Job\\chromedriver.exe");
		
    	WebDriver driver = new ChromeDriver(); // Instantiate the object
		 
		//Declaring the variables
        String baseUrl = "https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin";
        String expectedTitle = "Gmail";
        String actualTitle = "";

        //Launching Chrome and storing it to Base URL
        driver.get(baseUrl);

        //Get the actual value of the title
        actualTitle = driver.getTitle();

        //Comparing the actual and expected Title
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
       
        driver.quit(); //Closing the Google Chrome
        
       
    }

}