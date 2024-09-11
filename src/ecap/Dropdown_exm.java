package ecap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_exm {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(3000);
		WebElement month =driver.findElement(By.xpath("birthday_month"));
		Select se=new Select(month);
		Thread.sleep(3000);
		se.selectByVisibleText("Jun");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//select[@name='birthday_day']"));
		se.selectByVisibleText("23");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//select[@name='birthday_year']"));
		se.selectByVisibleText("2020");
		Thread.sleep(3000);
		
		
		
		
		

	}

}
