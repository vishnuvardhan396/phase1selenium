package seleniumscripts1;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class amazon {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(7000);
		driver.findElement(By.xpath("//a[@id='nav-link-accountList']")).click();
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("vishnuvardhangopavaram@gmail.com");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Hemanth143@#");
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		Thread.sleep(3000);
		
		WebElement e1 = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		e1.click();
		Thread.sleep(3000);
		Select obj = new Select(e1);
		obj.selectByIndex(14);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("I phone 13");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal'][1]")).click();
		Thread.sleep(3000);
		for (String handle : driver.getWindowHandles()) {
		    	driver.switchTo().window(handle);
		}
	
		driver.findElement(By.xpath("//div[@id='add-to-wishlist-button-group']")).click();
	
		Thread.sleep(7000);
       driver.close();		
		
	}
}


