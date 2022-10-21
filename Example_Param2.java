package Testingexample;

import org.testng.annotations.Test;

public class Example_Param2 {
	@Test(priority=1)
	public void login() {
		System.out.println("Hello, I am login from Example_Param1 class");
	}
	@Test(priority=2)
	public void sendEmail() {
		System.out.println("Hello, I am sendEmail from Example_Param1 class");
	}
	@Test(priority=2)
	public void logout() {
		System.out.println("Hello, I am logout from Example_Param1 class");
	}
	@Test(priority=3)
	public void thosar() {
		System.out.println("thaks for visit");
	}
	@Test(priority=2)
	public void bb() {
		System.out.println("thaks for bb");
	}
	
}
/**

By Default each @Test has priority as 0
lowest priority will get executed first
*/
  
	  
  

