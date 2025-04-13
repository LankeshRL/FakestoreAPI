package fakestoreapi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basetest {
	protected WebDriver driver;
	
//	@BeforeClass
	public void driversetup(){
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Driver has been launched");
	}
	
//	@AfterClass
	public void teardown() {
		if (driver != null) {
			driver.quit();
			System.out.println("Driver has been closed");
		}
	}
	
//	@Test(priority = 0)
	public void launch(){
		driver.get("https://fakestoreapi.com/products");
//        String title = driver.getTitle();
//        Assert.assertTrue(title.contains("Google"), "Page title is incorrect!");
        System.out.println("Mentioned URL has been launched");
	}

}
