package Allwaits;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHerokuappTask {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.partialLinkText("Sortable Data")).click();
		
		
		WebElement ele2 = driver.findElement(By.xpath("//table[@id=\"table1\"]/tbody/tr[1]/td[2]"));
	System.out.println(ele2.getText());
	WebElement ele3 = driver.findElement(By.xpath("//table[@id=\"table1\"]/tbody/tr[4]/td[3]"));
	System.out.println(ele3.getText());
		
//		List <WebElement>ele1=driver.findElements(By.className("table"));
//		System.out.println("Total no of tables: "+ele1.size());
//		List<WebElement> ele=driver.findElements(By.xpath("//table[@id=\"table1\"]"));
//		System.out.println("total no of tables: " +ele.size());
	}
}
	
