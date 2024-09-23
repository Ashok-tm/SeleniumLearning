package Selenium_Maven.Maven_TestNg_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MousehoverActions {
	@Test
	public void verifyRightClick() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("demo.guru99.com/testsimple_context_menu.html");
		WebElement btn = driver.findElement(By.xpath("//span[contains(text(),'right click me']"));
		Actions act = new Actions(driver);
		act.click(btn).build().perform();
		
	}
	@Test
	public void verifyDoubleClick() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("demo.guru99.com/testsimple_context_menu.html");
		WebElement dc = driver.findElement(By.xpath("button[@ondblcick=\"myFunction()\"]"));
		Actions act = new Actions(driver);
		act.doubleClick(dc).build().perform();
		
	}
	@Test
	public void verifyDragAndDrop() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("\"https://jquryui.com/droppable/\"");
		driver.switchTo().frame(0);
		WebElement src = driver.findElement(By.id("draggable"));
		WebElement dest = driver.findElement(By.id("droppable"));
		Actions act = new Actions(driver);
		act.dragAndDrop(src, dest).build().perform();
		
	}
	@Test
	public void verifyMovetoElements() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("omayo.blogspot.com");
		WebElement blogs = driver.findElement(By.id("blogsmenu"));
		WebElement thirdlink = driver.findElement(By.xpath("//span[contains(text(),'selenium oneByAron']"));
		Actions act = new Actions(driver);
		act.moveToElement(thirdlink).click().build().perform();
		
	}
}
