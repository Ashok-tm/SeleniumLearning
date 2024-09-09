import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OmayoBlogSpotTesting {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int numberoflinks = links.size();
		System.out.println("numberoflinks:" + numberoflinks);
		List<WebElement> textarea = driver.findElements(By.tagName("p"));
		int numberoftextarea = textarea.size();
		System.out.println("numberoftextarea:" + numberoftextarea);
		List<WebElement> password = driver.findElements(By.tagName("input"));
		int totalnumberofpassword = password.size();
		System.out.println("totalnumberofpassword:" + totalnumberofpassword);
		List<WebElement> RadioButtons = driver.findElements(By.tagName("radio"));
		int totalnumberofRadioButtons = RadioButtons.size();
		System.out.println("totalnumberofRadioButtons:" + totalnumberofRadioButtons);
//	int radiobtn= driver.findElements(By.xpath("//input[@type='radio']"));

//	List<WebElement> checkboxes= driver.findElements(By.tagName("input"));
//	int totalnumberofcheckboxes=checkboxes().size();
//	System.out.println("totalnumberofcheckboxes :"+totalnumberofcheckboxes);
	}

}
