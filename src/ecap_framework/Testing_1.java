package ecap_framework;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testing_1 {
	@BeforeMethod // works for every test cases
	public void launchbrowser() {
		System.out.println("Browser is launched");
	}
	@AfterMethod 
	public void closebrowser() {
		System.out.println("Browser is closed");
	}
	@Test
	public void login() {
		System.out.println("logged in");
	}
	@Test
	public void logout() {
		System.out.println("logged out");
	}

}
