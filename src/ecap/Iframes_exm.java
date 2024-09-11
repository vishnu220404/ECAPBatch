package ecap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes_exm {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("https://ui.vision/demo/webtest/frames/");
		Thread.sleep(3000);
	//frame 1
		WebElement frame1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
	    driver.switchTo().frame(0);
	    driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Dheeraj Bobby ");
	    driver.switchTo().defaultContent();//go back to page
	    WebElement frame2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
	    driver.switchTo().frame(1);
	    driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Dheeraj Bobby ");
	    driver.switchTo().defaultContent();//go back to page

	}

}
