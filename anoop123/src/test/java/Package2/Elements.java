package Package2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Elements {

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
		/*wd.findElement(By.xpath("//*[@class=\'element-list collapse show\']/ul/li[2]")).click();//checkbox
		 Thread.sleep(3000);
		 wd.findElement(By.xpath("//*[@class=\'rct-icon rct-icon-uncheck\']")).click();*/
		 wd.findElement(By.xpath("//*[@class=\'element-list collapse show\']/ul/li[3]")).click();//Radio
		 Thread.sleep(3000);
		 //wd.findElement(By.xpath("//*[@id=\'yesRadio\']"));
		 //wd.findElement(By.id("yesRadio")).click();
		 wd.findElement(By.xpath("(//*[@class=\'custom-control-label\'])[1]")).click();
		
	}
}
