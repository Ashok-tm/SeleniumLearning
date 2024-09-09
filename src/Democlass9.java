import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Democlass9 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=cms/demo");
//		driver.get("https://demo.opencart.com/");
//	driver.get("https://omayo.blogspot.com/");
//		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
//		Thread.sleep(2000);
//		driver.findElement(By.id( "class=gsc-input").sendKeys("Mac");
		driver.findElement(By.linkText("Marketplace")).click();
		driver.findElement(By.partialLinkText("Market")).click();
	} 

}
