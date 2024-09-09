import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day16Task3 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		
//		Select particular link by using different locators---click on "Home Link"
//		driver.findElement(By.partialLinkText("Home")).click();

		// Using by contains method
		WebElement ashok = driver.findElement(By.xpath("//a[contains(text(),\"Home\")]"));
		ashok.click();

	}
}
