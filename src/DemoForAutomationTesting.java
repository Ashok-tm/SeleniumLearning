import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoForAutomationTesting {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys();
//		driver.findElement(By.className("form-control ng-pristine ng-invalid ng-invalid-required ng-touched")).sendKeys("ASHOK");
//		driver.findElement(By.xpath("//textarea[@rows="3"]")).sendKeys();
//		driver.get(By.xpath("//input[@type='text']");

	}

}
