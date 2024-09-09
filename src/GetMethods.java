import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		Thread.sleep(5000);
//		System.out.println(driver.getTitle());
		
//		Returns Url of the Page
		System.out.println(driver.getCurrentUrl());
		
//get page source
//		System.out.println(driver.getPageSource());
//		get Window Handle
//		String windowid=driver.getWindowHandle();
//System.out.println("Window ID"+windowid); 
//Window IDB3594A20BE838CB46817F03A4C245F0E
//Window ID36E2D46F8092D367F34D5AC21758F4

driver.findElement(By.linkText("OrangeHRM, Inc")).click();
Set<String> windowids=driver.getWindowHandles();
System.out.println(windowids);
	}

}
