import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day16 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
//		get total number of links in a webpage
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total No Of Links are: " + links.size());

	}
}
