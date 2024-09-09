package Allwaits;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableDemo2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
//		WebElement ak=driver.findElement(By.xpath("//table[@id=\"table1\"]/thead/tr[1]/th[3]"));
//		System.out.println(ak.getText());
		
		Thread.sleep(3000);
		List<WebElement> aru=driver.findElements(By.xpath("//table[@id=\"table1\"]/thead/tr/th"));
		for (int j = 0; j < aru.size(); j++) {
			System.out.print(" "+aru.get(j).getText());
		}
		Thread.sleep(3000);
		List<WebElement> as=driver.findElements(By.xpath("//table[@id=\"table1\"]/tbody/tr"));
		for (int i = 0; i <as.size(); i++) {
		System.out.println(" "+as.get(i).getText());
		}
}
}
