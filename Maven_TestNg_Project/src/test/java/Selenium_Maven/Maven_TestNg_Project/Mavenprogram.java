package Selenium_Maven.Maven_TestNg_Project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Mavenprogram {
 @Test(priority=4)
 public void verifymousehover() {
 
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://omayo.blogspot.com/");
	 List<WebElement> elements=driver.findElements(By.xpath("//input[@type='radio']"));
	 System.out.println("Total no of radio button are: "+elements.size());
	 
 }
 
 @Test(priority=3)
 public void A() {
	 
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://omayo.blogspot.com/");
	 List<WebElement>elements=driver.findElements(By.xpath("//input[@type='radio']"));
	 for(int i = 0; i<elements.size(); i++) {
		 System.out.println("radio button are: "+elements.get(i).getAttribute("value"));
	 }
 }
 @Test(priority=1)
	 public void C () {
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://omayo.blogspot.com/");
WebElement btn=driver.findElement(By.xpath("//input[@value='female']"));
btn.click();

 }

 @Test(priority=2)
 public void B () {
	 
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://omayo.blogspot.com/");
	 WebElement btn=driver.findElement(By.xpath("//input[@value='female']"));
	 btn.click();
	 
	 if (btn.isSelected()) {
		 System.out.println("Elemetn is selected");
	 }else {
		 System.out.println("Elemetn is  not selected");
	 }



	 
	 
	 
}
}