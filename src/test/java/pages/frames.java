package pages;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.apache.commons.io.FileUtils;

public class frames {

	@Test
	public void iframe() throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Adarsh Gowda\\OneDrive\\Documents\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.webdriveruniversity.com/IFrame/index.html");
	    driver.manage().window().maximize();
	    driver.switchTo().frame("frame");
	    driver.findElement(By.id("button-find-out-more")).click();
	    TakesScreenshot scrShot =((TakesScreenshot)driver);
	  //Call getScreenshotAs method to create image file
	  File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
	  String fileWithPath = "C:\\Users\\Adarsh Gowda\\OneDrive\\Desktop\\TestNG\\src\\test\\java\\pages\\homePageScreenshot.png";
	//Move image file to new destination
	  File DestFile=new File(fileWithPath);
	  //Copy file at destination
	  FileUtils.copyFile(SrcFile, DestFile);
	 // File file =.getScreenshotAs(OutputType.FILE);
	 // String screenshotBase64 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
	    File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	    String path = "C:\\Users\\Adarsh Gowda\\OneDrive\\Desktop\\TestNG\\src\\test\\java\\pages\\homePage.png";
	    File desti = new File(path);
	    FileUtils.copyFile(new File(path), file);
	    
    
	}
}
