import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoClass10 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.id("email")).sendKeys("ashokashhu94@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Ashok@123");
		driver.findElement(By.linkText("https://www.facebook.com/r.php?locale=en_GB&display=page/")).click();
//		((WebElement) driver.findElements(By.className("_97w4"))).click();
		
//		driver.findElement(By.name("login")).click();

	}
}