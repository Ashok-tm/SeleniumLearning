import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownsDemo {

	public static void main(String[] args) {
 WebDriver driver=new ChromeDriver();
 driver.manage().window().maximize();	
 driver.get("https://demo.automationtesting.in/Register.html");
List<WebElement> dropdownElements=driver.findElements(By.tagName("select"));
System.out.println("Total no dropdowns are:"+dropdownElements.size());
WebElement skillElements=driver.findElement(By.xpath("//select[@id=\"Skills\"]"));
Select s= new Select(skillElements);
s.selectByIndex(4);
//s.selectByValue("Backup Management");
//s.selectByVisibleText("CSS");
WebElement yeardropdown=driver.findElement(By.xpath("//select[@id=\"yearbox\"]"));
Select s2=new Select(yeardropdown);
s2.selectByIndex(8);
////s2.selectByValue("1923");
////s2.selectByVisibleText("1995");
//
WebElement monthdropdrown=driver.findElement(By.xpath("//select[@placeholder=\"Month\"]"));
Select s1=new Select(monthdropdrown);
////s1.selectByIndex(3);
s1.selectByValue("March");
////s1.selectByVisibleText("June");

WebElement daydropdown=driver.findElement(By.xpath("//select[@id=\"daybox\"]"));
Select s3=new Select(daydropdown);
////s3.selectByIndex(26);
////s3.selectByValue("23");
s3.selectByVisibleText("26");

WebElement countrydropdown=driver.findElement(By.xpath("//select[@id='country']"));
Select s4=new Select(countrydropdown);
//s4.selectByIndex(5);
//s4.selectByValue("Japan");
s4.selectByVisibleText("New Zealand");




//WebElement languagedropdown=driver.findElement(By.xpath("//select[@id=\'Languages\']"));  
//Select s5=new Select(languagedropdown);
//s5.selectByIndex(8);
	}
}
