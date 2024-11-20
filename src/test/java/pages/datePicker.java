package pages;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class datePicker {
	@Test
	public void lauch() throws InterruptedException
	{
		
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Adarsh Gowda\\OneDrive\\Documents\\Downloads\\chromedriver.exe");
		driver.get("https://webdriveruniversity.com/Datepicker/index.html");
	    driver.manage().window().maximize();
	    driver.findElement(By.id("datepicker")).click();
	    String date = driver.findElement(By.xpath("(//*[@class=\"datepicker-switch\"])[1]")).getText();
	    System.out.println(date);
	    String month = date.split(" ")[0].trim();
	    String year = date.split(" ")[1].trim();
	    System.out.println(year + " "+ month);
	    while(!(month.equals("October") && year.equals("2025")))
        {
	    	driver.findElement(By.xpath("(//*[text()=\"»\"])[1]")).click();
	    	date = driver.findElement(By.xpath("(//*[@class=\"datepicker-switch\"])[1]")).getText();
	 	    System.out.println(date);
	 	    month = date.split(" ")[0].trim();
	 	    year = date.split(" ")[1].trim();
	 	   System.out.println(year + " "+ month);
	 	     
        }
	    driver.findElement(By.xpath("//*[text()=\"27\"]")).click();
	    driver.quit();
	    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy('//dd');
	    
	    Thread.sleep(3000);
	}
}

 