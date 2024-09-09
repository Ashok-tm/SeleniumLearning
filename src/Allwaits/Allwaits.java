package Allwaits;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Allwaits {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading");
//		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(6000));
        WebElement example=driver.findElement(By.xpath("//a[@href=\"/dynamic_loading/1\"]"));
        example.click();
        WebElement btn=driver.findElement(By.xpath("//button[contains(text(),'Start')]"));
        btn.click();    
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofMillis(6000));
        String data= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[contains(text(),'Hello World')]"))).getText();
        System.out.println(data);
        
//  driver.get("https://omayo.blogspot.com/");
//  driver.findElement(By.className("dropbtn")).click();
//	WebElement
//	 btn=driver.findElement(By.xpath("//a[@href=\"http://facebook.com\"]"));
//	Thread.sleep(3000);
//btn.click();
//	WebElement flip= driver.findElement(By.xpath("//a[@href=\"http://flipkart.com/\"]"));
//	flip.click();
			

}
}