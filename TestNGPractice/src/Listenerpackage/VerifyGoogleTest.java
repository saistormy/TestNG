package Listenerpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VerifyGoogleTest {
	WebDriver driver;
	
	
	@BeforeMethod
		public void SetBrowser()
	{
		System.setProperty("webdriver.chrome.driver","D:\\007\\Selenium\\JarFiles\\chromedriver.exe");
		 
		driver = new ChromeDriver();
		 driver.get("https://www.google.com/");
		 driver.manage().window().maximize();
		
	}
	@Test()
	public void Checkurl(){
		String Actual=driver.getCurrentUrl();
		Assert.assertEquals(Actual, "https://www.gogle.com/");
		System.out.println("checked url");
	}
	@Test()
	public void CheckLogo(){
		
		boolean view =driver.findElement(By.id("hplogo")).isDisplayed();
		Assert.assertTrue(view);
		
	}
	@AfterMethod()
	public void CloseBrowser(){
		
		driver.quit();
	}

}
