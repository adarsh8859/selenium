package pages;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.formula.functions.Column;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.util.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.google.common.collect.Iterables;
public class excelData {

	@DataProvider(name="accounts")
	public Object[][] dataReader() throws Exception {
		
		File file = new File ("C:\\Users\\Adarsh Gowda\\OneDrive\\Documents\\ReadData.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		for (int i=0; i<sheet.getLastRowNum(); i++)
		{
			for( int j=0;j<sheet.getRow(0).getLastCellNum();j++)
			{
				data[i][j]=sheet.getRow(i+1).getCell(j).toString();
				System.out.println(data[i][j]);
			}
		}
		return data;
	}
	   @Test(dataProvider="accounts")
		public void login(String Username, String Password) throws IOException
		{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Adarsh Gowda\\OneDrive\\Documents\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Login-Portal/index.html?");
	    driver.manage().window().maximize();
			WebElement username=driver.findElement(By.id("text"));
			username.clear();
			username.sendKeys(Username);
			boolean value = username.isDisplayed();
			WebElement password=driver.findElement(By.id("password"));
			password.clear();
			password.sendKeys(Password);
			//driver.findElement(By.tagName("button")).click();
			TakesScreenshot ts = ((TakesScreenshot)driver);
			String path = "C:\\Users\\Adarsh Gowda\\OneDrive\\Desktop\\TestNG\\src\\test\\java\\pages\\exceldata.png";
			File fs = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(new File(path), fs);
			driver.quit();
		}
	
		@DataProvider(name="accunts")
		public Object[][] getdata() throws Exception
		{
			Object[][] data = dataReader();
			return data;
	    };
		
}