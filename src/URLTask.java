import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class URLTask {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		WebElement Fish = driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]"));
		Thread.sleep(2000);
		Fish.sendKeys("Ashok");
		WebElement Dog = driver.findElement(By.xpath(("//input[@placeholder=\"Last Name\"]")));
		Dog.sendKeys("Tamatam");
		WebElement Parrot = driver.findElement(By.xpath("//textarea[@rows='3']"));
		Parrot.sendKeys("Kukatpally");
		WebElement Fox = driver.findElement(By.xpath("//input[@type=\"email\"]"));
		Fox.sendKeys("ashokashhu94@gmail.com");
		Thread.sleep(2000);
		WebElement Rat= driver.findElement(By.xpath("//input[@type=\"tel\"]"));
		Rat.sendKeys("9848564799");
		driver.findElement(By.xpath("//input[@type=\"radio\"]")).click();
		driver.findElement(By.xpath("//input[@id=\"checkbox1\"]")).click();
		Thread.sleep(3000);
//  WebElement fish=driver.findElement(By.xpath("//div[@style=\"display: block;\"]/ul/li/a[contains(text(),'Arabic')]"));
//   fish.click();
		WebElement SelectElement = driver.findElement(By.xpath("//select[@id=\"Skills\"]"));
		Select s = new Select(SelectElement);
		s.selectByIndex(10);
		WebElement CountryElement = driver.findElement(By.xpath("//select[@id=\"country\"]"));
		Select s2 = new Select(CountryElement);
//s2.selectByValue("India");
		s2.selectByVisibleText("India");
		WebElement YearDrop = driver.findElement(By.xpath("//select[@id=\"yearbox\"]"));
		Select s3 = new Select(YearDrop);
		s3.selectByVisibleText("1995");
		WebElement monthdrop = driver.findElement(By.xpath("//select[@placeholder=\"Month\"]"));
		Select s4 = new Select(monthdrop);
		s4.selectByIndex(10);
		WebElement DayDrop = driver.findElement(By.xpath("//select[@id=\"daybox\"]"));
		Select s5 = new Select(DayDrop);
		s5.selectByValue("23");
		WebElement PasswordElement = driver.findElement(By.id("firstpassword"));
		PasswordElement.sendKeys("Ashok@111");
		WebElement SecondPass = driver.findElement(By.xpath("//input[@id=\"secondpassword\"]"));
		SecondPass.sendKeys("Ashok@111");
		driver.findElement(By.xpath("//button[@id=\"submitbtn\"]")).click();
		
		
	}
}
