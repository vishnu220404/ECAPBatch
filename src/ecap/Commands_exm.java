package ecap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Commands_exm {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		System.out.println(driver.getTitle());//returns title of the webpage 
		System.out.println(driver.getCurrentUrl());//returns current url
		System.out.println(driver.getWindowHandle());//returns id of single browser window 

	}

}
