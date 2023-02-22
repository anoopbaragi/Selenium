package Package1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.awt.AWTException;
import java.awt.Robot;

import javax.swing.event.MenuKeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class mousefunc 
{
	WebDriver wd;
	String URL1 = "https://rahulshettyacademy.com/practice-project";
	 @BeforeTest
	  public void beforeTest()
	 {
		 System.setProperty("webdriver.chrome.driver", "C:\\selenium-java-4.7.0\\chromedriver.exe");
		  wd = new ChromeDriver();
		  wd.manage().window().maximize();
		  //wd.navigate().to(URL1);
		  wd.get(URL1);
		
	 }
  @Test
  public void f() throws InterruptedException, AWTException 
  {
	WebElement we = wd.findElement(By.linkText("More"));
	Actions act = new Actions(wd);
	Thread.sleep(6000);
	act.moveToElement(we).build().perform();
	Robot rb = new Robot();
	//rb.keyPress(MenuKeyEvent.VK_PAGE_DOWN);
	//Thread.sleep(3000);
	//rb.keyPress(MenuKeyEvent.VK_PAGE_UP);
	WebElement link = wd.findElement((By.xpath("//*[@class='top-right clearfix']/ul/li/a")));
	act.contextClick(link).build().perform();
  	Thread.sleep(3000);
  	rb.keyPress(MenuKeyEvent.VK_DOWN);
  	rb.keyPress(MenuKeyEvent.VK_ENTER);
  	rb.keyPress(MenuKeyEvent.VK_CONTROL);
  	rb.keyPress(MenuKeyEvent.VK_TAB);
  }
  @AfterTest
  public void afterTest() 
  {
	  
  }

}
