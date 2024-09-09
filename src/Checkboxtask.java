import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxtask {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("Password123");
		driver.findElement(By.id("submit")).click();
		driver.findElement(By.linkText("CONTACT")).click();
		driver.findElement(By.className("wpforms[fields][0][first]")).sendKeys("Ashok");
		driver.findElement(By.id("\"wpforms-161-field_0-last\"")).sendKeys("Kumar");
		driver.findElement(By.id("\"wpforms-161-field_1\"")).sendKeys("ashok@gamil.com");
		driver.findElement(By.id("\"wpforms-161-field_2\"")).sendKeys("hi");
		
	}

}
