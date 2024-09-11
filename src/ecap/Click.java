package ecap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Click {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("https://demoqa.com/buttons");
		Thread.sleep(3000);
		WebElement doubleclickbtn=driver.findElement(By.id("doubleClickBtn"));
		WebElement rightclickbtn=driver.findElement(By.id("rightClickBtn"));
		Thread.sleep(3000);
	    Actions act=new Actions(driver);
	    act.doubleClick(doubleclickbtn).perform();
	    Thread.sleep(3000);
	    act.contextClick(rightclickbtn).perform();
	    Thread.sleep(3000);
	    
	    
		

	}

}
