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

public class Buttons {

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
		 wd.findElement(By.xpath("//*[@class=\'element-list collapse show\']/ul/li[5]")).click();
		 Thread.sleep(3000);
		 WebElement we = wd.findElement(By.id("doubleClickBtn"));
		 act.doubleClick(we).perform();
		 WebElement we1 = wd.findElement(By.id("rightClickBtn"));
		 act.contextClick(we1).perform();
		 Thread.sleep(3000);
		 //wd.findElement(By.id("bJZ5W")).click();
	     wd.findElement(By.xpath("//*[@class=\'col-12 mt-4 col-md-6\']/div[2]/div[3]/button")).click();
	     Thread.sleep(3000);
	     rb.keyPress(MenuKeyEvent.VK_DOWN);
	     rb.keyPress(MenuKeyEvent.VK_DOWN);
	}
}
