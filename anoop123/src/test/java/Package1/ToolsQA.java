package Package1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import javax.swing.event.MenuKeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolsQA {

	public static void main(String[] args) throws InterruptedException, AWTException 
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
		 Thread.sleep(5000);
		 rb.keyPress(KeyEvent.VK_PAGE_DOWN);
	     rb.keyPress(KeyEvent.VK_PAGE_DOWN);
		 rb.keyPress(KeyEvent.VK_PAGE_DOWN);
		 rb.keyPress(KeyEvent.VK_PAGE_DOWN);
		 Thread.sleep(5000);
		 wd.findElement(By.xpath("(//*[@class=\'header-right\'])[5]")).click();
		 Thread.sleep(5000);
		 rb.keyPress(KeyEvent.VK_PAGE_DOWN);
		 rb.keyPress(KeyEvent.VK_PAGE_DOWN);
		 wd.findElement(By.xpath("(//*[@class=\'btn btn-light \'])[28]")).click();
		 Thread.sleep(3000);
		 //WebElement we= wd.findElement(By.xpath("(//*[@id=\'draggable\'])"));
		 WebElement we = wd.findElement(By.id("draggable"));
		 //WebElement xz=wd.findElement(By.xpath("(//*[@id=\'droppable\'])"));
		 WebElement xz = wd.findElement(By.id("droppable"));
		 Actions ac=new Actions(wd);
		 ac.dragAndDrop(we, xz).perform();
		 Thread.sleep(5000);
		 wd.close();
	}
}







