package Allwaits;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
//		driver.findElements(By.xpath("//table[@id=\"table1\"]"));
		WebElement fish= driver.findElement(By.id("table1"));
		List<WebElement> rt= driver.findElements(By.tagName("table"));
		System.out.println("Total No of tables:" +rt.size());
		System.out.print(fish.getText());
//		WebElement ele=driver.findElement(By.xpath("//*[@id=\"table1\"]/tbody/tr[1]"));
//			WebElement ele1=driver.findElement(By.xpath("//*[@id=\"table1\"]/tbody/tr[2]"));
//			WebElement ele2=driver.findElement(By.xpath("//*[@id=\"table1\"]/tbody/tr[3]"));
//			WebElement ele3=driver.findElement(By.xpath("//*[@id=\"table1\"]/tbody/tr[4]"));
//		   System.out.println(ele.getText());
//		   System.out.println(ele1.getText());
//		   System.out.println(ele2.getText());
//		   System.out.println(ele3.getText());
		
		

	}
}

