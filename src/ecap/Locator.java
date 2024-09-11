package ecap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		//driver.findElement(By.linkText("create new account")).click();
		driver.findElement(By.partialLinkText("Create new")).click();
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("vishnu");
		driver.findElement(By.cssSelector("#password_step_input")).sendKeys("vish@123");
		driver.close();
	}

}
