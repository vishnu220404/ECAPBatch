package ecap;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_exm1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(3000);
		/*driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(3000);
		Alert a2=driver.switchTo().alert();
		a2.dismiss();*/ // to give cancel button 

		// to get alert by using name 
		driver.findElement(By.id("promtButton")).click();
		Thread.sleep(3000);
		Alert alert=driver.switchTo().alert();
		alert.sendKeys("vishnu");
		Thread.sleep(3000);
		alert.accept();
	

	}

}
