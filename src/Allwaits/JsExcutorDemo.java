package Allwaits;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsExcutorDemo {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.mercurytravels.co.in/");
Thread.sleep(2000);
//By Using window.scrollBy
//JavascriptExecutor js= ((JavascriptExecutor)driver);
//js.executeScript("window.scrollBy(0,500)");
//Thread.sleep(2000);
//js.executeScript("window.scrollBy(0,500)");
WebElement ele=driver.findElement(By.linkText("International Holidays"));
JavascriptExecutor js= ((JavascriptExecutor)driver); 
js.executeScript("arguments[0].click();", ele);
	}
}
