package sampletest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\santh\\Desktop\\projects\\selenium\\geckodriver-v0.35.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr"));
		System.out.println("number of rows:"+ rows.size());
		for(int r=1; r<=rows.size();r++)
		{
			WebElement name = driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr["+r+"]//td[1]"));
			
			if(r==10 )
			{
				System.out.println(name.getText());
				break;
			}
		}
	}

}
