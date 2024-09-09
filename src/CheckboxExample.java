import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxExample {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
	List <WebElement> elements=driver.findElements(By.xpath("//input[@type='checkbox']"));
	System.out.println("No of elements are : "+elements.size());
	
	for (int i=0;i<elements.size();i++ ) {
		System.out.println("Name of check box is :"+elements.get(i).getAttribute("value"));
		
		WebElement box=driver.findElement(By.xpath("//input[@id='checkbox1']"));
		box.click();
			
		if (box.isSelected()) {
			System.out.println("checkbox is selected : ");
		}else {	
			System.out.println("checkbox is not selected :");
		
	}
	}
	}
}


	
	
