package pages;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class waits {
	
	@Test
	public void implicwaits() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Adarsh Gowda\\OneDrive\\Documents\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("c/Ajax-Loader/index.html");
	    driver.manage().window().maximize();
	    int time = 3;
	    WebElement ele = driver.findElement(By.xpath("//*[text()=\"CLICK ME!\"]"));
	   // driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()=\"CLICK ME!\"]")));
	    /* alertIsPresent(),
	    elementSelectionStateToBe()
	    elementToBeClickable()
	    elementToBeSelected()
	    frameToBeAvaliableAndSwitchToIt()
	    invisibilityOfTheElementLocated()
	    invisibilityOfElementWithText()
	    presenceOfAllElementsLocatedBy()
	    presenceOfElementLocated()
	    textToBePresentInElement()
	    textToBePresentInElementLocated()
	    textToBePresentInElementValue()
	    titleIs()
	    titleContains()
	    visibilityOf()
	    visibilityOfAllElements()
	    visibilityOfAllElementsLocatedBy()
	    visibilityOfElementLocated()
	    */
	    Wait<WebDriver> waits = new FluentWait<WebDriver>(driver)
	    		  .withTimeout(Duration.ofSeconds(5))
	    		  .pollingEvery(Duration.ofSeconds(1))
	    		  .ignoring(NoSuchElementException.class);
	    waits.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()=\"CLICK ME!\"]")));
	    driver.quit();
	    }
}