package testNgpackage;

import org.testng.annotations.Test;

public class PriorityDemo {
	
	
	@Test(description="Testcase to start application")
	public void StartApp(){
		System.out.println("Start Application");
	}
	
	@Test(priority=1,description="TestCase to LogIN")//by using priority we can set the position of methods in an order...By default it chooses Alphabetical Order.
	public void LoginApp(){
		System.out.println("Successfull Login");
	}
	
	@Test(priority=2,description="TestCase to LogOut")//We can Also Add Description 
	public void SignOff(){
		System.out.println("Successfull Logout");
	}
}
