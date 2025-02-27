package sampletest;
//Importing necessary libraries for Selenium WebDriver and managing WebElement interactions.
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyDemo {

	public static void main(String[] args) {
		// Setting the path for the GeckoDriver, required to run Firefox WebDriver.
		System.setProperty("webdriver.gecko.driver","C:\\Users\\santh\\Desktop\\projects\\selenium\\geckodriver-v0.35.0-win64\\geckodriver.exe");
		// Creating an instance of FirefoxDriver to interact with Firefox browser.
		WebDriver driver = new FirefoxDriver();
		// Configuring an implicit wait to give the browser time to find elements before throwing an exception.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// Navigating to the specified URL.
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		// Finding all the rows in the table using XPath.
		List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr"));
		// Printing the number of rows found in the table.
		System.out.println("number of rows:"+ rows.size());
		// Looping through each row to fetch the data.
		for(int r=1; r<=rows.size();r++)
		{
		 // Finding the 'name' cell in the current row (first column).
			WebElement name = driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr["+r+"]//td[1]"));
		// Checking if the current row is the 10th row.
			if(r==10 )
			{
		 // Printing the name from the 10th row.
				System.out.println(name.getText());
		// Breaking the loop after printing the 10th row's name.
				break;
			}
		}
	}

}
