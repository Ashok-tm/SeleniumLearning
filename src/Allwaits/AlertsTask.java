package Allwaits;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsTask {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://the-internet.herokuapp.com/javascript_alerts");

//Normal Alert
//WebElement btn=driver.findElement(By.xpath("//button[@onclick=\"jsAlert()\"]"));
//btn.click();
//Thread.sleep(3000);
//driver.switchTo().alert().accept();
////Confirmation Alert

//WebElement js=driver.findElement(By.xpath("//button[@onclick=\"jsConfirm()\"]"));
//js.click();
//Thread.sleep(3000);
////driver.switchTo().alert().accept();
//driver.switchTo().alert().dismiss();

////Prompat Alert
WebElement js1=driver.findElement(By.xpath("//button[@onclick=\"jsPrompt()\"]"));
js1.click();
Thread.sleep(3000);

Alert al=driver.switchTo().alert();
al.sendKeys("kumar");
Thread.sleep(2000);
al.accept();
////al.dismiss(); 
	}

}
