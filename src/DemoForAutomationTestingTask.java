import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoForAutomationTestingTask {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Ashok");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Tamatam");
		driver.findElement(By.xpath("//textarea[@rows='3']")).sendKeys("Kukatpally");
		driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("ashokashhu94@gmail.com");
		driver.findElement(By.xpath("//input[@type=\"tel\"]")).sendKeys("9848564799");
//		driver.findElement(By.className("//label[@class=\"col-md-3 col-xs-3 col-sm-3 control-label"]")).click("Male");"
		driver.findElement(By.xpath("//input[@type=\"radio\"]")).click();
		driver.findElement(By.xpath("//input[@id='checkbox1']")).click();
		driver.findElement(By.xpath("//div[@id=\"msdd\"]"));
}

}