package pages;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testng_annotations {
    WebDriver driver = new ChromeDriver();
@BeforeTest
public void setBrowser() {
	System.out.println("Before class");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Adarsh Gowda\\OneDrive\\Documents\\Downloads\\chromedriver.exe");
	driver.get("https://webdriveruniversity.com/Login-Portal/index.html");
}

@BeforeClass
public void windowSetup() {
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
    //driver.manage().addCookie(dd);
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	System.out.println("Before Method");
}


@BeforeMethod
public void launch() {
    
	WebElement username=driver.findElement(By.id("text"));
	username.clear();
	username.sendKeys("username");
	boolean value = username.isDisplayed();
	WebElement password=driver.findElement(By.id("password"));
	password.clear();
	password.sendKeys("password");
	driver.findElement(By.tagName("button"));
	System.out.println("Before Test");
}

@Test
public void login() {
    String value = driver.getTitle();
    System.out.println(" Test");
	//Assert.assertEquals("sdkkd", value);
}


@AfterTest
public void sc()
{ 
	//String name =driver.getCurrentUrl();
	System.out.println("After Test");
}

@AfterMethod
public void clear()
{
	String name =driver.getWindowHandle();
	System.out.println(name);
	System.out.println("After Method");
}

@AfterClass(alwaysRun=false)
public void quite()
{
	driver.quit();
	System.out.println("After class");
}

}
