import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExamplesForTagName {

	public static void main(String[] args) {

WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.amazon.in/");
List<WebElement> links=driver.findElements(By.tagName("a"));



int linksCount= links.size();
System.out.println("linksCount:"+linksCount);


//By using for loop menthod

for (int i=0; i<linksCount;i++)
{
System.out.println(driver.findElements(By.tagName("a")).get(i).getText());
//driver.findElement(By.xpath("//input[contains(@placeholder, 'Search Amazon.in')]")).sendKeys("CRICKET BAT");


//
//driver.get("https://omayo.blogspot.com/");
//int data= driver.findElements(By.tagName("a")).size();
//System.out.println("data: "+data);
//List<WebElement> noofRadiobtn=driver.findElements(By.xpath("//input[type='radio']"));
//
////int totalnoofradiontn=radiobtn.size();
//
////System.out.println("totalnoofradiontn: "+ totalnoofradiontn);


//Using by contains method
////input[contains(@placeholder, 'Sear')]

//
}
	}

}
