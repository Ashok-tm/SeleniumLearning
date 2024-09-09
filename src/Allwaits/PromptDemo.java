package Allwaits;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
        WebElement promElement=driver.findElement(By.id("prompt"));
        promElement.click();
        Thread.sleep(4000);
        
        Alert al=driver.switchTo().alert();
       al.sendKeys("Kumar");
       Thread.sleep(2000);
//        al.accept();
       al.dismiss();
        
        
	}

}
