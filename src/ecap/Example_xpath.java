package ecap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_xpath {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("vishnu122@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("vish123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();		
		
		
			
		

	}

}
