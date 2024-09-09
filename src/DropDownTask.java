import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownTask {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		driver.findElement(By.xpath("//button[@class=\"dropbtn\"]")).click();
		Thread.sleep(3000);
		
//        WebElement fish=driver.findElement(By.linkText("Facebook"));
//        fish.click();
//        WebElement cat=driver.findElement(By.partialLinkText("Flipk")); 
//        cat.click();
//       WebElement fish= driver.findElement(By.xpath("//a[@href=\"http://facebook.com\"]"));
//		fish.click();
		WebElement dog=driver.findElement(By.xpath("//a[contains(text(),'Gmail')]"));
		dog.click();
	}

}

