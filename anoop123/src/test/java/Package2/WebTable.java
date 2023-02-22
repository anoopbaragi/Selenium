package Package2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import javax.swing.event.MenuKeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebTable {

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
		 wd.findElement(By.xpath("//*[@class=\'element-list collapse show\']/ul/li[4]")).click();//Radio
		 Thread.sleep(3000);
		 wd.findElement(By.id("edit-record-1")).click();
		 wd.findElement(By.xpath("//*[@ id=\'firstName\']")).clear();
		 wd.findElement(By.xpath("//*[@ id=\'firstName\']")).sendKeys("Anoop");
		 wd.findElement(By.xpath("//*[@ id=\'lastName\']")).clear();
		 wd.findElement(By.xpath("//*[@ id=\'lastName\']")).sendKeys("Baragi");
		 wd.findElement(By.xpath("//*[@ id=\'userEmail\']")).clear();
		 wd.findElement(By.xpath("//*[@ id=\'userEmail\']")).sendKeys("Baragi@gmail.com");
		 wd.findElement(By.xpath("//*[@ id=\'age\']")).clear();	
		 wd.findElement(By.xpath("//*[@ id=\'age\']")).sendKeys("27");
		 wd.findElement(By.xpath("//*[@ id=\'salary\']")).clear();
		 wd.findElement(By.xpath("//*[@ id=\'salary\']")).sendKeys("987987");
		 wd.findElement(By.xpath("//*[@ id=\'department\']")).clear();
		 wd.findElement(By.xpath("//*[@ id=\'department\']")).sendKeys("Tester");
		 Thread.sleep(3000);
		 wd.findElement(By.id("submit")).click();
		 Thread.sleep(5000);
		 wd.findElement(By.id("addNewRecordButton")).click();
		 Thread.sleep(3000);
		 wd.findElement(By.xpath("//*[@ id=\'firstName\']")).sendKeys("Baragi");
		 wd.findElement(By.xpath("//*[@ id=\'lastName\']")).sendKeys("Mysuru");
		 wd.findElement(By.xpath("//*[@ id=\'userEmail\']")).sendKeys("Baragi@gmail.com");
		 wd.findElement(By.xpath("//*[@ id=\'age\']")).sendKeys("27");
		 wd.findElement(By.xpath("//*[@ id=\'salary\']")).sendKeys("987987");
		 wd.findElement(By.xpath("//*[@ id=\'department\']")).sendKeys("Tester");
		 Thread.sleep(3000);
		 wd.findElement(By.id("submit")).click();
		 wd.findElement(By.id("delete-record-1")).click();
		 Thread.sleep(3000);
		 rb.keyPress(MenuKeyEvent.VK_DOWN);
		 rb.keyPress(MenuKeyEvent.VK_DOWN);
	}
}
