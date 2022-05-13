package Gluecode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	
	public WebDriver driver;
	@Given("^Open the ChromeBrowser and launch the application$")				
    public void open_the_chrome_and_launch_the_application() 							
    {		
		System.setProperty("webdriver.chrome.driver","D:\\Bridgelabz\\JAVA\\GherkinCucumber\\driver\\chromedriver.exe");
	    driver =new ChromeDriver();
	    driver.get("http://demo.guru99.com/v4");
		 		
    }		

    @When("^Enter the Username credentials$")					
    public void enter_the_Username_and_Password() throws Throwable 							
    {		
    	driver.findElement(By.name("uid")).sendKeys("Naina");
    	driver.findElement(By.name("password")).sendKeys("password");
       System.out.println("This step enter the Username and Password on the login page.");	
       
    }		

    @Then("^Reset credentials$")					
    public void Reset_the_credential() throws Throwable 							
    {   
    	driver.findElement(By.name("btnReset")).click();
        System.out.println("This step click on the Reset button.");					
    }		

}



