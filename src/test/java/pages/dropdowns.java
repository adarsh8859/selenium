package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class dropdowns {
	private static final String WebElement = null;
	WebDriver driver = new ChromeDriver();

	@BeforeClass(alwaysRun=true)
	public void lauch()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Adarsh Gowda\\OneDrive\\Documents\\Downloads\\chromedriver.exe");
		driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
	    driver.manage().window().maximize();
	}
	@Test(invocationCount=2,priority=0,description="dropdown",alwaysRun=false)
	public void drop() throws InterruptedException {
		WebElement dropdown = driver.findElement(By.id("dropdowm-menu-1"));
		Select sc = new Select(dropdown);
		sc.selectByValue("python");
		Thread.sleep(3000);
		sc.selectByIndex(1);
		Thread.sleep(2000);
		sc.selectByVisibleText("JAVA");
		Thread.sleep(3000);
	}
	@Test
	public void checkboxes() throws InterruptedException {
		List<WebElement> checkboxes = driver.findElements(By.xpath("//*[@type=\"checkbox\"]"));
	
		for(int i=0; i<checkboxes.size(); i++)
		{
			if(checkboxes.get(i).isSelected()== false)
			{
                   System.out.println("Checkbox is displayed at index : " + i + " Clicking on it now");
                        checkboxes.get(i).click();
                        System.out.println(checkboxes.get(i).getText());
                        Thread.sleep(3000);
			}
		}
			}
	@Test
	public void radioButton() throws InterruptedException {
		List<WebElement> checkboxes = driver.findElements(By.xpath("//*[@type=\"radio\"]"));
	
		for(int i=0; i<checkboxes.size(); i++)
		{
			if(checkboxes.get(i).isSelected()== false)
			{
                   System.out.println("Checkbox is displayed at index : " + i + " Clicking on it now");
                        checkboxes.get(i).click();
                        System.out.println(checkboxes.get(i).getAttribute("value"));
                        Thread.sleep(3000);
			}
		}
			}
	@AfterClass
	public void quit() {
		driver.quit();
	}

}
