package Listenerpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners({Listenerpackage.ListenerImplementationdemo.class})
	public class AlwaysRunDemo {
		 WebDriver driver;
		
		@Test
		public void StartApp(){
			
			System.setProperty("webdriver.chrome.driver","D:\\007\\Selenium\\JarFiles\\chromedriver.exe");
			 
			driver = new ChromeDriver();
			 driver.get("http://demowebshop.tricentis.com/login");
			 driver.manage().window().maximize();
		}
		@Test(dependsOnMethods="StartApp")
		public void CheckTitle(){
			//driver = new ChromeDriver();
			String title=driver.getTitle();
			
			System.out.println("page title"+title);
			Assert.assertEquals(title, "Demo Web Shop");
		}
		@Test(dependsOnMethods="CheckTitle")
		public void LoginApp(){
			//driver= new ChromeDriver();
			driver.findElement(By.id("Email")).sendKeys("saishankar522@gmail.com");
			 driver.findElement(By.name("Password")).sendKeys("Momdadme@007");
			 driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
			 System.out.println("Logged in Successfully");
		}
		@Test(dependsOnMethods="LoginApp")
		public void LogOut(){
			//driver = new ChromeDriver();
			driver.findElement(By.linkText("Log out")).click();
			System.out.println("Logout Successfully");
		}
		@Test(dependsOnMethods="LogOut",alwaysRun=true)
		public void closebrowser(){
			driver.close();
		}
	}

	

