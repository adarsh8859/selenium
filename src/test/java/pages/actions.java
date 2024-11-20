package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class actions {

	@Test
	public void action() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Adarsh Gowda\\OneDrive\\Documents\\Downloads\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://webdriveruniversity.com/Actions/index.html");
    driver.manage().window().maximize();
    Actions ac= new Actions(driver);
    WebElement source = driver.findElement(By.id("draggable"));
    WebElement desti = driver.findElement(By.id("droppable"));
    WebElement dc = driver.findElement(By.id("double-click"));
    WebElement hold = driver.findElement(By.id("click-box"));
    WebElement hover = driver.findElement(By.xpath("//*[text()=\"Hover Over Me First!\"]"));
    ac.dragAndDrop(source, desti).perform();
    ac.contextClick(dc).perform();
    ac.doubleClick(dc).build().perform();
    ac.clickAndHold(hold).build().perform();
    ac.moveToElement(hover).build().perform();
    Thread.sleep(5000);
    driver.quit();
	}
}
