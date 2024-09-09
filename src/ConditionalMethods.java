
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ConditionalMethods {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.getCurrentUrl();
//		IsDisplayed()
		
//		WebElement logo=driver.findElement(By.xpath("//img[@lt='nopcommerce demo store']"));
//		System.out.println("Display status of logo:"+logo.isDisplayed());
		
//		boolean status=driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
//		System.out.println("Enable status:"+status);
	}

}
