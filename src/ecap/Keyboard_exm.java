package ecap;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_exm {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("https://text-compare.com/");
		Thread.sleep(3000);
driver.findElement(By.xpath("//textarea[@name='text1']")).sendKeys("welcome to the class");
		Actions act=new Actions(driver);
		//selecting entire text CTRl A
        act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
        //copying the text CTRL C
        act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
        //TAB>> shift to 2 tab
        act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
        //paste the code CTRL V
        act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
        
        
       
       
  	}

}
