package pages;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Login
{
	
WebDriver driver = new ChromeDriver();
@BeforeClass(alwaysRun=true)
public void lauch(String url)
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Adarsh Gowda\\OneDrive\\Documents\\Downloads\\chromedriver.exe");
	driver.get("https://webdriveruniversity.com/Login-Portal/index.html?");
    driver.manage().window().maximize();
}
@Test(priority=0,description="Login",dataProvider="accounts")
public void login(String Username, String Password)
{
	WebElement username=driver.findElement(By.id("text"));
	username.clear();
	username.sendKeys(Username);
	boolean value = username.isDisplayed();
	WebElement password=driver.findElement(By.id("password"));
	password.clear();
	password.sendKeys(Password);
	driver.findElement(By.tagName("button"));
	Assert.assertTrue(value);
}
@DataProvider(name="accounts")
public Object[][] getdata()
{
	return new Object[][] {
			{"testuser","test@123"},
			{"testuser","test@234"}
	};
}
@AfterClass
public void quit() {
	driver.quit();
}


}