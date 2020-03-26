package testNgpackage;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Grid_2 {
	
WebDriver driver;
String baseUrl,nodeUrl;
	
	
	@BeforeTest
	public void setUp() throws MalformedURLException
	{
		baseUrl="http://newtours.demoaut.com/";
		nodeUrl="http://172.24.84.35:4488/wd/hub";
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);
		driver = new RemoteWebDriver(new URL(nodeUrl),cap);
		

		
	}
	
	@Test()
	public void simpletest(){
		
		driver.get(baseUrl);
		Assert.assertEquals("Welcome: Mercury Tours", driver.getTitle());
		
	}
	@AfterTest()
	public void aftertest(){
		//driver.quit();
	}
	
	

}
