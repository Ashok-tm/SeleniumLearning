import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoforRadioBtn {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
//		no of radio buttons
		List<WebElement> elements = driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println("Total no of radio Buttons are : " + elements.size());
		
//		name of radio buttons
	for (int i=0 ;i<elements.size();i++) {
	System.out.println("Name of radio button is : "+elements.get(i).getAttribute("value"));
	
//	click on radio btn
	WebElement btn=driver.findElement(By.xpath("//input[@value='FeMale']"));
	btn.click();

	if(btn.isSelected()) {
		System.out.println("Element is selected");
		
	} else {
		System.out.println("Element is not selected");

	}
	}

}
}
