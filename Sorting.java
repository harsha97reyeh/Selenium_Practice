package selenium_practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Sorting {
	public static void main(String[] args) {
		// Set the system property for GeckoDriver path
		System.setProperty("webdriver.gecko.driver","C:\\Users\\santh\\Desktop\\projects\\selenium\\geckodriver-v0.35.0-win64\\geckodriver.exe");
		// Initialize Firefox browser using WebDriver
		WebDriver driver = new FirefoxDriver();
		// Open the practice website with the dropdown list
		driver.get("https://practice.expandtesting.com/dropdown");
		// Locate the dropdown element by its ID and create a Select object for it
		Select d = new Select(driver.findElement(By.id("country")));
		// Create two ArrayLists: one to hold the original order and one to temporarily hold data for sorting
		ArrayList original = new ArrayList();
		ArrayList temp = new ArrayList();
		// Retrieve all the options from the dropdown
		List<WebElement> options=d.getOptions();
		// Loop through all the options and add their text (visible value) to both the original and temp lists
		for(WebElement option:options)
		{
		// Add option text to original list
		original.add(option.getText());
		// Add option text to temp list for sorting
		temp.add(option.getText());
		}
		// Print out the original order of the dropdown options
		System.out.println("Before sorting");
		// Print the original list
		System.out.println("Original list:"+original);
		// Print the temp list(no change)
		System.out.println("Temp list:"+temp);
		// Sort the temp list in ascending order
		Collections.sort(temp);
		System.out.println("after sorting");
		// Print the original list (no change)
		System.out.println("Original list:"+original);
		// Print the sorted list
		System.out.println("Temp list:"+temp);
		 // Compare the original list with the sorted temp list to check if the dropdown options are already sorted
		if(original.equals(temp))
		{	// If both lists are equal, the dropdown options are already sorted
			System.out.println("given list is sorted");
		}
		else {
			// If the lists are not equal, the dropdown options are not sorted
			System.out.println("Given List is not sorted");
		}
	}

}
