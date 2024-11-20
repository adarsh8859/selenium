package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.Login;
public class click {
	
	
@Test
public void seleniumclick ()
{
			
	    WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Adarsh Gowda\\OneDrive\\Documents\\Downloads\\chromedriver.exe");
		driver.get("https://webdriveruniversity.com/Click-Buttons/index.html");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
	   // driver.findElement(seleClick).click();
	    //driver.switchTo().alert().dismiss();
		 WebElement seleClick = driver.findElement(By.xpath("//*[text()=\"CLICK ME!\"]"));
		 //WebElement closeOne = driver.findElement(By.xpath("body"));
	   // WebElement host = driver.findElement(seleClick);
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    //js.executeScript("alert(‘hello world’);");
	   js.executeScript("arguments[0].click();", seleClick);// Javascript click
	   js.executeScript("location.reload()");//refresh
	   Actions ac = new Actions(driver); // Action click
	   ac.moveToElement(seleClick).click();
	   driver.quit();
}

}
