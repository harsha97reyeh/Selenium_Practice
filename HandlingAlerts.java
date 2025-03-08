package selenium_practice;
//Java and Selenium libraries
import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingAlerts {

	public static void main(String[] args) throws InterruptedException {
		// Set the path of the geckodriver executable for Firefox
		System.setProperty("webdriver.gecko.driver","C:\\Users\\santh\\Desktop\\projects\\selenium\\geckodriver-v0.35.0-win64\\geckodriver.exe");
		// Initialize the WebDriver for Firefox browser
		WebDriver driver = new FirefoxDriver();
		// Open the URL for the demo alerts page
		driver.get("https://demo.automationtesting.in/Alerts.html");
		//Regular Alert handling
		// Click the button to trigger a regular JavaScript alert
		driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();
		// Wait for the alert to appear (for demonstration purposes)
		Thread.sleep(4000);
		// Switch to the alert and accept it (click OK)
		Alert alert= driver.switchTo().alert();
		// Accepting the alert (clicking "OK")
		alert.accept();
		//wait condition method
		// Click the button to trigger a second alert
		driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();
		// Wait for the alert to appear
		Thread.sleep(4000);
		// Use WebDriverWait to explicitly wait for the alert to appear
		WebDriverWait w=new WebDriverWait(driver, Duration.ofSeconds(10));
		// Waits until the alert is present
		Alert a=w.until(ExpectedConditions.alertIsPresent());
		// Accepting the alert (clicking "OK")
		a.accept();
		//Javascriptexecutor method
		// Click the button to trigger a third alert
		driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();
		// Wait for the alert to appear
		Thread.sleep(4000);
		// Create an instance of JavascriptExecutor to execute JavaScript code in the browser
		JavascriptExecutor js=(JavascriptExecutor)driver;
		// Use JavaScript to override the window.alert method (effectively disabling it)
		// This line attempts to prevent the alert from showing up in the first place
		try{
			js.executeScript("window.alert=function{};");
		}
		catch(Exception e) {
		// If any exception occurs while executing the script, catch it (though in this case, it won't throw any)	
		}
		System.out.println("Ssuccessful");
	}

}
