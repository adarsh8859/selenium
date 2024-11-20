package pages;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class scroll {
	@Test
	public void scrolls() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Adarsh Gowda\\OneDrive\\Documents\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Scrolling/index.html");
	    driver.manage().window().maximize();
	    WebElement zone = driver.findElement(By.id("zone1"));
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,848)", "");
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    driver.quit();
	}

}
