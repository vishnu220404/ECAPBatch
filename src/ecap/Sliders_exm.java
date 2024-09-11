package ecap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sliders_exm {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		Thread.sleep(3000);
	    Actions act=new Actions(driver);
	    WebElement slider=driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default'][1]"));
        System.out.println(slider.getLocation());
        act.dragAndDropBy(slider, 100, 0).perform();
        System.out.println("after operatiom "+"  "+slider.getLocation());
        Thread.sleep(3000);
        Actions act1=new Actions(driver);
	    WebElement slider1=driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default'][2]"));
	    System.out.println(slider1.getLocation());
	    act.dragAndDropBy(slider1, -200, 0).perform();
	    System.out.println("after operations"+" "+slider1.getLocation());
	    
	    
	    
	}

}