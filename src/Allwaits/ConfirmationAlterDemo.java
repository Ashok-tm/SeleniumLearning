package Allwaits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationAlterDemo {

	public static void main(String[] args) throws InterruptedException {

		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://omayo.blogspot.com/");
		 
		  driver.findElement(By.xpath("//input[@id=\"confirm\"]")).click();
		  Thread.sleep(6000);
//		  driver.switchTo().alert().accept();
		  	driver.switchTo().alert().dismiss();
		  	
		 	}
	
	

}
