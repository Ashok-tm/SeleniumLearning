import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLoginFunction {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F/");
//WebElement email=driver.findElement(By.xpath("//input[@class="email"])");
		driver.findElement(By.id("Email")).sendKeys("ashokashhu94@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Ashok@123");
//driver.findElement(By.xpath("//input[@name=\"RememberMe"]\").click();"
		driver.findElement(By.xpath("//input[@name='RememberMe']")).click();
		driver.findElement(By.className("button-1")).click();

//login-button
	}

}
