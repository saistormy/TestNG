package Groupspackage;

import org.testng.annotations.Test;

public class Test2 {
	
	@Test(groups={"regression"})
	public void testr2(){
		System.out.println("regression testcase2");
	}
	@Test(groups={"regression"})
	public void testr3(){
		System.out.println("regression testcase3");
	}
	@Test(groups={"smoke"})
	public void testr4(){
		System.out.println("smoke testcase4");
	}
}
