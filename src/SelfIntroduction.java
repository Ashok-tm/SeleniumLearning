import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelfIntroduction {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl()); 
		Thread.sleep(2000);
//		driver.getPageSource();
		System.out.println(driver.getWindowHandle()); 
		Thread.sleep(2000);
		System.out.println(driver.getPageSource());
//		driver.getWindowHandle();
		Thread.sleep(2000);
		driver.manage().window().minimize();
		Thread.sleep(2000);
		driver.navigate().refresh();
		driver.close();

}
}