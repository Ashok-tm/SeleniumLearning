import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demodrop {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Ashok");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Tamatam");
		driver.findElement(By.xpath("//textarea[@rows='3']")).sendKeys("Kukatpally");
		driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("ashokashhu94@gmail.com");
		driver.findElement(By.xpath("//input[@type=\"tel\"]")).sendKeys("9848564799");
		driver.findElement(By.xpath("//input[@type=\"radio\"]")).click();
		driver.findElement(By.xpath("//input[@id='checkbox1']")).click();
		driver.findElement(By.xpath("//div[@id=\"msdd\"]")).click();

		WebElement fish = driver.findElement(By.xpath("//div[@style=\"display: block;\"]/ul/li/a[contains(text(),'English')]"));
		fish.click();

		List<WebElement> dropdownElements = driver.findElements(By.tagName("select"));
		System.out.println("Total no dropdowns are:" + dropdownElements.size());
		WebElement skillElements = driver.findElement(By.xpath("//select[@id=\"Skills\"]"));
		Select s = new Select(skillElements);
		s.selectByIndex(4);

		WebElement yeardropdown = driver.findElement(By.xpath("//select[@id=\"yearbox\"]"));
		Select s2 = new Select(yeardropdown);
		s2.selectByIndex(8);

		WebElement monthdropdrown = driver.findElement(By.xpath("//select[@placeholder=\"Month\"]"));
		Select s1 = new Select(monthdropdrown);
		s1.selectByValue("March");

		WebElement daydropdown = driver.findElement(By.xpath("//select[@id=\"daybox\"]"));
		Select s3 = new Select(daydropdown);
		s3.selectByVisibleText("26");

		WebElement countrydropdown = driver.findElement(By.xpath("//select[@id='country']"));
		Select s4 = new Select(countrydropdown);
		s4.selectByVisibleText("New Zealand");
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("Navendra@123");
		driver.findElement(By.xpath("//input[@id=\"secondpassword\"]")).sendKeys("Navendra@123");
		driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
	}
}
