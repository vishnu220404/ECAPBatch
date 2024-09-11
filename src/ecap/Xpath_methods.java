package ecap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_methods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
        //x-path using starts-wit method
		//driver.findElement(By.xpath("//button[starts-with(@id,'u_0_5')]")).click();
        //x-path using contains method
		//driver.findElement(By.xpath("//input[contains(@name,'email')]")).sendKeys("vishnu@12234");
        //x-path using contains method with text () function
        //driver.findElement(By.xpath("//a[contains(text(),'Forgotten password?')]")).click();
		//x-path using and 
		driver.findElement(By.xpath("//input[@id='email' and @name='email']")).sendKeys("vishnu1234");
		//x-path using or 
		//driver.findElement(By.xpath("//input[@id='email' or @name='email']")).sendKeys("vishnu1234");

	}

}
