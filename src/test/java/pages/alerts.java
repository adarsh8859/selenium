package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class alerts {
	@Test
	public void alert () {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Adarsh Gowda\\OneDrive\\Documents\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Popup-Alerts/index.html");
	    driver.manage().window().maximize();
	    driver.findElement(By.id("button1")).click();
	    Alert ac = driver.switchTo().alert();
	    ac.accept();
	    driver.findElement(By.id("button4")).click();
	    ac.dismiss();
	    driver.findElement(By.id("button2")).click();
	    ac.accept();
	    
	}

}
