package ecap;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_up_down_exm {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		// for scroll down we use javascript executor
	    JavascriptExecutor js=( JavascriptExecutor )driver;
	    js.executeScript("window.scrollBy(0,400)");
	    Thread.sleep(3000);
	    //for scroll up
	    js.executeScript("window.scrollBy(0,-400)");
	    Thread.sleep(3000);
		

	}

}
