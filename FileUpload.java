package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException {
		// Set the path to the GeckoDriver executable (required for Firefox browser automation)
		System.setProperty("webdriver.gecko.driver","C:\\Users\\santh\\Desktop\\projects\\selenium\\geckodriver-v0.35.0-win64\\geckodriver.exe");
		// Initialize Firefox browser using WebDriver
		WebDriver driver = new FirefoxDriver();
		// Open the file upload test page
		driver.get("https://practice.expandtesting.com/upload");
		 // Locate the file input element and upload the file using sendKeys() method
		driver.findElement(By.id("fileInput")).sendKeys("C:\\Users\\santh\\Desktop\\test1.txt");
		 // Wait for 4 seconds to observe the file being attached (optional - can be removed if not needed)
		Thread.sleep(4000);
		// Click the submit button to complete the file upload process
		driver.findElement(By.id("fileSubmit")).click();
	System.out.println("successful");
		
	}

}
