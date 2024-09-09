import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day16Task2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		// get name of every link
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("total no of links are: " + links.size());
		for (int i = 0; i < links.size(); i++) {
		String text = links.get(i).getText();
		System.out.println("total no of links are :" + text);

		}
	}

}
