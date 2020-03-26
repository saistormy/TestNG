package ParallelTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class ParallelTestDemo {

	WebDriver driver;
	@Test
	public void test1() throws Exception
	{
		System.out.println("test1 | "+Thread.currentThread().getId());
		
		System.setProperty("webdriver.chrome.driver", "D:\\007\\Selenium\\JarFiles\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://google.com");
		Thread.sleep(3000);
		driver.close();
		
	}
	
	@Test
	public void test2() throws Exception
	{
		System.out.println("test2 | "+Thread.currentThread().getId());
		
		System.setProperty("webdriver.ie.driver", "D:\\007\\Selenium\\JarFiles\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("http://selenium.com");
		Thread.sleep(3000);
		driver.close();
	}
	
	@Test
	public void test3() throws Exception
	{
		System.out.println("test3 | "+Thread.currentThread().getId());
		
		System.setProperty("webdriver.gecko.driver", "D:\\007\\Selenium\\JarFiles\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/register");
		Thread.sleep(3000);
		driver.close();
	}
	
	
	
	
}
