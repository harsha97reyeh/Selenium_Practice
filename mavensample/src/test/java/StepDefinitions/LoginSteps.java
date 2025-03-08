package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.*;
public class LoginSteps {

	WebDriver driver = new FirefoxDriver();
	
	@Given("user is on facebook page")
	public void user_is_on_facebook_page() {
		
		driver.navigate().to("http://facebook.com");
	}

	@When("user enters login credientials")
	public void user_enters_login_credientials() {
		
		driver.findElement(By.id("email")).sendKeys("username");
		driver.findElement(By.id("pass")).sendKeys("Password");
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		
		driver.findElement(By.name("login")).click();
	}

	@Then("user is navigated to the facebook page")
	public void user_is_navigated_to_the_facebook_page() {
	   System.out.println("page logged in");
	}

}
