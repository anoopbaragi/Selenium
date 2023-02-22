package Package2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import javax.swing.event.MenuKeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Links {

	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selenium-java-4.7.0\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		Actions act = new Actions(wd);
		Robot rb = new Robot();
		wd.manage().window().maximize();
		 wd.navigate().to("https://demoqa.com/");
		 //wd.navigate().to("https://demoqa.com/droppable");
		 Thread.sleep(2000);
		 rb.keyPress(KeyEvent.VK_PAGE_DOWN);
		 wd.findElement(By.xpath("(//*[@class=\'card mt-4 top-card\'])[1]")).click();
		 wd.findElement(By.xpath("//*[@class=\'element-list collapse show\']/ul/li[6]")).click();
		 wd.findElement(By.linkText("Home")).click();
		 Thread.sleep(2000);
		 rb.keyPress(MenuKeyEvent.VK_CONTROL);
		 rb.keyPress(MenuKeyEvent.VK_TAB);
		 rb.keyRelease(MenuKeyEvent.VK_CONTROL);
		 /*wd.findElement(By.id("dynamicLink")).click();
		 Thread.sleep(2000);
		 rb.keyPress(MenuKeyEvent.VK_CONTROL);
		 rb.keyPress(MenuKeyEvent.VK_TAB);
		 rb.keyRelease(MenuKeyEvent.VK_CONTROL);*/
		
		 /*****API CALLS********/
		 
		 /*wd.findElement(By.linkText("Created")).click();
		 wd.findElement(By.linkText("No Content")).click();
		 wd.findElement(By.linkText("Moved")).click();
		 wd.findElement(By.linkText("Bad Request")).click();
		 wd.findElement(By.linkText("Unauthorized")).click();
		 wd.findElement(By.linkText("Forbidden")).click();
		 wd.findElement(By.linkText("Not Found")).click();*/
	}
}
